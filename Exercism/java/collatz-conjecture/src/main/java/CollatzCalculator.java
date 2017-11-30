class CollatzCalculator {

    int computeStepCount(int start) {
        int index = 0;
        if (start <= 0) throw new IllegalArgumentException("Only natural numbers are allowed");

        while (start > 1) {
            if (start % 2 == 0) {
                start = start / 2;
                index++;
            } else {
                start = start * 3 + 1;
                index++;
            }
        }
        return index;
    }
}
