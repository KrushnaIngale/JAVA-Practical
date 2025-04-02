/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical12;
import java.util.Scanner;
/**
 *
 * @author krushna
 */
public class Practical12 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator a= new Calculator();
        a.setVisible(true);
        Practical12 obj = new Practical12();
        
        //int ans = calculator();
        System.out.println(obj.calculator());
    }
    
    public double userIntInput(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
    
    public char userOpInput(){
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        return op;
    }
    
    public double calculator(){
        double a,b,ans=0;
        char c;
        boolean condition=true;
        do{
            if(condition){
                System.out.println("Enter a number :");
                a = userIntInput();
                condition = false;
            }else{
                a=ans;
            }
            
            System.out.println("Enter a operator :");
            c = userOpInput();

            //System.out.println("Enter next number :");
            //b = userIntInput();
            
            switch (c) {
                case '+':
                    System.out.println("Enter next number :");
                    b = userIntInput();
                    ans=a+b;
                    break;
                case '-':
                    System.out.println("Enter next number :");
                    b = userIntInput();
                    ans=a-b;
                    break;
                case '*':
                    System.out.println("Enter next number :");
                    b = userIntInput();
                    ans=a*b;
                    break;
                case '/':
                    System.out.println("Enter next number :");
                    b = userIntInput();
                    ans = a/b;
                    break;
                case 'x':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("Result :"+ ans);
            
        }while(c != 'x');        
        
        return ans;
    }
    
}
