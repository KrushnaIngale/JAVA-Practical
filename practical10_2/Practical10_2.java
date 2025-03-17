import java.util.Random;
import java.util.Scanner;

public class Practical10_2 {
    public static void main(String args[]) {
        Practical10_2 obj = new Practical10_2();
        int size = Integer.parseInt(args[0]);

        if (size > 9) size = 9;
        obj.grid(size);
    }

    void grid(int size) {
        int[][] layout = sudokoAnsGenerator(size);
        int[][] layout1 = removeRandomNumbers(layout, size);
        userTask(layout1, size);
        checkSolution(layout1, size);
    }

    int[][] sudokoAnsGenerator(int size) {
        int[][] ansBox = new int[size][size];
        fillBoard(ansBox, size);
        return ansBox;
    }

    boolean fillBoard(int[][] board, int size) {
        return solve(board, 0, 0, size);
    }

    boolean solve(int[][] board, int row, int col, int size) {
        if (row == size) return true;
        if (col == size) return solve(board, row + 1, 0, size);

        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) numbers[i] = i + 1;
        shuffleArray(numbers, rand);

        for (int num : numbers) {
            if (isValid(board, row, col, num, size)) {
                board[row][col] = num;
                if (solve(board, row, col + 1, size)) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    void shuffleArray(int[] arr, Random rand) {
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    boolean isValid(int[][] board, int row, int col, int num, int size) {
        for (int i = 0; i < size; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }
        return true;
    }

    int[][] removeRandomNumbers(int[][] grid, int size) {
        int cellsToRemove = (size * size) / 3;
        Random rand = new Random();

        while (cellsToRemove > 0) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);
            if (grid[row][col] != 0) {
                grid[row][col] = 0;
                cellsToRemove--;
            }
        }
        return grid;
    }

    void userTask(int[][] board, int size) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printBoard(board, size);
            System.out.print("Enter row (1-" + size + ") or 0 to quit: ");
            int row = sc.nextInt() - 1;
            if (row == -1) break;

            System.out.print("Enter column (1-" + size + "): ");
            int col = sc.nextInt() - 1;
            
            if (row < 0 || row >= size || col < 0 || col >= size) {
                System.out.println("Invalid input");
                continue;
            }
            if (board[row][col] != 0) {
                System.out.println("Cell already filled");
                continue;
            }
            System.out.print("Enter number (1-" + size + "): ");
            int num = sc.nextInt();
            board[row][col] = num;
        }
    }

    void printBoard(int[][] board, int size) {
        for (int i = 0; i < size; i++) {
            printHorizontalLine(size);
            for (int j = 0; j < size; j++) {
                System.out.print("| ");
                System.out.print(board[i][j] == 0 ? "  " : board[i][j] + " ");
            }
            System.out.println("|");
        }
        printHorizontalLine(size);
    }

    void printHorizontalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    void checkSolution(int[][] board, int size) {
        System.out.println("Checking solution...");
        if (isCorrect(board, size)) {
            System.out.println("Correct solution!");
        } else {
            System.out.println("Incorrect solution.");
        }
    }

    boolean isCorrect(int[][] board, int size) {
        for (int i = 0; i < size; i++) {
            boolean[] rowCheck = new boolean[size + 1];
            boolean[] colCheck = new boolean[size + 1];
            for (int j = 0; j < size; j++) {
                int rowVal = board[i][j];
                int colVal = board[j][i];
                if (rowVal != 0 && rowCheck[rowVal]) return false;
                if (colVal != 0 && colCheck[colVal]) return false;
                rowCheck[rowVal] = true;
                colCheck[colVal] = true;
            }
        }
        return true;
    }
}

