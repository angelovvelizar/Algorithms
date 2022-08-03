package recursionAndBacktracking;

public class EightQueens {

    public static char[][] chessboard = {
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'}
    };

    public static void main(String[] args) {
        findQueensPosition(0);
    }

    private static void findQueensPosition(int row) {
        if (row == 8) {
            printSolution();
        } else {
            for (int col = 0; col < 8; col++) {
                if (canPlaceQueen(row, col)) {
                    putQueen(row, col);
                    findQueensPosition(row + 1);
                    removeQueen(row, col);
                }
            }
        }
    }

    private static void removeQueen(int row, int col) {
        chessboard[row][col] = '-';
    }

    private static void putQueen(int row, int col) {
        chessboard[row][col] = '*';
    }


    private static boolean canPlaceQueen(int row, int col) {
        for (int c = 0; c < 8; c++) {
            if (chessboard[row][c] == '*') {
                return false;
            }
        }

        for (int r = 0; r < 8; r++) {
            if (chessboard[r][col] == '*') {
                return false;
            }
        }

        int r = row, c = col;

        while (r >= 0 && c >= 0) {
            if (chessboard[r--][c--] == '*') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r < 8 && c < 8) {
            if (chessboard[r++][c++] == '*') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r >= 0 && c < 8) {
            if (chessboard[r--][c++] == '*') {
                return false;
            }
        }

        r = row;
        c = col;

        while (r < 8 && c >= 0) {
            if (chessboard[r++][c--] == '*') {
                return false;
            }
        }

        return true;
    }


    public static void printSolution() {
        for (char[] chars : chessboard) {
            for (char symbol : chars) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
