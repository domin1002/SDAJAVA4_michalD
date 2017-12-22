import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    private BankAccount account;
    private Lock lock1 = new ReentrantLock();

    public BankAccount() {
        this.balance = 0;
    }

    public void open() {
        this.account = new BankAccount();
    }

    public int getBalance() throws BankAccountActionInvalidException {
        if (this.account == null) throw new BankAccountActionInvalidException("Account closed");
        return balance;
    }

    public void deposit(int i) throws BankAccountActionInvalidException {
        if (i < 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        if (this.account == null) throw new BankAccountActionInvalidException("Account closed");
        lock1.lock();
        this.balance += i;
        lock1.unlock();
    }

    public void withdraw(int i) throws BankAccountActionInvalidException {
        if (this.account == null) throw new BankAccountActionInvalidException("Account closed");
        if (this.balance == 0)
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        else if (i > this.balance)
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        else if (i < 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");

        lock1.lock();
        this.balance -= i;
        lock1.unlock();
    }

    public void close() throws BankAccountActionInvalidException {
        this.account = null;
    }
}
