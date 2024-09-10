package Biblioteca;

public class Ordenacao {

    public static int[] Bublle(int[] vetor, int lim_Sup){
        int i = 0;
        int sub = 0;

        while(i<lim_Sup) {
            if (vetor[i]>vetor[i+1]) {

                sub = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = sub;

            }
            i++;
        }

        if (lim_Sup > 0) {
            Bublle(vetor, lim_Sup-1);
        }

        return vetor;
    }

    public static int[] Insertion(int[] vetor){
        int lim_Sup = vetor.length-1;
        int i = 1;
        int sub = 0;

        while(i<=lim_Sup) {
            int j = i;
                while(j > 0 && vetor[j]<vetor[j-1]) {
                    sub = vetor[j];
                    vetor[j] = vetor[j-1];
                    vetor[j-1] = sub;  
    
                    j--;
                }
            i++;
        }

        return vetor;
    }

    public static int[] Selection(int[] vetor){
        int lim_Sup = vetor.length-1;
        int i = 0;
        int sub = 0;
        int menor = vetor[i];
        int posicao = 0;
        int j = i;

        while(j<=lim_Sup) {
            if (vetor[j]<menor) {
                menor = vetor[j];
                posicao = j;
            }
            j++;
        }       

        if (posicao>=i) {
            sub = vetor[i];
            vetor[i] = vetor[posicao];
            vetor[posicao] = sub;            
        }

        if (i<lim_Sup-1) {
            i++;
            Selection(vetor);
        }
        
        return vetor;
    }
}
