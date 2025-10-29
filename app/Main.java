package app;

import model.Disciplina;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE COM ARITMÉTICA ===");
        testarEstrategia(new Aritmetica());

        System.out.println("\n=== TESTE COM GEOMÉTRICA ===");
        testarEstrategia(new Geometrica());

    }

    private static void testarEstrategia(MediaStrategy estrategia) {
        Disciplina d = new Disciplina(estrategia);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}