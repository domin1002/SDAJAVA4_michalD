import java.util.regex.Pattern;

class LargestSeriesProductCalculator {

    private String serialNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber == null) throw
                new IllegalArgumentException("String to search must be non-null.");
        if (Pattern.compile("[^0-9]").matcher(inputNumber).find())
            throw new IllegalArgumentException("String to search may only contain digits.");

        this.serialNumber = inputNumber;
    }


    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > serialNumber.length()) throw
                new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if (numberOfDigits < 0) throw
                new IllegalArgumentException("Series length must be non-negative.");

        long sum=0;
        for (int i=0;i<=serialNumber.length()-numberOfDigits;i++){
            long temp=1;
            for (int j=0;j<numberOfDigits;j++){
                temp*=Integer.parseInt(serialNumber.substring(i+j,i+j+1));
            }
            if (temp>sum){
                sum=temp;
            }
        }
        return sum;
    }
}
