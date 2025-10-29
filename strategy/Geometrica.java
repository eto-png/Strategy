package strategy;

public class Geometrica implements MediaStrategy{
    @Override
    public double calcularMedia(double p1, double p2) {
        double media = Math.sqrt(p1 * p2);
        return media;
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}
