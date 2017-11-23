
class Matrix {

    private int[][] tab;

    Matrix(String matrixAsString) {

        /**
         *  i/j [0][1][2]
         * [0] | 1  2  3
         * [1] | 4  5  6
         * [2] | 7  8  9
         */
        String[] line = matrixAsString.split("\\n");
        tab = new int[line.length][];

        for (int i = 0; i < tab.length; i++) {
            String[] row = line[i].split("\\s");
            tab[i] = new int[row.length];
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = Integer.parseInt(row[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return tab[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            column[i] = tab[i][columnNumber];
        }
        return column;
    }

    int getRowsCount() {
        return tab.length;
    }

    int getColumnsCount() {
        int columns = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length > columns)
                columns = tab[i].length;
        }
        return columns;
    }
}
