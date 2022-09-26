package zadatak3;
import java.util.Date;

public class DateRepresentation {

    int date = 22;
    int month = 7;
    int year = 2020;

    Date initialDate = new Date(this.date, this.month,this.year);

    public DateRepresentation(){

    }

    public DateRepresentation(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public Date converter(int year, int month, int date){
        Date d = new Date(date,month,year);
        return d;
    }

    public boolean check() {
        return initialDate.before(converter(this.date,this.month,this.year));

        }

/*    @Override
    public String toString() {
        if (check()){
            return "Initial date is younger";
        }else {
            return "Initial date is not younger";
        }
    }*/
}
