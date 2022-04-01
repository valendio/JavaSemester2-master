package Modul1;

public class latihan12_ConversiSuhu {
    public static void main(String[] args) {
        var c = 78;
        System.out.println("Convert Celcius to Reamur : " +CtoR(c));
        System.out.println("Convert Celcius to Fahrenheit : " +CtoF(c));
        System.out.println("Convert Celcius to Kelven : " +CtoK(c));}
    static double CtoR (double c){ return 0.8*c;}
    static double CtoF (double c) {
        return 1.8*c+32;
    }
    static double CtoK (double c) {return c+273;}}
//2.Buat program konversi suhu 78o C ke dalam satuan Reamur, Farenheit dan Kelvin