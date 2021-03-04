package main.semana1B;

/*Author: Aline Marques da Silva*/

import java.io.*;

public class ExercicioB2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String arquivo = "";

        System.out.println("Informe o nome do arquivo.txt:");
        arquivo = br.readLine();

        if (!arquivo.isEmpty()) {
            System.out.println("Informe os elementos do arquivo, para finalizar digite EXIT");

            try (FileWriter fw = new FileWriter(arquivo)) {
                do {
                    str = br.readLine();
                    if (!str.equals("EXIT")) {
                        fw.write(str + "\n");
                    }
                } while(!str.equals("EXIT"));

            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            }

        } else {
            System.out.println("Nome do arquivo não informado!");
        }
    }
}
