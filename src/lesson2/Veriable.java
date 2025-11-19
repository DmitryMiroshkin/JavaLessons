package lesson2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Veriable {
    static void main(String[] args) {
   int days = 10000;
   int years = days / 365;
   int month = (days - (years * 365)) / 30;
   int leftdays = days - (years * 365) - (month * 30);

        System.out.println(years);
        System.out.println(month);
        System.out.println(leftdays);
    }
}
