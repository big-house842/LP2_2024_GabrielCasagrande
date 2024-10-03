package Biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTxt {

    public static void criarArquivo() {// Cria o arquivo

      System.out.println(" Digite o nome do arquivo: ");
      System.out.println("    ");
      String filename = Receba.LerString();
      System.out.println();

        try {

            File fileObj = new File(filename + ".txt");

            if (fileObj.createNewFile()) {
                System.out.println("Arquivo criado: " + fileObj.getName());
            } else {
                System.out.println("O arquivo já existe ");
            }

        } catch (IOException e) {

            System.out.println("Um erro ocorreu ");

            e.printStackTrace();
        }
    }

    public static void concatenarArquivo(){

    }
    /*
     * Para criar um arquivo em um diretório específico (requer permissão),
     * especifique o caminho do arquivo e use barras invertidas duplas para escapar
     * o \caractere " " (para Windows).
     * No Mac e Linux, você pode simplesmente escrever o caminho, como:
     * /Users/name/filename.txt
     */

    public static void GravarMensagem() {// Grava uma mensagem no arquivo

      System.out.println("Escreva a mensagem que quer gravar no arquivo: ");
      System.out.println("    ");
      String msg = Receba.LerString();
      System.out.println();

        try {

            FileWriter myWriter = new FileWriter("arquivo.txt");

            myWriter.write(msg);

            myWriter.close();

            System.out.println(" A mensagem está no arquivo ;)");

        } catch (IOException e) {
            System.out.println("Um erro ocorreu");
            e.printStackTrace();
        }
    }

    public static void mostrarInformacoes() {// Mostra as informações do arquivo

        File myObj = new File("arquivo.txt");
    
        if (myObj.exists()) {
        System.out.println("_____________________________________");
          System.out.println("Nome do arquivo: " + myObj.getName());
          System.out.println("Caminho absoluto: " + myObj.getAbsolutePath());
          System.out.println("Gravável: " + myObj.canWrite());
          System.out.println("Legível: " + myObj.canRead());
          System.out.println("Tamanho em bytes: " + myObj.length());
          System.out.println("_____________________________________");
        } else {
          System.out.println(" O arquivo não existe ");
        }
      }

      public static void deletarArquivo() {// deleta o arquivo

        System.out.println("Escreva a mensagem que quer deletar no arquivo: ");
        System.out.println("    ");
        String path = Receba.LerString();
        System.out.println();

        File myObj = new File(path);
    
        if (myObj.delete()) {
          System.out.println("Arquivo deletado: " + myObj.getName());
        } else {
          System.out.println("Erro ao excluir o arquivo ");
        }
    
      }
    

}