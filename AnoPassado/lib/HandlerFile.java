package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Models.*;

public class HandlerFile {

    public static void createFile(String filename) {
        try {

            File fileObj = new File(filename);

            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {

            System.out.println("An error occurred.");

            e.printStackTrace();
        }
    }


    /*
     * Para criar um arquivo em um diretório específico (requer permissão),
     * especifique o caminho do arquivo e use barras invertidas duplas para escapar
     * o \caractere " " (para Windows).
     * No Mac e Linux, você pode simplesmente escrever o caminho, como:
     * /Users/name/filename.txt
     */


    public static void FileWriter(String filename, String msg) {
        try {

            FileWriter myWriter = new FileWriter(filename);

            myWriter.write(msg);

            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    /*
     * public static void FileWriterArray(String filename, ArrayList<String>
     * listaCarro) {
     * try {
     * 
     * FileWriter myWriter = new FileWriter(filename);
     * 
     * myWriter.write("Lista: " + listaCarro);
     * 
     * myWriter.close();
     * 
     * System.out.println("Successfully wrote to the file.");
     * 
     * } catch (IOException e) {
     * System.out.println("An error occurred.");
     * e.printStackTrace();
     * }
     * }
     */


    public static void FileWriter(String filename, ArrayList<Ghost> phantoms) {
        try {

            FileWriter myWriter = new FileWriter(filename);

            for (Ghost p : phantoms) {
                myWriter.write(p.ReturnNameGhost() + "\n");
                myWriter.write("Strengh: " + p.ReturnStrength() + "\n");
                myWriter.write("Size: " + p.toString() + "\n");
            }

            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static boolean fileExists(String filename) {
        File myObj = new File(filename);
        return myObj.exists();
    }


    public static void GetFileInfo() {

        File myObj = new File("arquivo.txt");

        if (myObj.exists()) {
            System.out.println("_____________________________________");
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
            System.out.println("_____________________________________");
        } else {
            System.out.println("The file does not exist.");
        }
    }


    public static void deleteFile(String filename) {

        File myObj = new File(filename);
        File myPath = new File(myObj.getAbsolutePath());

        if (myPath.delete()) {
            System.out.println("Deleted the file: " + myPath.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }


    public static void ReadFile(String filename) {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }


    public static ArrayList<Ghost> ReadFileA(String filename, ArrayList<Ghost> phantoms) {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            
            ArrayList<Ghost> retorno = new ArrayList<>();

            while (myReader.hasNextInt()) {
                Ghost g = new Ghost();
                g.ReadName(myReader.next());
                g.ReadStrengh(myReader.nextInt());
                g.ReadSize(myReader.nextInt());
                retorno.add(g);
            }

        
            myReader.close();
            
            return retorno;

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    
        return null;
    }


}
