package main.semana3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gravacao {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        Integer dogIdade = 0;
        double dogPeso = 0;
        String dogNome = null;

        ArrayList<Object> cachorro = Empacotamento.lerArquivoBinario("dogzinhos.txt");

        while (true) {

            System.out.printf("Informe o nome do Dogzinho, FIM para encerrar:\n");
            dogNome = ler.nextLine();
            if (dogNome.equalsIgnoreCase("FIM"))
                break;

            System.out.printf("\nInforme a idade do Dogzinho...............: ");
            dogIdade = ler.nextInt();

            System.out.printf("Informe o peso do Dozinho: ");
            dogPeso = ler.nextDouble();

            cachorro.add(new Cachorro(dogIdade,dogPeso,dogNome));

            ler.nextLine();
            System.out.printf("\n");
        }

        Empacotamento.gravarArquivoBinario(cachorro, "dogzinhos.txt");
    }
}
