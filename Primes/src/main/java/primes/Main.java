package primes;

import java.util.function.IntConsumer;

public class Main {
    private final Sieve sieve;
    private final IntConsumer succes;
    private final IntConsumer failure;

    public static void main(String args[]) {
        new Main(new Sieve(),
                inputNumber -> {
                    System.out.println(inputNumber + "is prime");
                },
                inputNumber -> {
                    System.out.println(inputNumber + "is NOT prime");
                }).run();
    }

    public Main(Sieve sieve, IntConsumer succes, IntConsumer failure) {
        this.sieve = sieve;
        this.succes = succes;
        this.failure = failure;
    }

    void run() {
        int input = 7;
        boolean isPrime;

        try {
            isPrime = sieve.isPrime(input);
        } catch (IllegalArgumentException e) {
            throw new AppError(e);
        }

        if (isPrime) {
            succes.accept(input);
        } else {
            failure.accept(input);
        }
    }
}
