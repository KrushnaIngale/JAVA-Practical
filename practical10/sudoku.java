class Sudoku{  
  public static void main(String args[]){
    Sudoku obj=new Sudoku();
    int size=Integer.parseInt(args[0]);
    //String[][] layout={{"01","02","03"},{"04","37","06"},{"07","08","09"}};
    obj.grid(size);    
  }
  
  void grid(int size){
    if(size>9)
      size=9;
    int [][]layout=sudokoAnsGenerator(size);
    int [][]layout1=removeRandomNumbers(layout,size);
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        System.out.print("---");
      }
      System.out.print("-");
      System.out.println();
      for(int j=0;j<size;j++){
        if (layout1[i][j] == 0) {
          System.out.print("|  ");
        }else{
          System.out.print("| "+layout1[i][j]);
        }
      }
      System.out.print("|  ");
      System.out.println();
    }
    for(int dash=1;dash<=size;dash++){
      System.out.print("---");
    }
    System.out.print("-");
    System.out.println();
  }
  
  int[][] sudokoAnsGenerator(int size) {
    int[][] ansBox = new int[size][size];
    for (int row=0;row<size;row++) {
      for (int col=0;col<size;col++) {
          ansBox[row][col]=(row+col)%size+1;
          //ansBox[row][col]=(row*3+row/3+col)%size+1;
      }
    }
    shuffle(ansBox,size);
    return ansBox;
  }
  
  void shuffle(int[][] grid,int size) {
    for (int i=0;i<size;i++) {
      int swapWith=(int)(System.nanoTime()%size);
      int[] temp = grid[i];
      grid[i] = grid[swapWith];
      grid[swapWith] = temp;
    }
  }
  
  int[][] removeRandomNumbers(int[][] grid,int size) {
    int cellsToRemove=size*size/3; 
    while (cellsToRemove > 0) {
        int row = (int)(System.nanoTime() % size);
        int col = (int)(System.nanoTime() % size);
        if (grid[row][col] != 0) {
            grid[row][col] = 0;
            cellsToRemove--;
        }
    }
    return grid;
  }
}
