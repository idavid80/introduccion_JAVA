package programacion.tarea_abril;

public class ClasC extends ClasA {
    //2. 2 atributos, uno tipo entero y otro tipo true o false.
    private int atr1ClasC;
    private boolean atr2ClasC;
    
    public ClasC(int sArt1ClasA, String sArt2ClasA, int atr1ClasC, boolean atr2ClasC) {
        super(sArt1ClasA, sArt2ClasA);
        this.atr1ClasC = atr1ClasC;
        this.atr2ClasC = atr2ClasC;
    }

    public int getAtr1ClasC() {
        return atr1ClasC;
    }

    public void setAtr1ClasC(int atr1ClasC) {
        this.atr1ClasC = atr1ClasC;
    }

    public boolean getAtr2ClasC() {
        return atr2ClasC;
    }

    public void setAtr2ClasC(boolean atr2ClasC) {
        this.atr2ClasC = atr2ClasC;
    }

    @Override
    public String toString() {
        return super.toString() + "atr1ClasC = " + atr1ClasC +
                ", atr2ClasC = " + atr2ClasC + "\n";
    }
}
