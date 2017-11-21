class NaturalNumber {

    int number;

    public NaturalNumber(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = n;
    }


    public Classification getClassification() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }

        if (number == sum) return Classification.PERFECT;
        else if (number < sum) return Classification.ABUNDANT;
        else return Classification.DEFICIENT;
    }
}
