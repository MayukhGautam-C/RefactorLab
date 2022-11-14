public class ResidentialSite extends Site{

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    public double getBaseAmount() {
        return units * rate;
    }

}
