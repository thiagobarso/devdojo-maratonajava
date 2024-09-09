package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1613061109953L); // long 100000
        date.setTime(date.getTime()+ 3_600_000); // plus 1 hour
        System.out.println(date);
    }
}
