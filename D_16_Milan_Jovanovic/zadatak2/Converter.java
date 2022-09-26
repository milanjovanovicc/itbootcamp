package zadatak2;

public class Converter {

    private double rsd;

    public Converter(){

    }

    public Converter(double rsd){
        this.rsd = rsd;
    }

    public void setRsd(double rsd) {
        if (rsd > 0) {
            this.rsd = rsd;
        }else {
            System.err.println("Amounts have to be positive.");
        }
    }

    public double getRsd() {
        return rsd;
    }

    public double eur(double amount){
        return amount / 117;
    }

    public double aud(double amount){
        return amount / 81;
    }

    public double cad(double amount){
        return amount / 89;
    }

    public double rub(double amount){
        return amount / 2;
    }

    public double usd(double amount){
        return amount / 114;
    }

    public double gbp(double amount){
        return amount / 139;
    }

    @Override
    public String toString() {
        return "RSD=" + this.rsd + "\r\n" +
                "EUR=" + eur(rsd) + "\r\n" +
                "AUD=" + aud(rsd) + "\r\n" +
                "CAD=" + cad(rsd) + "\r\n" +
                "RUB=" + rub(rsd) + "\r\n" +
                "USD=" + usd(rsd) + "\r\n" +
                "GBP=" + gbp(rsd) + "\r\n";
    }
}
