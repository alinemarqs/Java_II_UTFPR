package main.semana5;

public class TestaMeuGenerico {
    public static void main(String[] args) {

        Gen gen1 = new Gen();

        System.out.println(gen1.meuGenerico("Teste1"));

        System.out.println(gen1.meuGenerico(123));

    }
}
