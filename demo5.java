public class demo5 {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);

        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.longValue()); // premitative to object
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
        // System.out.println(i.booleanValue());

        String s = Integer.toString(10);
        String s1 = Double.toString(10.2); // premetetive to string
        System.out.println(s);
        System.out.println(s1);

        int i2 = Integer.parseInt("1000");
        long l = Long.parseLong("1111"); // string to premetative
        System.out.println(i2);
        System.out.println(l);

        String s2 = Integer.toString(10);
        String s3 = Float.toString(12); // object to tostring
        System.out.println(s2);
        System.out.println(s3);

        int i4 = Integer.parseInt("10");
        double d = Double.parseDouble("10.5"); // tostring to object
        System.out.println(i4);
        System.out.println(d);

    }
}
