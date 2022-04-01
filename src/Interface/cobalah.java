package Interface;

public class cobalah {

    public static void main(String[] args) {
        Line coba = new Line(2.5,3,4,5);
        Line pertama = new Line(3,4,5,6);
        coba.getLength();
        coba.isGreater(coba, pertama);
        System.out.println("Is Greater = "+coba.isGreater(coba, pertama));

        coba.getLength();
        coba.isLess(coba, pertama);
        System.out.println("Is Less = "+coba.isLess(coba, pertama));

        coba.getLength();
        coba.isEqual(coba, pertama);
        System.out.println("Is Equal = "+coba.isEqual(coba, pertama));

    }

}
