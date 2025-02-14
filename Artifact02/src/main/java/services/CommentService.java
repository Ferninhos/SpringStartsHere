package services;
import org.springframework.stereotype.Component;

//usa serviços dentro do app(tipo objetos)
import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	public CommentService (
			CommentRepository commentRepository,
			CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}