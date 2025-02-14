package main;

import model.Comment;
import services.CommentService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Beans;

public class Main {
	public static void main(String[] args) {
		var config = new AnnotationConfigApplicationContext(Beans.class);
		var comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		
		var commentService = config.getBean(CommentService.class);
		commentService.publishComment(comment);
	}
}