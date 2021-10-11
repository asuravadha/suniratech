package Authenticationhm1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAuthMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMapAuth hma=new HashMapAuth();
        do {
            System.out.println("enter s for signup and l for signin ");
            String option = sc.next();
            switch (option) {
                case "s":
                    System.out.println("signup");
                    hma.signUp();
                    break;


                case "l":
                    System.out.println("signin");
                    hma.signIn();
                    break;

                default:
                    System.out.println("Invalid input");

            }//switch
            System.out.println("enter q to quit and any other to continue");

        }while(!sc.next().equals("q"));

        }//main

    }//class
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  package Authenticationhm1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapAuth {
    HashMap<String,String> users=new HashMap<>();
    HashMap<String,String> data=new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void signUp()
    {

        System.out.println("enter username");
        String name=sc.next();
        while(users.containsKey(name)) {
            System.out.println("user is already present please enter another username:");
             name=sc.next();
        }//while
        System.out.println("enter password");
        String password=sc.next();
        users.put(name,password);
        System.out.println("enter the data");
        String words=sc.next();
        data.put(name,words);
    }//signup



    public void signIn()
    {
        System.out.println("enter the username");
        String name=sc.next();


        if(users.containsKey(name))
        {
            System.out.println("user is present");
            System.out.println("enter the password");
            String password=sc.next();
            if(users.containsValue(password))
            {
                System.out.println("logined  sucessfully");
                if(data.containsKey(name))
                    System.out.println("username: "+name+" "+"data "+data.get(name));
                
            }//if
            else
                System.out.println("password is incorrect");

        }//if
        else 
            System.out.println("user is not present");
        
    }//signin
}//class
