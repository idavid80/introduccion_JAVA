package programacion.tarea_abril;


public abstract class ClasA {

    private int atr1ClasA;
    private String atr2ClasA;
    private static int atr3ClasA = 0;

    public ClasA(int atr1ClasA, String atr2ClasA) {
        this.atr1ClasA = atr1ClasA;
        this.atr2ClasA = atr2ClasA;
        ClasA.atr3ClasA ++;
    }

    public int getAtr1ClasA() {
        return atr1ClasA;
    }

    public void setAtr1ClasA(int atr1ClasA) {
        this.atr1ClasA = atr1ClasA;
    }

    public String getAtr2ClasA() {
        return atr2ClasA;
    }

    public void setAtr2ClasA(String atr2ClasA) {
        this.atr2ClasA = atr2ClasA;
    }

    public static int getAtr3ClasA() {
        return atr3ClasA;
    }

    @Override
    public String toString() {
        return "\natr1ClasA = " + atr1ClasA +
                ", atr2ClasA = " + atr2ClasA + "\n";
    }
}

