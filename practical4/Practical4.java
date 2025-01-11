public class Practical4{
	public static void main(String[] args){
		Practical4 obj = new Practical4();
    System.out.println(obj.getByte(-129));
    System.out.println(obj.getShort(-32769));
    System.out.println(obj.getNumber(32769,"shOrt"));
    System.out.println(obj.toXXString("B1010","d"));
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
    int ans;
    int temp=num/32768;
    if(num>=0){
      if(temp%2==0){
        ans=num%32768;
      }else{
        ans=(num%32768)-32768;
      }
      return ans;
    }else{
      if(num==-32768){
        ans=-32768;
      }else if(temp%2==0){
        ans=num%32768;
      }else{
        ans=(num%32768)+32768;
      }
      return ans;
    }
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
  
  String toXXString(String num, String toBase) {
        int decimalValue=0;
        if (num.startsWith("B")) {
            decimalValue = toDecimal(num.substring(1), 2); 
        }else if (num.startsWith("O")){
            decimalValue = toDecimal(num.substring(1), 8); 
        }else if (num.startsWith("H")){
            decimalValue = toDecimal(num.substring(1), 16);
        }else if (num.startsWith("D")){
            decimalValue = toDecimal(num.substring(1), 10);
        }else{
            System.out.println("Error: Input must start with B, O, H, or D.");
        }

        String result="0";
        if (toBase.equalsIgnoreCase("B")){
            result = "B" + fromDecimal(decimalValue, 2); 
        }else if (toBase.equalsIgnoreCase("O")){
            result = "O" + fromDecimal(decimalValue, 8); 
        }else if (toBase.equalsIgnoreCase("H")){
            result = "H" + fromDecimal(decimalValue, 16);
        }else if (toBase.equalsIgnoreCase("D")) {
            result = "D" + fromDecimal(decimalValue, 10);
        }else{
            //throw new IllegalArgumentException("Input must start with B, O, H, or D.");
            System.out.println("Error: Input must start with B, O, H, or D.");
        }
        return result;
    }

    int toDecimal(String num,int base) {
        int decimalValue= 0;
        int power= 1;

        for (int i=num.length()-1;i>=0;i--){
            char digit=num.charAt(i);
            int value;
            if(digit >='0' && digit <='9'){
              value=digit-'0';
            }else{
              value=digit-'A'+10;
            } 
            
            decimalValue += value*power;
            power *= base;
        }
        return decimalValue;
    }

    String fromDecimal(int decimalValue, int base) {
        String result = "";

        while (decimalValue > 0) {
            int remainder = decimalValue % base;
            char digit ;
            if(remainder < 10 ){
              digit=(char)(remainder + '0');
            }else{
              digit=(char)(remainder - 10 + 'A');
            }
          
            result = digit + result;
            decimalValue /= base;
        }
        return result.isEmpty() ? "0" : result;
    }
}
