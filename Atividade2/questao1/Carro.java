package questao1;

public class Carro {

    String modelo;
    double velocidade;
    double aceleracao;
    int marcha;
    boolean ligado;

    public Carro(String modelo, double velocidade, double aceleracao, int marcha) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O carro " + this.modelo + " ligou.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O carro " + this.modelo + " desligou.");
    }

    public void acelerar() {
        if (ligado) {
            velocidade = velocidade + aceleracao;
            System.out.println("O carro " + this.modelo + " acelerou.");
            System.out.println("Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro " + this.modelo + " está desligado.");
        }
    }

    public void desacelerar() {
        if (ligado) {
            velocidade = velocidade - aceleracao;

            if (velocidade < 0) {
                velocidade = 0;
            }

            System.out.println("O carro " + this.modelo + " desacelerou.");
            System.out.println("Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro " + this.modelo + " está desligado.");
        }
    }

    public void virarDireita() {
        if (ligado) {
            System.out.println("O carro " + this.modelo + " virou à direita.");
        } else {
            System.out.println("O carro " + this.modelo + " está desligado.");
        }
    }

    public void virarEsquerda() {
        if (ligado) {
            System.out.println("O carro " + this.modelo + " virou à esquerda.");
        } else {
            System.out.println("O carro " + this.modelo + " está desligado.");
        }
    }

    public void marchaCima() {
        marcha++;
        System.out.println("Marcha aumentada para: " + marcha);
    }

    public void marchaBaixo() {
        if (marcha > 0) {
            marcha--;
        }

        System.out.println("Marcha reduzida para: " + marcha);
    }
}