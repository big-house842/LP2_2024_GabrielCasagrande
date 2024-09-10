package Biblioteca;

public class Ordenacao {

    
    public static int[] Bublle(int[] vetor){
        return doBublle(vetor, vetor.length-1);
    }

    private static int[] doBublle(int[] vetor, int lim_Sup){
        int sub = 0;
        int i = 0;

        while(i<lim_Sup) {
            if (vetor[i]>vetor[i+1]) {

                sub = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = sub;

            }
            i++;
        }

        if (lim_Sup > 0) {
            doBublle(vetor, lim_Sup-1);
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
        return doSelection(vetor, 0);
    }

    private static int[] doSelection(int[] vetor, int i){
        int lim_Sup = vetor.length-1;
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
            doSelection(vetor, i+1);
        }
        
        return vetor;
    }

    public static void Merge(int[] vetor){
        doMerge(vetor, 0, vetor.length-1);
    }

    private static void doMerge(int[] vetor, int lim_Inf, int lim_Sup) {

        if (lim_Inf < lim_Sup) {
            int metade = (lim_Inf + lim_Sup) / 2;
            
            doMerge(vetor, lim_Inf, metade); // Primeira metade
            doMerge(vetor, metade + 1, lim_Sup); // Segunda metade
            
            organizarMerge(vetor, lim_Inf, metade, lim_Sup); // Realiza o merge
        }

    }

    private static void organizarMerge(int[] vetor, int lim_Inf, int metade, int lim_Sup) {
        int i = lim_Inf;
        int j = metade + 1;
        int k = 0;
    
        int[] vetorAux = new int[lim_Sup - lim_Inf + 1];
    
        // Merge dos dois subvetores em vetorAux
        while (i <= metade && j <= lim_Sup) {
            if (vetor[i] <= vetor[j]) {
                vetorAux[k] = vetor[i];
                i++;
            } else {
                vetorAux[k] = vetor[j];
                j++;
            }
            k++;
        }
    
        // Copiar o restante dos elementos do subvetor da primeira metade, se houver
        while (i <= metade) {
            vetorAux[k] = vetor[i];
            i++;
            k++;
        }
    
        // Copiar o restante dos elementos do subvetor da segunda metade, se houver
        while (j <= lim_Sup) {
            vetorAux[k] = vetor[j];
            j++;
            k++;
        }
    
        // Copiar os elementos de vetorAux de volta para o vetor original
        for (int j2 = 0; j2 < vetorAux.length; j2++) {
            vetor[lim_Inf + j2] = vetorAux[j2];
        }

    }

    public static int Quick(int[] vetor){

    }
}
