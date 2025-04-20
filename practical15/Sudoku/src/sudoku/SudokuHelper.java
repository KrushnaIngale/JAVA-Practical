/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

/**
 *
 * @author krushna
 */
import java.util.*;

public class SudokuHelper {
    static private int[][] grid;
    static private int[][] puzzle;
    
    public int[][] getGrid(){
        return grid;
    }
    public int[][] getPuzzle(){
        return puzzle;
    }

    public static int[][] generateRandomValidGrid(int n) {
        grid = new int[n][n];
        fillGrid(grid, 0, 0, n);
        return grid;
    }

    static boolean fillGrid(int[][] grid, int row, int col, int n) {
        if (row == n) return true;
        if (col == n) return fillGrid(grid, row + 1, 0, n);

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = i + 1;
        shuffle(nums);

        for (int num : nums) {
            if (isValid(grid, row, col, num, n)) {
                grid[row][col] = num;
                if (fillGrid(grid, row, col + 1, n)) 
                    return true;
                grid[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isValid(int[][] grid, int row, int col, int num, int n) {
        for (int i = 0; i < n; i++) {
            if (grid[row][i] == num || grid[i][col] == num) return false;
        }
        return true;
    }

    static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void removeCells(int[][] original, int size,String level) {
        puzzle = new int[size][size];
        Random rand = new Random();
        int num=4;
        if(level.equalsIgnoreCase("Easy")){
            num = 4;
        }else if(level.equalsIgnoreCase("Medium")){
            num = 3;
        }else if(level.equalsIgnoreCase("Hard")){
            num = 2;
        }else{
            num=4;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                puzzle[i][j] = original[i][j];
            }
        }

        int cellsToRemove = (size * size) / num; 
        while (cellsToRemove > 0) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);

            if (puzzle[row][col] != 0) {
                puzzle[row][col] = 0;
                cellsToRemove--;
            }
        }
    }
    
//    public static boolean checkSolution(int[][] userGrid, int[][] solution, int gridSize){
//        for (int i = 0; i < gridSize; i++) {
//            for (int j = 0; j < gridSize; j++) {
//                if (userGrid[i][j] != solution[i][j]) {
//                    return false; 
//                }
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        int size = 5;
        int[][] board = generateRandomValidGrid(size);
        printGrid(board);
    }
}
