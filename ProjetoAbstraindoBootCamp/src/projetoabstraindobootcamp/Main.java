package projetoabstraindobootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando os conteúdos (cursos e mentoria)
        Curso cursoJava = new Curso("Curso de Java", "Aprenda Java do zero", 40);
        Curso cursoJS = new Curso("Curso de JavaScript", "Construa aplicações web com JS", 30);
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Tire suas dúvidas sobre Java", LocalDate.of(2024, 6, 14));

        // Criando o bootcamp e adicionando os conteúdos
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Aprenda Java e desenvolva suas habilidades");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJS);
        bootcamp.adicionarConteudo(mentoriaJava);

        // Criando os desenvolvedores
        Dev devCamila = new Dev("Camila");
        Dev devJoao = new Dev("João");

        // Inscrito os desenvolvedores no bootcamp
        devCamila.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp);

        // Progresso dos desenvolvedores
        devCamila.progredir(cursoJava);
        devCamila.progredir(cursoJS);
        devCamila.progredir(mentoriaJava);

        devJoao.progredir(cursoJava);
        devJoao.progredir(cursoJS);

        // Exibindo informações sobre os desenvolvedores
        System.out.println("Desenvolvedor: " + devCamila.getNome());
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Total: " + devCamila.calcularTotalXp());
        System.out.println("-------------------------");
        System.out.println("Desenvolvedor: " + devJoao.getNome());
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total: " + devJoao.calcularTotalXp());
    }
}

