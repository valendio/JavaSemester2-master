package modul2.enkapsulasi.TugasPraktikum2;
class main {
private double l;

    private double r;
    private double v;
    private double d;

    public double getL() {
        l = 4d * Math.PI*Math.pow(r,2d);
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    public double getR() {
        return r;
    }
    public double setR(double r) {
        this.r = r;
        return 0;
    }
    public double getV() {
        v = 4d/3*Math.PI*Math.pow(getR(), 3);
        return v;
    }
    public void setV(double v) {
        this.v = v;
    }
    public double getD() {
        d = getR()*2;
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
}
    /* V = ⁴⁄₃πr³*/
    //L = 4 × π × r²
/*Method
* ==>Set R
* ==>Set D
* ==>Show Luas
* ==>Show Volume*/
