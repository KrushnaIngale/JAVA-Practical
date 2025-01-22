public class Practical6{
static int i=2;
  public static void main(String args[]){
    Practical6 obj=new Practical6();
    obj.displayPattern1(4);
    obj.displayPattern2(4);
    obj.displayPattern3(3);
  }
  void displayPattern1(int size){
    for(int ln=1;ln<=size;ln++){
      for(int space=ln;space<size;space++){
        System.out.print(" ");
      }
      for(int pt=1;pt<=(2*ln)-1;pt++){
        if(pt%2==1){
           System.out.print("+");       
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int ln=size-1;ln>0;ln--){
      for(int space=ln;space<size;space++){
        System.out.print(" ");
      }
      for(int pt=1;pt<=(2*ln)-1;pt++){
        if(pt%2==1){
           System.out.print("*");       
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  void displayPattern2(int size){
    for(int ln=1;ln<=2*size-1;ln++){
      if(ln<=size){
        for(int space=ln;space<size;space++){
          System.out.print(" ");
        }
        for(int plus=1;plus<=(2*ln)-1;plus++){
          System.out.print("+");
        }
        System.out.println();
      }else{
        for(int space=ln;space>size;space--){
          System.out.print(" ");
        }
        int temp=ln-i;
        for(int plus=1;plus<=(2*temp)-1;plus++){
          System.out.print("+");
        }
        i=i+2;
        System.out.println();
      }
    }
  }
  void displayPattern3(int size){
    for(int ln=1;ln<=size;ln++){
      for(int space=ln;space<size;space++){
        System.out.print(" ");
      }
      for(int pt=1;pt<=(2*ln)-1;pt++){
        if((pt-ln)%2==0){
          System.out.print("+");          
        }else{
          System.out.print("*"); 
        }
      }
      System.out.println();
    }
    for(int ln=size;ln>0;ln--){
      for(int space=ln;space<size;space++){
        System.out.print(" ");
      }
      for(int pt=(2*ln)-1;pt>0;pt--){
        if((pt+ln)%2==0){
          System.out.print("*");          
        }else{
          System.out.print("+"); 
        }
      }
      System.out.println();
    }
  }
}
