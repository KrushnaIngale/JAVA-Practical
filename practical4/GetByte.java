public class GetByte{
  public static void main (String [] args){
    GetByte obj = new GetByte();
    
    System.out.println(obj.getByte(-1505));
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
}
