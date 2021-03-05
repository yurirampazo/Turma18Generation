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
        Pessoa amigo = new Pessoa(nome);//OBJETO //INSTANCIANDO A CLASSE DE PESSOAS DENTRO DA APLICAÇÃO

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = leia.nextInt();

        System.out.print("Digite  M- Masculino, F-Feminino, O- Outros : ");
        genero = leia.next().toUpperCase().charAt(0);


        Pessoa cliente = new Pessoa(nome, anoNascimento, genero); //Objeto cliente. INSTANCIAR = CRIAR.

        System.out.println("O nome da amizade é: " + amigo.getNome());

        System.out.println("O nome do cliente é : " + cliente.getNome() + "\nSeu ano de nascimento é: " + cliente.getAnoNascimento());

        System.out.println("Seu gênero é: " + cliente.getGenero());

        System.out.print("Em que ano estamos? ");
        anoAtual = leia.nextInt();

        if (cliente.idade(anoAtual) >= 18) {

            System.out.println("O cliente é adulto.");
            System.out.println("E a idade é " + cliente.idade(anoAtual));

        } else {

            System.out.println("CLIENTE MENOR DE IDADE!!!");
            System.out.println("E a idade é aproximadamente " + cliente.idade(anoAtual));

        }
    leia.close();
    }
}