package pl.sda.java4.primes;

public class AppError extends RuntimeException {
    public AppError(Throwable t){
        super(t);
    }

}
