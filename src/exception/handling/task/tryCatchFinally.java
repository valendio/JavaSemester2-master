package exception.handling.task;

public class tryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] num = {0, 1, 2, 3};
            System.out.println(num[1]);
        } catch (Exception e) {
            System.out.println("Angka salah");
        } finally {
            System.out.println("Angka benar");
        }
    }
}
