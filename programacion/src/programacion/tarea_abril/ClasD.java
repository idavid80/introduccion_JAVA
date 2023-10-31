package programacion.tarea_abril;


public class ClasD extends ClasB implements InterA, InterB {

    private static final int ATR1CLASD = 5;
    private double atr2ClasD;
    private String atr3ClasD;

    public ClasD(int sArt1ClasA, String sArt2ClasA, EnumA VALOR2, double atr2ClasD, String atr3ClasD) {
        super(sArt1ClasA, sArt2ClasA, VALOR2);
        this.atr2ClasD = atr2ClasD;
        this.atr3ClasD = atr3ClasD;
    }

    public double getAtr2ClasD() {
        return atr2ClasD;
    }

    public void setAtr2ClasD(double atr2ClasD) {
        this.atr2ClasD = atr2ClasD;
    }

    public String getAtr3ClasD() {
        return atr3ClasD;
    }

    public void setAtr3ClasD(String atr3ClasD) {
        this.atr3ClasD = atr3ClasD;
    }

    public int getATR1CLASD() {
        return ATR1CLASD;
    }


    @Override
    public double metodoAbsClasB(int a) {
       return a*ATR1CLASD;
    }  

        @Override
    public String toString() {
        return super.toString() + "ATR1CLASD = " + ATR1CLASD + ", atr2ClasD = " + atr2ClasD +
                ", atr3ClasD = " + atr3ClasD + "\n";
    }
}