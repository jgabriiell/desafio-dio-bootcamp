import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Importancia do Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Decrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        System.out.println("------------------------------------------");
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("------------------------------------------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel " + devGabriel.getConteudosInscritos());

        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-------------------------------------------");
        System.out.println("Conteúdos Inscritos Gabriel " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Gabriel " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());
    }
}