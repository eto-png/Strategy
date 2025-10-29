package app;

import model.Disciplina;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        /*teste individual*/
        MediaStrategy estrategia = new Aritmetica();
        Disciplina d = new Disciplina(estrategia);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());

        /*teste com ambos*/
        System.out.println("\n=== TESTE COM ARITMÉTICA ===");
        testarEstrategia(new Aritmetica());

        System.out.println("\n=== TESTE COM GEOMÉTRICA ===");
        testarEstrategia(new Geometrica());

    }

    private static void testarEstrategia(MediaStrategy estrategia) {
        Disciplina e = new Disciplina(estrategia);
        e.setNome("Padrões de Desenvolvimento");
        e.setP1(10);
        e.setP2(5);
        e.calcularMedia();
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                e.getP1(), e.getP2(), e.getMedia(), e.getSituacao());
    }
}