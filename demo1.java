public class demo1 {
    public static void main(String[] args) {
        String s = new String("Madhu");
        String s1 = new String("hari"); //
        String s2 = new String("madhu");

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s1.equals(s2));
    }
}
