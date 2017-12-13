package primes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MainTest {
    private Sieve mock;
    @Before
    public void setUp() throws Exception {
        mock = mock(Sieve.class);
    }

    @Test
    public void runSuccessfulAction(){
        boolean[] wasRun = {false};
        Main sut = new Main(mock,
                x -> {
                    wasRun[0] = true;
                },
                x -> {
                    Assert.fail("Dupa");
                });


        when(mock.isPrime(anyInt())).thenReturn(true);
        sut.run();
        Assert.assertTrue(wasRun[0]);
    }

    @Test
    public void runFailureAction(){
        final boolean[] wasRun = {false};
        Main sut = new Main(mock,
                x -> {
                    Assert.fail("Dupa");
                },
                x -> {
                    wasRun[0] = true;
                });
        when(mock.isPrime(anyInt())).thenReturn(false);
        sut.run();
        Assert.assertTrue(wasRun[0]);
    }

    @Test(expected = AppError.class)
    public void repackageExceptions() throws Exception {
        Main sut = new Main(mock, null, null);
        when(mock.isPrime(anyInt())).thenThrow(new IllegalArgumentException());
        sut.run();
    }

}