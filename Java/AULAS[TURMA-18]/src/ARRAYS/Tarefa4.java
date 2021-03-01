package ARRAYS;

import java.util.Random;

public class Tarefa4 {

    public static void main(String[] args) {

        int N1[][] = new int[4][6];
        int N2[][] = new int[4][6];
        int M1[][] = new int[4][6]; 
        int M2[][] = new int[4][6];

        Random dados = new Random();
        final int LINHA=4, COLUNA=6;
        int l=0, c=0;

        for (l = 0; l<LINHA; l++) {
            for (c = 0; c<COLUNA; c++) {
                N1[l][c]=dados.nextInt(9)+1;
                N2[l][c]=dados.nextInt(9)+1;
                M1[l][c]= N1[l][c]+N2[l][c];
                M2[l][c]= N1[l][c]-N2[l][c];

            }
        }
        System.out.println(" --------------------------------------------");
        System.out.println("               MATRIZ [N1]:                  ");
        System.out.println(" --------------------------------------------");
        for (l = 0; l<LINHA; l++)    {
            for (c = 0; c<COLUNA; c++) {
                System.out.printf("[ %d ]\t",N1[l][c]);

            }
            System.out.println();
        }

        System.out.println(" --------------------------------------------");
        System.out.println("               MATRIZ [N2]:                  ");
        System.out.println(" --------------------------------------------");
        for (l = 0; l<LINHA; l++)    {
            for (c = 0; c<COLUNA; c++) {
                System.out.printf("[ %d ]\t",N2[l][c]);

            }
            System.out.println();
        }
        System.out.println(" --------------------------------------------");
        System.out.println("               MATRIZ [M1]:                  ");
        System.out.println(" --------------------------------------------");

        for (l = 0; l<LINHA; l++)    {
            for (c = 0; c<COLUNA; c++) {
                System.out.printf("[ %d ]\t",M1[l][c]);

            }
            System.out.println();
        }

        System.out.println(" --------------------------------------------");
        System.out.println("               MATRIZ [M2]:                  ");
        System.out.println(" --------------------------------------------");
        for (l = 0; l<LINHA; l++)    {
            for (c = 0; c < COLUNA; c++) {
                System.out.printf("[ %d ]\t",M2[l][c]);

            }
            System.out.println();
        }
    }

}