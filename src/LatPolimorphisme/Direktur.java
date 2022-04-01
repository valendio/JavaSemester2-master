package LatPolimorphisme;

public class Direktur extends Pegawai{
    private static final int gajiDir=100_000;
    private static final int tunjangan=50_000;

    @Override
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }

}
