package org.example;

import org.example.configuration.ProjectConfiguration;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;


public class Main {

    //private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        ApplicationContext  c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();

        comment.setText("DEMO");
        comment.setAuthor("AUTHOR1");
        String value = service.publischComment(comment);


    }
}