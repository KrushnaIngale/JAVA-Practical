public class Practical7{
  public static void main(String args[]){
    Practical7 obj = new Practical7();
    int size=Integer.parseInt(args[0]);
    System.out.print(obj.getName(size));
  }
  String getName(int size){
    if(size<5){
      size=5;
    }else if(size>18){
      size=18;
    }
    
    String pattern="";
    
    for(int ln=1;ln<=size;ln++){
      if(size%2==0){
        pattern+=displayK(ln,size+1);
      }else{
        pattern+=displayK(ln,size);
      }
      pattern+=displayR(ln,size);
      pattern+=displayU(ln,size);
      pattern+=displayS(ln,size);
      pattern+=displayH(ln,size);
      pattern+=displayN(ln,size);
      pattern+=displayA(ln,size);
    }
   return pattern;
    //System.out.println();
  }
  
  String displayK(int ln,int size){
    //for(int ln=1;ln<=size;ln++){
    String pattern="";
      if(ln<=size/2){//
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-ln){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }//System.out.println();
      }else if(ln>(size/2)+1){
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==ln-1){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }//System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt<=size-ln){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }//System.out.println();
      }
    //}
    return pattern;
  }
  
  String displayR(int ln,int size){
      //for(int ln=1;ln<=size;ln++){
      String pattern="";
        if(ln==1||ln==(size/2)+1){
          //System.out.print("+");
          pattern+="+";
          for(int plus=1;plus<=size-3;plus++){
            //System.out.print("+");
            pattern+="+";
          }
            //System.out.print("  ");
            pattern+="  ";
            //System.out.println();
        }else if(ln>1&&ln<(size/2)+1){
          //System.out.print("+");
          pattern+="+";
          for(int space=1;space<size-2;space++){
            //System.out.print(" ");
            pattern+=" ";
          }
          //System.out.print("+");
          pattern+="+";
          //System.out.print(" ");
          pattern+=" ";
          //System.out.println();
        }
        if(ln>(size/2)+1){
          for(int pt=1;pt<=size;pt++){
            if(pt==1||pt==ln-2){
              //System.out.print("+");
              pattern+="+";
            }else{
              //System.out.print(" ");
              pattern+=" ";
            }
            
          }
          //System.out.println();
        }
      //}
      return pattern;
  }
  
  String displayU(int ln,int size){
  String pattern="";
    //for(int ln=1;ln<=size;ln++){
      if(ln<size){
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-1){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }
        //System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt>1 && pt<size-1){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }//System.out.println();
      }
    //}
    //System.out.println();
    return pattern;
  }
  
  String displayS(int ln,int size){
    String pattern="";
      //for(int ln=1;ln<=size;ln++){
        if(ln==1){
          //System.out.print(" ");
          pattern+=" ";
          for(int plus=1;plus<=size-2;plus++){
            //System.out.print("+");
            pattern+="+";
          }
            //System.out.print(" ");
            pattern+=" ";
            //System.out.println();
        }
        else if(ln>1&&ln<=size/2){
          //System.out.print("+");
          pattern+="+";
          for(int space=1;space<=size-1;space++){
            //System.out.print(" ");
            pattern+=" ";
          }
          //System.out.println();
        }
        else if(ln==(size/2)+1){
          //System.out.print(" ");
          pattern+=" ";
            for(int plus=1;plus<size-2;plus++){
              //System.out.print("+");
              pattern+="+";
            }
            //System.out.print("  ");
            pattern+="  ";
            //System.out.println();
        }
        else if(ln>(size/2)+1 && ln<size){
            for(int space=1;space<size-1;space++){
              //System.out.print(" ");
              pattern+=" ";
            }
            //System.out.print("+");
            pattern+="+";
            //System.out.print(" ");
            pattern+=" ";
            //System.out.println(); 
        }
        else {
          for(int plus=1;plus<=size-2;plus++){
            //System.out.print("+");
            pattern+="+";
          }
          //System.out.print("  ");
          pattern+="  ";
          //System.out.println();
        }
        return pattern;
      }
    //}
    
  String displayH(int ln,int size){
    String pattern="";
    //for(int ln=1;ln<size;ln++){
      if(ln==(size/2)+1){
        for(int pt=1;pt<size;pt++){
          //System.out.print("+");
          pattern+="+";
        }
          //System.out.print(" ");
          pattern+=" ";
          //System.out.println();
      }else{
        for(int pt=1;pt<=size;pt++){
          if(pt==1||pt==size-1){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }//System.out.println();
      }
      return pattern;
    }
  //}
  
  String displayN(int ln,int size){
    String pattern="";
    int temp=size;
      for(int pt=1;pt<=size;pt++){
        if(pt==1||pt==size||pt==ln){
          //System.out.print("+");
          pattern+="+";
        }else{
          //System.out.print(" ");
          pattern+=" ";
        }
      }
      //System.out.print(" ");
      pattern+=" ";
      //System.out.println();
      return pattern;
  }
  
  String displayA1(int ln,int size){
    String pattern="";
    //for(int ln=1;ln<=size;ln++){
      if(ln<size/2){
        for(int space=(size/2);space>ln;space--){
          //System.out.print(" ");
          pattern+=" ";
        }
        //System.out.print("+");
        pattern+="+";
        if(ln>1){
          for(int space=1;space<ln;space++){
            //System.out.print(" ");
            pattern+=" ";
          }
          for(int space=1;space<ln-1;space++){
            //System.out.print(" ");
            pattern+=" ";
          }
          //System.out.print("+");
          pattern+="+";
        }
        for(int space=ln;space<size/2;space++){
          //System.out.print(" ");
          pattern+=" ";
        }
        //System.out.print(" ");
        pattern+=" ";
        //System.out.println();
      }
      if(ln==(size/2)){
        for(int pt=1;pt<size;pt++){
            //System.out.print("+");
            pattern+="+";
        }
        //System.out.println();
      }
      if(ln>(size/2)){
        for(int pt=1;pt<size;pt++){
          if(pt==1||pt==size-1){
            //System.out.print("+");
            pattern+="+";
          }else{
            //System.out.print(" ");
            pattern+=" ";
          }
        }//System.out.println();
      }
      return pattern+="\n";
  }
  //}
  
  String displayA(int ln,int size){
    String pattern="";
    for(int pt=1;pt<size;pt++){
      if(ln==1){
        if(pt>1&&pt<size-1){
          pattern+="+";
        }else{
          pattern+=" ";
        }
      }else{
        if(pt==1||pt==size-1||ln==size/2+1){
          pattern+="+";
        }else{
          pattern+=" ";
        }
      }
    }pattern+=" ";
    return pattern+"\n";
  }
}

      
