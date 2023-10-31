package programacion.tarea_abril;

public abstract class ClasB extends ClasA{

    private EnumA enumClasB;

    public ClasB(int sArt1ClasA, String sArt2ClasA, EnumA enumClasB) {
        super(sArt1ClasA, sArt2ClasA);
        this.enumClasB = enumClasB;
    }

    public EnumA getEnumValue() {
        return enumClasB;
    }

    public void setEnumClasB(EnumA enumClasB) {
        this.enumClasB = enumClasB;
    }


    public abstract double metodoAbsClasB(int a);

    @Override
    public String toString() {
        return super.toString() + "tipo enum = " + enumClasB + "\n";
    }
    
}
