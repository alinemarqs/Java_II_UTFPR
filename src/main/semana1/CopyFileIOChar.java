package main.semana1;

import java.io.*;

public class CopyFileIOChar {
    public static void main(String[] args) {

        String s;

        try (
                FileWriter fw = new FileWriter("semana1_arquivo_hifen_char.txt");
                BufferedReader br = new BufferedReader(new FileReader("semana1_arquivo_espaco.txt")))
        {
            while((s = br.readLine()) != null) {
                fw.write(s.replaceAll(" ", "-"));
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
