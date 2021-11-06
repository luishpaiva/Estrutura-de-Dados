package atividades;

public class AF05 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        for (int i = 0; i < 10; i++) {
            System.out.println("Termo " + (i + 1) + ": " + f.fibonacci(i));
        }
    }
}
