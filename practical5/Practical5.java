public class Practical5{
  static int index;
  public static void main(String args[]){
  
  Practical5 f = new Practical5();
  System.out.println(f.factorial3(4));
  System.out.println(f.factorial3(4));
  System.out.println(f.factorial3(4));
  
  int[] num={1,2,3,4,-10};
  System.out.println(f.getSum(num));
  //f.getSum(num);
  }
  
  int factorial1(int num){
    if(num>-1){
      if(num<2){
        return 1;
      }
      int fact=2;
      for(;num>2;){
        fact*=num--;
      }
      return fact;
    }else{
      return -1;
    }
  }
  
  int factorial2(int num){
    if(num>-1){
      if(num<2){
        return 1;
      }
      int fact=2;
      while(num>2){
        fact*=num--;
      }
      return fact;
    }else{
      return -1;
    }
  }
  
  int factorial3(int num){
    if(num>-1){
      if(num<2){
        return 1;
      }
        return num*factorial3(num-1);
    }else{
      return -1;
    }
  }
  
  int getSum(int[] num){
    index=num.length-1;
    return getSum1(num,index);
  }
  
  int getSum1(int[] num,int index){
    int sum=0;
    if(index>-1){
      sum=sum+num[index];
      return sum+getSum1(num,index-1);
    } 
    return sum;
  }

}
