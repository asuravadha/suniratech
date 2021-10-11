package oct11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
//file handling
//        //creating a file
//        File file=new File("files.txt");
//        try {
//            if(file.createNewFile()){
//                System.out.println("file created ");
//            }else{
//                System.out.println("file already exist");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




////reading data
//        HashMap<String,String> usercred=new HashMap<>();
//        File file=new File("files.txt");
//        try {
//            Scanner input=new Scanner(file);
//            while(input.hasNextLine()){
//                String data=input.nextLine();
//                String[] up=data.split(" ",2);
//                usercred.put(up[0],up[1]);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //write data to a file
        try {
            Scanner input=new Scanner(System.in);
            FileWriter writer=new FileWriter("files.txt",true);
            System.out.println("enter username");
            String username=input.next();
            System.out.println("enter password");
            String password=input.next();
            File file=new File("files.txt");
            writer.write("\n"+username+" "+password);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }



}
