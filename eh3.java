public class eh3 {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("person is not eligibleto vote");
        } else {
            System.out.println("person eligible to vote");
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of code");
    }
}
