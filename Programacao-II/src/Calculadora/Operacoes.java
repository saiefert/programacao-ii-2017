package Calculadora;

public class Operacoes {

    private double soma;
    private double multiplicacao;
    private double divisao;
    private double subtracao;

    public void setSoma(double num1, double num2){
        this.soma = num1 + num2;
    }

    public double getSoma(){
        return this.soma;
    }

}
