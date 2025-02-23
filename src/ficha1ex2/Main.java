package ficha1ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso = 0;
        double altura = 0;
        String nome;
        double idade = 0;
        Pessoa pessoa = new Pessoa();
        System.out.println("Insira o primeiro nome da pessoa: ");
        nome = ler.next();
        pessoa.setNome(nome);
        System.out.println("Insira a idade da pessoa: ");
        idade = ler.nextDouble();
        pessoa.setIdade(idade);
        System.out.println("Insira o peso da pessoa: ");
        peso = ler.nextDouble();
        pessoa.setPeso(peso);
        System.out.println("Insira a altura da pessoa: ");
        altura = ler.nextDouble();
        pessoa.setAltura(altura);
        System.out.println(pessoa.toString());

    }
}
