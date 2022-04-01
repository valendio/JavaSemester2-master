package polimorphisme;

public class AeroPlan extends Vehicle {

    @Override
    public void walk(){
        System.out.println("Aeroplan Flying");
    }

    @Override
    public void fuel() {
        System.out.println("Fuels");
    }

    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.walk();
        garuda.fuel();

    }

}
