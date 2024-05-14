import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Java");
        curso.setDescricao("Aprendendo Java");
        curso.setCargaHoraria(80);
        System.out.println(curso);

        mentoria.setTitulo("Importancia da lógica");
        mentoria.setDescricao("Entendendo lógica de programação");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}