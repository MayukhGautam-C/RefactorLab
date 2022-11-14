public class ResidentialSite extends Site{

    private double units;
    private double rate;

    public ResidentialSite(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount(){
        double base = getBase();
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    private double getBase() {
        double base = units * rate;
        return base;
    }

}
