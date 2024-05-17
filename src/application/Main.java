package application;

import model.entities.*;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Course curso1 = new Course("curso java", "descrição curso java", 8);
        Course curso2 = new Course("curso js", "descrição curso js", 4);

        Mentoring mentoria = new Mentoring("mentoria de java", "descrição mentoria java", Instant.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");

        bootcamp.getContentSet().add(curso1);
        bootcamp.getContentSet().add(curso2);
        bootcamp.getContentSet().add(mentoria);

        Developer devCamila = new Developer("Camila");
        devCamila.subscribe(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribeContent());
        devCamila.progress();
        devCamila.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribeContent());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getFineshedContent());
        System.out.println("XP:" + devCamila.calcTotalXP());

        System.out.println("-------");

        Developer devJoao = new Developer("Joao");
        devJoao.subscribe(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribeContent());
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribeContent());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getFineshedContent());
        System.out.println("XP:" + devJoao.calcTotalXP());
    }
}