package exception.handling.task;

public class testThrow {
    static void checkAge(int age) {
        if (age <= 18) {
            throw new ArithmeticException("Anda berumur kurang dari 18");
        }
        else {
            System.out.println("Anda sudah berumur lebih 18");
        }
    }

    public static void main(String[] args) {
        checkAge(22);
    }
}
