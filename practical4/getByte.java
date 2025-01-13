public class getByte{
  public static void main (String [] args){
  getByte obj = new getByte();
  
  System.out.println(obj.getByte(-1));
  
   }
  int getByte(int num){
    int ans;
    int temp=num/128;
    if(num>=0){
      if(temp%2==0){
        ans=num%128;
      }else{
        ans=(num%128)-128;
      }
      return ans;
    }else{
      if(num==-128){
        ans=-128;
      }else if(temp%2==0){
        ans=num%128;
      }else{
        ans=(num%128)+128;
      }
      return ans;
    }
  }
}
