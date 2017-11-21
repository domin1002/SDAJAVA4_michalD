public class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return (int) Math.pow(sum, 2);
    }

    public int computeSumOfSquaresTo(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += (int) Math.pow(j, 2);
        }
        return sum;
    }

    public int computeDifferenceOfSquares(int i) {
        return computeSquareOfSumTo(i) - computeSumOfSquaresTo(i);
    }
}
