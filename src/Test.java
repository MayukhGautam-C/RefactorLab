public class Test {
    public static void main(String[] args) {

        Site siteA = new ResidentialSite(1, 2);
        Site siteB = new LifelineSite(1, 2);

        System.out.println("Both Units and rate is the same. Base Amounts: ");
        System.out.println("ResidentialSite: " + siteA.getBillableAmount());
        System.out.println("LifelineSite: " + siteB.getBillableAmount());
    }
}
