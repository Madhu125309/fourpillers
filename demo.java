public class demo {
    public static void main(String[] args) {
        SA a1 = new SA();
        a1.set_acc_id(101);
        a1.set_acc_name("madhu");
        a1.set_acc_bal(6000);
        a1.set_min_bal(500);
        System.out.println("account holder name:" + a1.getacc_name());
        System.out.println("account holder id:" + a1.getacc_id());
        System.out.println("account holder bal:" + a1.getacc_bal());
        System.out.println("account holder min_bal:" + a1.getmin_bal());
        a1.cal_bal();

        CA a2 = new CA();
        a2.set_acc_id(201);
        a2.set_acc_name("naga");
        a2.set_acc_bal(60000);
        a2.set_min_bal(5000);
        System.out.println("account holder name:" + a2.getacc_name());
        System.out.println("account holder id:" + a2.getacc_id());
        System.out.println("account holder bal:" + a2.getacc_bal());
        System.out.println("account holder min_bal:" + a2.getmin_bal());
        a2.cal_bal();
    }
}
