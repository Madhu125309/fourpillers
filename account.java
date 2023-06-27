public class account {
    private int acc_id;
    private String acc_name;
    private double acc_bal;

    public void cal_bal() {
    }

    public void set_acc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public void set_acc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public void set_acc_bal(double acc_bal) {
        this.acc_bal = acc_bal;
    }

    public int getacc_id() {
        return acc_id;
    }

    public String getacc_name() {
        return acc_name;
    }

    public double getacc_bal() {
        return acc_bal;
    }
}
