package assignments;

import java.util.Locale;
import java.util.Scanner;

public class SampleMorseCode {
    public static void main(String[] args) {
        char[] c={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        String[] str={"!","@","#","$","%","^","&","*","(",")",",","_",",","/","+","//","**","##","**#","__#","$*","^#%","$!","@$","#@$","&$@"};

        Scanner sc=new Scanner(System.in);
       System.out.println("enter the letter");

        String s=sc.next();
        String s1=s.toLowerCase();

        char c2[]=s1.toCharArray();


        for(int i=0;i<c2.length;i++)
        {
          for(int j=0;j<c.length;j++)
          {
              if(c2[i]==c[j])
              {
                  System.out.print(str[j]);
              }
          }

        }
        System.out.println("enter the morse code to convert into word");
        String code=sc.next();
        for(int i=0;i<str.length;i++)
        {
            if(code.equals(str[i]))
            {
                System.out.println(c[i]);
            }
        }
    }

}
===================================================================================================================================
  package assignments;

import java.util.Scanner;

public class SampleMorseCodeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Morse m1=new Morse();
        while(true)
        {
            System.out.println("enter w to convert word to morse code OR m to convert morse code to word ");
            String enter=sc.next();
            switch (enter)
            {
                case "w":
                    System.out.println("Converting word to morse code");
                    m1.toMorseCode();
                    System.out.println();
                    break;

                case "m":
                    System.out.println("converting morse code to word");
                    m1.toWord();
                    System.out.println();
                    break;
            }

            System.out.println("enter q to quit any other to contiue");
            String option=sc.next();
            if(option.equals("q"))
            {
                break;
            }
        }
    }
}
