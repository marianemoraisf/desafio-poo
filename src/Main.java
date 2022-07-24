import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Mariane");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mariane: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mariane: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mariane: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
