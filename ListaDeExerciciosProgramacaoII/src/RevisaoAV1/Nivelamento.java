package RevisaoAV1;

class Ingresso {
    double valor;

    void imprimeValor() {
        System.out.println(valor);
    }
}

class VIP extends Ingresso {
    double valorAdicional;

    void imprimeValor() {
        this.valor = valor + valorAdicional;
    }
}

class Normal extends Ingresso {

    @Override
    void imprimeValor() {
        super.imprimeValor();
    }
}

class CamaroteInferior extends Ingresso {
    int[] localizacao;
    int contador = 0;

    public CamaroteInferior(int numero) {
        localizacao = new int[numero];
    }

    void setLocalizacao(int localizacao) {
        this.localizacao[contador] = localizacao;
        contador++;

        }
    }


public class Nivelamento {

    public static void main(String[] args) {

    }

}

