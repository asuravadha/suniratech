package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapAuth {
    HashMap<String,String> users=new HashMap<>();
    HashMap<String,String> data=new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void signup()
    {

            System.out.println("enter username");
            String name=sc.next();
            System.out.println("enter password");
            String password=sc.next();
            users.put(name,password);
            System.out.println("enter the data");
            String words=sc.next();
            data.put(name,words);



    }

    public void display()
    {
        System.out.print(users);
    }


    public void login()
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
                System.out.println("password is sucessfull");
                if(data.containsKey(name))
                {
                    System.out.println("username: "+name+" "+"data "+data.values());
                }


            }
            else
            {
                System.out.println("password is incorrect");
            }

        }
        else {
            System.out.println("user is not present");
        }




    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------
  package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAuthMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMapAuth h1=new HashMapAuth();
        while(true)
        {
            System.out.println("enter s for signup and l for login and d to display all the users present signed up");
            String enter=sc.next();
            switch (enter)
            {
                case "s":
                    System.out.println("signup");
                    h1.signup();
                    break;



                case "l":
                    System.out.println("Login");
                    h1.login();
                    break;
                case "d":
                    System.out.println("Users Signed Up");
                    h1.display();
                    break;
            }




            System.out.println("enter q to quit and any other to continue");
            String option=sc.next();
            if(option.equals("q"))
            {
                break;
            }



        }

    }
}
