package br.com.dio.desafio.service;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class BootcampService {
    public void inscreverDevNoBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverBootcamp(bootcamp);
    }

    public void progredirDev(Dev dev) {
        dev.progredir();
    }

    public void calcularTotalXpDev(Dev dev) {
        System.out.println("XP Total: " + dev.calcularTotalXp());
    }

    public void listarConteudosInscritos(Dev dev) {
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
    }

    public void listarConteudosConcluidos(Dev dev) {
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
    }
    public void listarDevsEConteudos(Bootcamp bootcamp) {
        System.out.println("Devs e seus conteúdos inscritos no bootcamp " + bootcamp.getNome() + ":");
        for (Dev dev : bootcamp.getDevsInscritos()) {
            System.out.println("Dev: " + dev.getNome());
            System.out.println("  Conteúdos Inscritos: " + dev.getConteudosInscritos());
            System.out.println("  Conteúdos Concluídos: " + dev.getConteudosConcluidos());
        }
    }
}
