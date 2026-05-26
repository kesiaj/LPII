package questao2;

public class Televisao {

    int tamanhoTela;
    int volume;
    String marca;
    int voltagem;
    int canal;
    boolean ligada;

    public Televisao(int tamanhoTela, String marca, int voltagem, int canal) {
        this.tamanhoTela = tamanhoTela;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
        ligada = false;
    }

    public void ligar() {
        ligada = true;

        int consumo = voltagem * tamanhoTela;

        System.out.println("A televisão " + this.marca + " ligou.");
        System.out.println("Consumo: " + consumo);
    }

    public void desligar() {
        ligada = false;
        System.out.println("A televisão " + this.marca + " desligou.");
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
        }

        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume() {
        if (volume > 1) {
            volume--;
        }

        System.out.println("Volume atual: " + volume);
    }

    public void subirCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void descerCanal() {
        if (canal > 1) {
            canal--;
        }

        System.out.println("Canal atual: " + canal);
    }
}