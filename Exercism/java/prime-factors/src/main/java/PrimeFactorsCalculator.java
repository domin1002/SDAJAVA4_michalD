import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {
    public List<Long> calculatePrimeFactorsOf(long input) {
        List<Long> list = new ArrayList<>();
        if(input <= 1) return list;
        long value = input;
        long factors = 2;

        while(value > 1){
            if(value%factors == 0){
                value = value / factors;
                list.add(factors);
            } else factors++;
        }
        return list;
    }
}
