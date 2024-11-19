package Biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Modelos.Cachorro;

public class ArquivoTxt {

  public static void CriarArquivo(String arquivo) {// Cria o arquivo

    try {

      File fileObj = new File(arquivo + ".txt");

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

  public static void ConcatenarArquivo() {

  }
  /*
   * Para criar um arquivo em um diretório específico (requer permissão),
   * especifique o caminho do arquivo e use barras invertidas duplas para escapar
   * o \caractere " " (para Windows).
   * No Mac e Linux, você pode simplesmente escrever o caminho, como:
   * /Users/name/filename.txt
   */

  public static void GravarMensagem(String arquivo, ArrayList<Cachorro> dogs) {// Grava uma mensagem no arquivo

    System.out.println("Escreva a mensagem que quer gravar no arquivo: ");
    String msg = Receba.LerString();
    System.out.println();

    try {

        FileWriter myWriter = new FileWriter(arquivo+".txt"); // LEITOR DE TEXTO


        myWriter.write(msg + "\n"); // Adiciona a mensagem, seguida de uma nova linha

        
        for (Cachorro dog : dogs) { // Grava as informações dos cachorros
            myWriter.write(dog.toString() + "\n");
        }

        myWriter.close();
        System.out.println("A mensagem e os dados dos cachorros foram gravados no arquivo ;)");

    } catch (IOException e) {
        System.out.println("Um erro ocorreu");
        e.printStackTrace();
    }
    

  }

  public static void mostrarInformacoes(String arquivo) {// Mostra as informações do arquivo

    File myObj = new File(arquivo+".txt");

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

  public static void deletarArquivo(String arquivo) {// deleta o arquivo

    File myObj = new File(arquivo);

    if (myObj.delete()) {
      System.out.println("Arquivo deletado: " + myObj.getName());
    } else {
      System.out.println("Erro ao excluir o arquivo ");
    }

  }

}

// Falta o carregar os dados do arquivo para a lista