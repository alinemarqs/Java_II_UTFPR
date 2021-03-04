package main.semana5;

public class DoisParametros<T,V extends T> {

    T ob1;
    V ob2;

    public DoisParametros(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void mostraTipos() {
        System.out.println("Tipo do T é " + ob1.getClass().getName());
        System.out.println("Tipo do V é " + ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}
