public class GetShort{
  public static void main (String [] args){
    GetShort obj = new GetShort();
    
    System.out.println(obj.getShort(-35536));
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
