package application;

import model.entities.Course;
import model.entities.Mentoring;

import java.time.Instant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("curso java", "decrição do curso java", 8);
        Course course2 = new Course("curso js", "descricao do curse js", 8);

        Mentoring mentoring1 = new Mentoring("mentoria java", "descrição mentoria java", Instant.now());
        Mentoring mentoring2 = new Mentoring("mentoria js", "descrição mentoria js", Instant.now());

        System.out.println(course1);
        System.out.println(course2);

        System.out.println(mentoring1);
        System.out.println(mentoring2);
    }
}