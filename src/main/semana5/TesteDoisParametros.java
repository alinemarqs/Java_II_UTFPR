package main.semana5;

public class TesteDoisParametros {

    public static void main(String[] args) {

        var tgObj = new DoisParametros<Integer, Integer>(12, 20);

        tgObj.mostraTipos();

        int v = tgObj.getOb1();

        System.out.println("valor num: " + v);

        int t = tgObj.getOb2();

        System.out.println("valor numT: " + t);
    }
}
