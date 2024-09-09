package Biblioteca;

import java.util.Random;
import java.util.Scanner;

public class Receba {
    final static Scanner LER = new Scanner(System.in);
    final static Random GERADOR = new Random();
    
    public static int[][] Matriz(int x, int y){
        int[][] matriz = new int[x][y];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = LER.nextInt();
            }
        }

        return matriz;
    }

    public static int[] Vetor(int x){
        int[] vetor = new int[x];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = LER.nextInt();
        }

        return vetor;
    }

    public static int Num(){
        return LER.nextInt();
    }
}
