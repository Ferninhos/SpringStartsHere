package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import model.Comment;

@Component
@Qualifier("Push")
public class Push implements
	CommentNotificationProxy {
	
	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending push: " + comment.getText());
	}
}
