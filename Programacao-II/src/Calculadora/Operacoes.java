package Calculadora;

public class Operacoes {

    private double soma;
    private double multiplicacao;
    private double divisao;
    private double subtracao;
    private double num1, num2;

    public void setNum1(double num1){
        this.num1 = num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double getSoma(){
        return this.soma;
    }

}
