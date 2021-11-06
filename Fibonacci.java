package atividades;

public class Fibonacci {
    public long fibonacci(int elementos) {
        if (elementos < 2) return elementos;
        return fibonacci(elementos - 1) + fibonacci(elementos - 2);
    }
}