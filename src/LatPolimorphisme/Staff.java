package LatPolimorphisme;

public class Staff extends Pegawai{
    private static final int gajiStaf=50_000;
    private static final int bonusStaf=10_000;

    @Override
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }

}
