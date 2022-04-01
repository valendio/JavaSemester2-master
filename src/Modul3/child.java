package Modul3;

public class child extends mainApp{
    public child(){
        super();
    }

    private void printPerforma(String performa, int gaji) {
        System.out.println("gaji yang didapat jika bekerja secara "+performa+" menjadi "+gaji);
    }

    void gaji(String performa) {
        switch (performa){
            case "baik":
                printPerforma(performa, this.gaji*2);
                break;
            case "normal":
                printPerforma(performa, this.gaji);
                break;
            case "buruk":
                printPerforma(performa, this.gaji/2);
                break;
        }
    }
}
