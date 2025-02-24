public class Practical9{
  public static void main(String[] args){
    Practical9 obj= new Practical9();
    int size=Integer.parseInt(args[0]);
    long[] num=new long[size];
    for(int i=0;i<size;i++){
      num[i]=System.nanoTime()%21+1;      
    }
    long startTime,endTime,timeTaken;
    long totalTime1=0;
    long totalTime2=0;
    long stringTotalTime1=0;
    long stringTotalTime2=0;
    long stringTotalTime3=0;
    
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.fact1(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      totalTime1 += timeTaken;
    }
    long avgTimeTaken1=totalTime1/size;
    System.out.println("factorial with loop = "+avgTimeTaken1);
    
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.fact2(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      totalTime2 += timeTaken;
    }
    long avgTimeTaken2=totalTime2/size;
    System.out.println("factorial with recurssion = "+avgTimeTaken2);
    
    if(avgTimeTaken1 < avgTimeTaken2)
      System.out.println("method 1(loop) is faster");
    else if(avgTimeTaken1==avgTimeTaken2)
      System.out.println("both equally fast");
    else
      System.out.println("method 2(recurssion) is faster");
      
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.stringAppend(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      stringTotalTime1 += timeTaken;
    }
    avgTimeTaken1=stringTotalTime1/size;
    System.out.println("string concatination with string = "+avgTimeTaken1);
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.stringBuffer(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      stringTotalTime2 += timeTaken;
    }
    avgTimeTaken2=stringTotalTime2/size;
    System.out.println("string concatination with stringbuffer = "+avgTimeTaken2);
    
    for(int i=0;i<size;i++){
      startTime=System.nanoTime();
      obj.stringBuilder(num[i]);
      endTime=System.nanoTime();
      timeTaken=endTime-startTime;
      stringTotalTime3 += timeTaken;
    }
    long avgTimeTaken3=stringTotalTime3/size;
    System.out.println("string concatination with stringbuilder = "+avgTimeTaken3);
    
    if(avgTimeTaken1 < avgTimeTaken2 && avgTimeTaken1< avgTimeTaken3)
      System.out.println("method 1 (string) is faster");
    else if(avgTimeTaken1 == avgTimeTaken2 && avgTimeTaken1 == avgTimeTaken3)
      System.out.println("all equally fast");
    else if(avgTimeTaken2 < avgTimeTaken3)
      System.out.println("method 2 (stringbuffer) is faster");
    else
      System.out.println("method 3 (stringbuilder) is faster");
  }
  
  long fact1(long num){
    if(num<0){
      return -1;
    }else if(num<2){
      return 1;
    }else{
      long fact=1;
      for(long i=2;i<=num;i++){
        fact*=i;
      }
      return fact;
    }
  }
  
  long fact2(long num){
    if(num<0){
      return -1;
    }else if(num<2){
      return 1;
    }else{
      return num*fact2(num-1);
    }
  }
  
  String stringAppend(long num) {
    String str="";
    str+=num+" ";
    return str;
  }
  StringBuffer stringBuffer(long num) {
    StringBuffer str = new StringBuffer();
    str.append(num).append(" ");
    return str;
  }
  StringBuilder stringBuilder(long num) {
    StringBuilder str = new StringBuilder();
    str.append(num).append(" ");
    return str;
  }
}
