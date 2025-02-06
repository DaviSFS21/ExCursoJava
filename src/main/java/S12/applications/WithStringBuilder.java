package S12.applications;

import S12.entites.Comment;
import S12.entites.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class WithStringBuilder {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        Post p1 = new Post(sdf.parse("05/02/2025 23:10:59"),
                "Aston Martin V12", "that looks fast",8);
        Post p2 = new Post(sdf.parse("21/10/2005 13:21:45"),
                "yoo", "davi's conception",1000);

        p1.addComment(new Comment("a lot of HPs"));
        p1.addComment(new Comment("woohoo"));
        p2.addComment(new Comment("hello world"));
        p2.addComment(new Comment("sim"));

        System.out.printf(p1.toString());
        System.out.println();
        System.out.printf(p2.toString());
    }
}
