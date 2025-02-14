package proxies;

import model.Comment;

//trabalha com coisas fora do app(email)
public interface CommentNotificationProxy {
	void sendComment(Comment comment);
}