package main.semana1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CopyFileIOByte {
    public static void main(String[] args) throws IOException {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        char c = 0;

        if(args.length != 2) {
            System.out.println("CopyFile from to");
        }
        try {
            fin = new FileInputStream("semana1_arquivo_espaco.txt");
            fout = new FileOutputStream("semana1_arquivo_hifen.txt");
            do {
                i = fin.read();
                c = (char) i;
                if (i != -1) {
                    String test = String.valueOf(c).replaceAll(" ","-");
                    fout.write(test.getBytes(StandardCharsets.UTF_8));
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error Closing Input File");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
