package oct08;

import java.util.Scanner;

public class Exception_pract {
    public static void main(String[] args){
        System.out.println("statement 1");
       try{
           System.out.println(21323/0);
       }catch(Exception e){
           System.out.println("error handled at statement2"+e);
       }
        System.out.println("statement 3");

       //custom error
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int data=input.nextInt();
        if(data>25){
            System.out.println("eligible ");
        }
        else{
            throw new ArithmeticException("value didnt meet the criteria");
        }


    }
}