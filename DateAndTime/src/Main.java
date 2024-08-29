// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String birthdate=sc.nextLine();
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bD=LocalDate.parse(birthdate,dt);
        LocalDate today=LocalDate.now();
        Period p=Period.between(bD,today);
        int year = p.getYears();
        int month=p.getMonths();
        int day=p.getDays();
        System.out.println(year+" Years ;"+month+" Monthes ;"+day+" Days.");
        long days=ChronoUnit.DAYS.between(bD,today);
        System.out.println("Days:"+days);
        long monthes=ChronoUnit.MONTHS.between(bD,today);
        System.out.println("Monthes:"+monthes);
    }
}