import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreveBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lucas: "+ devLucas.getConteudosInscritos());

        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteudos inscritos Lucas: "+ devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluídos Lucas: "+ devLucas.getConteudosConcluidos());
        System.out.println("XP: " +devLucas.calcularXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreveBootcamp(bootcamp);
        devJoao.inscreveBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluídos João: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: " +devJoao.calcularXp());

    }
}