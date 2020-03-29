package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		Comment c = new Comment("Have a nice trip");
		post.getComments().add(c);
		
		c = new Comment("Wow that's awesome!");
		post.getComments().add(c);
		
		System.out.println(post);
		
		post = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		c = new Comment("Good night");
		post.getComments().add(c);
		c = new Comment("May the Force be with you");
		post.getComments().add(c);
		
		System.out.println(post);
	}

}
