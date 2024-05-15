import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        course.setTittle("Java");
        course.setDescription("Learning Java");
        course.setStudyLoad(30);

        Course course2 = new Course();
        course2.setTittle("Js course");
        course2.setDescription("Js course Description");
        course2.setStudyLoad(20);

        Mentoring mentoria = new Mentoring();
        mentoria.setTittle("Importance of Java");
        mentoria.setDescription("Java mentoring description");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Bootcamp Java Developer description");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setName("Jon");
        devJoao.registerBootcamp(bootcamp);
        System.out.println("Registered contents Jon " + devJoao.getRegisteredContents());

        devJoao.progress();
        devJoao.progress();
        System.out.println("------------------------------------------");
        System.out.println("Registered contents Jon " + devJoao.getRegisteredContents());
        System.out.println("Completed contents Jon " + devJoao.getCompletedContents());
        System.out.println("XP: " + devJoao.calculateXpTotal());

        System.out.println("------------------------------------------");

        Dev devGabriel = new Dev();
        devGabriel.setName("Gabriel");
        devGabriel.registerBootcamp(bootcamp);
        System.out.println("Registered contents Gabriel " + devGabriel.getRegisteredContents());

        devGabriel.progress();
        devGabriel.progress();
        devGabriel.progress();
        System.out.println("-------------------------------------------");
        System.out.println("Registered contents Gabriel " + devGabriel.getRegisteredContents());
        System.out.println("Completed contents Gabriel " + devGabriel.getCompletedContents());
        System.out.println("XP: " + devGabriel.calculateXpTotal());
    }
}