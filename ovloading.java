class ovloading {

    public int a(int a) {
        return a;

    }

    public String a(String b) {
        return b;

    }

    public static void main(String[] args) {
        ovloading a1 = new ovloading();
        System.out.println(a1.a(10));
        System.out.println(a1.a("madhu"));
    }
}
