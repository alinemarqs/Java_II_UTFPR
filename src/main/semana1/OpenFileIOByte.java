package main.semana1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenFileIOByte {

    public static void main(String[] args) {

        int i = 0;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Mostra Arquivo"); //Verifica se o arquivo foi especificado
        }

        try{
            fin = new FileInputStream("Teste.txt"); //Abre o arquivo
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }

        try{
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Erro ao fechar o arquivo");
        }
    }
}
