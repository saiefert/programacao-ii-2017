package Calculadora;

public class Operacoes {

    public static double raiz;
    private static double soma;
    private static double multiplicacao;
    private static double divisao;
    private static double subtracao;
    private static double num1, num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getSoma() {
        soma = this.num1 + this.num2;
        return soma;
    }

    public double getDivisao() {
        divisao = (this.num1 / this.num2);
        return divisao;
    }

    public double getMultiplicacao() {
        multiplicacao = this.num1 * this.num2;
        return multiplicacao;
    }

    public double getSubtracao() {
        subtracao = this.num1 - this.num2;
        return subtracao;
    }

    public void raizQuadrada() {
        raiz = Math.sqrt(num1);
    }
}

