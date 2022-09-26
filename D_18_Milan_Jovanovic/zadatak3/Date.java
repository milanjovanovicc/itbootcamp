package zadatak3;

public class Date {

    private int year;
    private int month;
    private int day;
    private Selection selections;

    public Date() {
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2050) {
            this.year = year;
        }else {
            System.err.println("Year out of range!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }else {
            System.err.println("Invalid number of months!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 30) {
            this.day = day;
        }else {
            System.err.println("Invalid number of days!");
        }
    }

    public void addition(Selection selections){
        if (selections.equals(Selection.DAY)) {
            this.day++;
            if (this.day > 30) {
                this.day = 1;
                if (this.month < 12) {
                    this.month++;
                }else {
                    this.month = 1;
                    this.year++;
                }
            }
        } else if (selections.equals(Selection.MONTH)) {
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        } else if (selections.equals(Selection.YEAR)) {
            this.year++;
            if (this.year > 2050) {
                System.err.println("Year out of range!");
            }
        }
    }

    public void subtraction(Selection selections){
        if (selections.equals(Selection.DAY)) {
            this.day--;
            if (this.day < 1) {
                this.day = 30;
                if (this.month < 1) {
                    this.month--;
                }else if (this.year > 1900){
                    this.month = 12;
                    this.year--;
                } else {
                    System.err.println("Year out of range!");
                }
            }
        } else if (selections.equals(Selection.MONTH)) {
            this.month--;
            if (this.month < 1) {
                this.month = 12;
            }
        } else if (selections.equals(Selection.YEAR)) {
            this.year++;
            if (this.year < 1900) {
                System.err.println("Out of range!");
            }
        }
    }
    @Override
    public String toString() {
        return getDay() + "-" + getMonth() + "-" + getYear();
    }
}
