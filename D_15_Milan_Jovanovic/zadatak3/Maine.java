package zadatak3;

import java.util.Date;


public class Maine {
    public static void main(String[] args) {

        //DateRepresentation thisDate = new DateRepresentation(20,10,2015);

        DateRepresentation day1 = new DateRepresentation(20, 6, 2022);
        DateRepresentation day2 = new DateRepresentation(2,2,2002);
        DateRepresentation day3 = new DateRepresentation(20,11,2000);

        if (day1.check()){
            System.out.println("Initial date is younger.");
        }else {
            System.out.println("Initial date is not younger");
        }
        if (day2.check()){
            System.out.println("Initial date is younger.");
        }else {
            System.out.println("Initial date is not younger");
        }


/*        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);*/

    }
}
