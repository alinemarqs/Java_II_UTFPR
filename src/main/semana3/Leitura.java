package main.semana3;

import java.util.ArrayList;

public class Leitura {

    public static void main(String[] args) {

        ArrayList<Object> cachorro = Empacotamento.lerArquivoBinario("dogzinhos.txt");

        int i = 1;

        for (Object item: cachorro) {
            System.out.printf("\nDozginho Nº....: %d.\n", i++);
            System.out.printf("Nome.........: %s\n", ((Cachorro)item).getNome());
            System.out.printf("Idade.........: %s\n", ((Cachorro)item).getIdade());
            System.out.printf("Peso........:%s\n", ((Cachorro)item).getPeso());
            System.out.printf("............................\n");
        }
    }
}
