package Atividade6.questao3;

public class App {

    public static void main(String[] args) {

        Funcionarios p = new Professor(1,"João",3000,20,50);

        Funcionarios t = new Tecnico(2,"Maria",2500,500);

        Funcionarios c = new Coordenador(3,"Carlos",5000,1200);

        System.out.println(p.getNome() + ": R$ " + p.calcularSalario());

        System.out.println(t.getNome() + ": R$ " + t.calcularSalario());

        System.out.println(c.getNome() + ": R$ " + c.calcularSalario());

    }

}