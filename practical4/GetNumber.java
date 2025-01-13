public class GetNumber{
  public static void main (String [] args){
    GetNumber obj = new GetNumber();
    
    System.out.println(obj.getNumber(32768,"shORT"));
  }
  int getNumber(int number , String type){
  int ans;
    type=type.toLowerCase();
    if(type.equals("byte")){
      ans=getByte(number);
    }else if(type.equals("short")){
      ans=getShort(number);
    }else{
      return 0;
    }
  return ans;
  }
  int getByte(int num){
        int byteValue;
	      int intValue=num;
        byteValue = intValue-256*(intValue/256);
        if (byteValue > 127){
          byteValue = byteValue - 256;
          //System.out.println("int = "+intValue);
        }else if(byteValue < -128){
          byteValue = byteValue + 256;
          //System.out.println("int"+intValue);
        }
      return byteValue;
  }
  int getShort(int num){
        int byteValue;
	      int intValue=num;
        byteValue = intValue-65536*(intValue/65536);
        if (byteValue > 32767){
          byteValue = byteValue - 65536;
          //System.out.println("int = "+intValue);
        }else if(byteValue < -32768){
          byteValue = byteValue + 65536;
          //System.out.println("int"+intValue);
        }
      return byteValue;
  }
}
