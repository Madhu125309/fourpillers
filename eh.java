public class eh {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 5);
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(10 / 2);
        } finally {
            System.out.println(10 / 11);
        }
    }
}
