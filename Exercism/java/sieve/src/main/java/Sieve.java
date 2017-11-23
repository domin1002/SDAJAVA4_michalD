import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sieve {
    private int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> primesList = new ArrayList<>();
        int[] tab = new int[maxPrime + 1];
        int sqrt = (int) Math.floor(Math.sqrt(maxPrime));
        for (int i = 0; i <= maxPrime; i++) {
            tab[i] = i;
        }

        for (int i = 2; i <= sqrt; i++) {
            if (tab[i] != 0) {
                int temp = tab[i];
                for (int j = temp + temp; j < tab.length; j += temp) {
                    tab[j] = 0;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0 && tab[i] > 1) {
                primesList.add(tab[i]);
            }
        }

        return primesList;
    }
}
