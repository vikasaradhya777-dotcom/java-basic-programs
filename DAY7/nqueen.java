package DAY7;

public class nqueen {

    static int N = 4;
    static int[] board = new int[N];

    static boolean isSafe(int row, int col) {

        for (int i = 0; i < row; i++) {

            // Check same column
            if (board[i] == col) {
                return false;
            }

            // Check diagonal
            if (Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }

        return true;
    }

    static boolean solve(int row) {

        // All queens are placed
        if (row == N) {
            return true;
        }

        // Try every column
        for (int col = 0; col < N; col++) {

            if (isSafe(row, col)) {

                // Place queen
                board[row] = col;

                // Move to next row
                if (solve(row + 1)) {
                    return true;
                }

                // Backtrack
                board[row] = -1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Initialize board
        for (int i = 0; i < N; i++) {
            board[i] = -1;
        }

        // Solve N-Queens
        if (solve(0)) {

            // Print board
            for (int row = 0; row < N; row++) {

                for (int col = 0; col < N; col++) {

                    if (board[row] == col) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }

                System.out.println();
            }

        } else {
            System.out.println("No solution exists");
        }
    }
}