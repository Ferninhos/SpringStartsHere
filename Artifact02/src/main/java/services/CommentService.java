package services;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//usa serviços dentro do app(tipo objetos)
import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Service
public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	public CommentService (
			CommentRepository commentRepository,
			@Qualifier("Push") CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}