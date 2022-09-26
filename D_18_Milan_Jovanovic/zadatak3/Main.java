package zadatak3;

public class Main {
    public static void main(String[] args) {

        Date day1 = new Date();
        day1.setDay(1);
        day1.setMonth(1);
        day1.setYear(2000);

        day1.subtraction(Selection.DAY);
        System.out.println(day1);

        day1.addition(Selection.DAY);
        System.out.println(day1);

        day1.subtraction(Selection.MONTH);
        System.out.println(day1);

        day1.addition(Selection.MONTH);
        System.out.println(day1);

        day1.subtraction(Selection.YEAR);
        System.out.println(day1);

        day1.addition(Selection.YEAR);
        System.out.println(day1);

        System.out.println("--------------------------------------------------");

        Date day2 = new Date();
        day2.setDay(30);
        day2.setMonth(12);
        day2.setYear(2000);

        day2.subtraction(Selection.DAY);
        System.out.println(day2);

        day2.addition(Selection.DAY);
        System.out.println(day2);

        day2.subtraction(Selection.MONTH);
        System.out.println(day2);

        day2.addition(Selection.MONTH);
        System.out.println(day2);

        day2.subtraction(Selection.YEAR);
        System.out.println(day2);

        day2.addition(Selection.YEAR);
        System.out.println(day2);

        System.out.println("---------------------------------------");

        Date day3 = new Date();
        day3.setDay(30);
        day3.setMonth(12);
        day3.setYear(2050);

        day3.subtraction(Selection.DAY);
        System.out.println(day3);

        day3.addition(Selection.DAY);
        System.out.println(day3);

        day3.subtraction(Selection.MONTH);
        System.out.println(day3);

        day3.addition(Selection.MONTH);
        System.out.println(day3);

        day3.subtraction(Selection.YEAR);
        System.out.println(day3);

        day3.addition(Selection.YEAR);
        System.out.println(day3);

        System.out.println("---------------------------------------");

        Date day4 = new Date();
        day4.setDay(1);
        day4.setMonth(1);
        day4.setYear(1900);

        day4.subtraction(Selection.DAY);
        System.out.println(day4);

        day4.addition(Selection.DAY);
        System.out.println(day4);

        day4.subtraction(Selection.MONTH);
        System.out.println(day4);

        day4.addition(Selection.MONTH);
        System.out.println(day4);

        day4.subtraction(Selection.YEAR);
        System.out.println(day4);

        day4.addition(Selection.YEAR);
        System.out.println(day4);
    }

}
