package authentication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class auth extends signup{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        auth authentication=new auth();
        ArrayList<user> users=new ArrayList<>();
        do{
            System.out.println("enter s for signup l for login ");
            String option=input.next();
            switch (option) {
                case "s" -> {
                    String[] userinfo = authentication.asignup(users);
                    if (!userinfo[0].equals("")) {

                        LocalDateTime ldt=LocalDateTime.now();
                        DateTimeFormatter fldt=DateTimeFormatter.ofPattern("MMM-dd-YYYY HH:mm:ss");
                        System.out.println("registration  time   "+ldt.format(fldt));
                        users.add(new user(userinfo[0], userinfo[1], userinfo[2]+"\n\nregistration time"+ldt.format(fldt)));
                    }
                }
                case "l" -> authentication.asignin(users);
                default -> System.out.println("invalid input");
            }

            System.out.println("Enter q to quit anyother to continue");

        }while(!input.next().equals("q"));
    }

}
