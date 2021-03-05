package TESTE;

import java.util.Scanner;

import REVISAO.Pessoa;

public class TesteRevisao {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in); //OBJETO LEIA
        String nome;
        int anoNascimento, anoAtual;
        char genero;

        System.out.print("Digite o nome do amigo/a: ");
        nome = leia.next();

        //Teste
        Pessoa amigo = new Pessoa(nome);//OBJETO //INSTANCIANDO A CLASSE DE PESSOAS DENTRO DA APLICA��O

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = leia.nextInt();

        System.out.print("Digite  M- Masculino, F-Feminino, O- Outros : ");
        genero = leia.next().toUpperCase().charAt(0);


        Pessoa cliente = new Pessoa(nome, anoNascimento, genero); //Objeto cliente. INSTANCIAR = CRIAR.

        System.out.println("O nome da amizade �: " + amigo.getNome());

        System.out.println("O nome do cliente � : " + cliente.getNome() + "\nSeu ano de nascimento �: " + cliente.getAnoNascimento());

        System.out.println("Seu g�nero �: " + cliente.getGenero());

        System.out.print("Em que ano estamos? ");
        anoAtual = leia.nextInt();

        if (cliente.idade(anoAtual) >= 18) {

            System.out.println("O cliente � adulto.");
            System.out.println("E a idade � " + cliente.idade(anoAtual));

        } else {

            System.out.println("CLIENTE MENOR DE IDADE!!!");
            System.out.println("E a idade � aproximadamente " + cliente.idade(anoAtual));

        }
    leia.close();
    }
}