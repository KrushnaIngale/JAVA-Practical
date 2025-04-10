import java.time.*;
public class sms{
  private String name;
  private String dob;
  private byte age;
  private String gender;
  private long mobNo;
  private final String regNo;
  private String branch;
  private String year;
  
  private static int cseCounter =  0,extcCounter=0,eceCounter=0,civilCounter=0,instruCounter=0,textCounter=0,prodCounter=0;
  private static int itCounter = 0,chemCounter=0,mechCounter = 0;

  sms(){
     this.name="unknown";
     this.dob="undefined";
     this.age=0;
     this.gender="undefined";
     this.mobNo=0;
     this.regNo="undefined";
     this.branch="undefined";
     this.year="undefined";
  }
  sms(String name,String dob,String gender,long mobNo,String branch,String year){
     this.name=name;
     this.dob=dob;
     setAge(dob,10,3);
     this.gender=gender;
     this.mobNo=mobNo;
     this.branch=branch;
     this.year=year;
     this.regNo=setRegNo(branch,year);
  }
  
  private void setAge(String dob,int currentDay,int currentMonth){
    int currentYear=Year.now().getValue();
    int birthYear=Integer.parseInt(dob.substring(6));
    int birthday=Integer.parseInt(dob.substring(0,2));
    int birthmonth=Integer.parseInt(dob.substring(3,5));
    this.age=(byte)(currentYear-birthYear);
    if(currentMonth<birthmonth ||(currentMonth==birthmonth && currentDay< birthday)){
      age--;
    }
  }
  private byte getAge(){
    return age;
  }
  
  private String setRegNo(String branch,String year) {
    
    int currentYear = Year.now().getValue();
    String branchCode = "";
    int uniqueNumber = 0;
    
        switch (branch.toUpperCase()) {
            case "IT":
                branchCode = "BIT";
                uniqueNumber = ++itCounter;
                break;
            case "CSE":
                branchCode = "BCS";
                uniqueNumber = ++cseCounter;
                break;
            case "MECH":
                branchCode = "BME";
                uniqueNumber = ++mechCounter;
                break;
            case "EXTC":
                branchCode = "BEC";
                uniqueNumber = ++extcCounter;
                break;
            case "ECE":
                branchCode = "BEL";
                uniqueNumber = ++eceCounter;
                break;
            case "CE":
                branchCode = "BCE";
                uniqueNumber = ++civilCounter;
                break;
            case "INSTRU":
                branchCode = "BIN";
                uniqueNumber = ++instruCounter;
                break;
            case "TEXT":
                branchCode = "BTT";
                uniqueNumber = ++textCounter;
                break;
            case "PROD":
                branchCode = "BPR";
                uniqueNumber = ++prodCounter;
                break;
            case "CHEM":
                branchCode = "BCH";
                uniqueNumber = ++chemCounter;
                break;
            default:
                branchCode = "BXX";
                uniqueNumber = 1;
        }
        if(year.equalsIgnoreCase("dsy"))

          uniqueNumber +=500;
        return currentYear + branchCode + String.format("%03d", uniqueNumber);
    }
    private String getRegNo() {
        return regNo;
    }
  
  private void display() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + gender);
        System.out.println("Mobile No: " + mobNo);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        System.out.println("Reg No: " + getRegNo());
        System.out.println("---------------------------");
    }
  
  public static void main(String[] args){
    for (int i = 0; i < args.length; i += 6) {
      String name = args[i];
      String dob = args[i+1];
      String gender = args[i+2];
      long mobNo = Long.parseLong(args[i+3]);
      String branch =args[i+4];
      String year =args[i+5];  
      sms student = new sms(name, dob, gender, mobNo, branch, year);
      student.display();
    }
  }
}
