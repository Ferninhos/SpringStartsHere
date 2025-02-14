package repositories;
//trabalha direto com a database

import model.Comment;

public interface CommentRepository {
	void storeComment(Comment comment);
}
