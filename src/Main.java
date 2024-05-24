import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.service.BootcampService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BootcampService bootcampService = new BootcampService();
        
        // Criar conteúdos
        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4);
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        // Criar bootcamp e adicionar conteúdos
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criar desenvolvedores
        Dev devCamila = new Dev("Camila");
        Dev devJoao = new Dev("Joao");

        // Inscrever desenvolvedores no bootcamp
        bootcampService.inscreverDevNoBootcamp(devCamila, bootcamp);
        bootcampService.inscreverDevNoBootcamp(devJoao, bootcamp);

        // Progredir e exibir informações de devCamila
        bootcampService.progredirDev(devCamila);
        bootcampService.progredirDev(devCamila);
        bootcampService.listarConteudosInscritos(devCamila);
        bootcampService.listarConteudosConcluidos(devCamila);
        bootcampService.calcularTotalXpDev(devCamila);

        System.out.println("-------");

        // Progredir e exibir informações de devJoao
        bootcampService.progredirDev(devJoao);
        bootcampService.progredirDev(devJoao);
        bootcampService.progredirDev(devJoao);
        bootcampService.listarConteudosInscritos(devJoao);
        bootcampService.listarConteudosConcluidos(devJoao);
        bootcampService.calcularTotalXpDev(devJoao);

        System.out.println("-------");

        // Listar desenvolvedores e seus conteúdos inscritos e concluídos
        bootcampService.listarDevsEConteudos(bootcamp);
    }
}
