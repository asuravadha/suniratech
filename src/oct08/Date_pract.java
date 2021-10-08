package oct08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_pract {
    public static void main(String args[]){
        //current machine date
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        //current machine time
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        //current date and time
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("before formatting  "+ldt);

        //formatted date and time
        DateTimeFormatter fldt=DateTimeFormatter.ofPattern("MMM-dd-YYYY HH:mm:ss");

        System.out.println(ldt.format(fldt));


    }
}
