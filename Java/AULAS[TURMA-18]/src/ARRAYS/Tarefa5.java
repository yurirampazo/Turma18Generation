package ARRAYS;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String [][] agenda  = new String [24][31];
		int dia = 0;
		int hora = 0;
		char opcao = 'S';
		int atividades = 0;
		
        do {
			System.out.println("Minha agenda\n");
		    System.out.print("Digite o numero do dia [1-31]");
		    dia = leia.nextInt();
		    leia.nextLine();
		    dia = dia - 1;
           System.out.print("Digite o numero da hora [0-23]");
            hora = leia.nextInt();
            leia.nextLine();
            System.out.print("Digite sua anotacao: ");
            agenda[hora][dia] = leia.nextLine();
         

            System.out.print("Desenja continuar? [S] - Sim / [N] - Nao");
            opcao = leia.nextLine().toUpperCase().charAt(0);

			}while(opcao == 'S');

		    for (int i = 0; i < agenda.length; i++){
				for(int j = 0; j < agenda[i].length; j++){
					if (agenda[i][j] != null) {
						System.out.println("Minhas anotacoes: "+ (i + 1) +" as "+ (j + 1) +"h : "+ agenda[i][j]);
		                atividades++;
		            }
		        }
		    }

		        System.out.println("Voce tem " + atividades + " atividades nesse mês.");
	leia.close();
	}

}
