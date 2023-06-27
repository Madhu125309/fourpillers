public class SA extends account {
    private double min_bal;

    public void set_min_bal(int min_bal) {
        this.min_bal = min_bal;
    }

    public double getmin_bal() {
        return min_bal;
    }

    public void cal_bal() {
        double bal = getacc_bal();
        bal = bal - getmin_bal();
        System.out.println("accountbal" + bal);
    }
}