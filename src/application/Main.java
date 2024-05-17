package application;

import model.entities.Content;
import model.entities.Course;
import model.entities.Mentoring;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Content course1 = new Course("curso java", "decrição do curso java", 8);
        Content course2 = new Course("curso js", "descricao do curse js", 8);

        Content mentoring1 = new Mentoring("mentoria java", "descrição mentoria java", Instant.now());
        Content mentoring2 = new Mentoring("mentoria js", "descrição mentoria js", Instant.now());

        System.out.println(course1);
        System.out.println(course2);

        System.out.println(mentoring1);
        System.out.println(mentoring2);
    }
}