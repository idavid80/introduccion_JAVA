package programacion.tarea_abril;

public class ClasE extends ClasB implements InterB {

	private final int ART1CLASE = 10;
	private String atr2ClasE, atr3ClasE;

	public ClasE(int sArt1ClasA, String sArt2ClasA, EnumA VALOR1, String atr2ClasE, String atr3ClasE) {
		super(sArt1ClasA, sArt2ClasA, VALOR1);
		this.atr2ClasE = atr2ClasE;
		this.atr3ClasE = atr3ClasE;
	}

	public String getAtr2ClasE() {
		return atr2ClasE;
	}

	public void setAtr2ClasE(String atr2ClasE) {
		this.atr2ClasE = atr2ClasE;
	}

	public String getAtr3ClasE() {
		return atr3ClasE;
	}

	public void setAtr3ClasE(String atr3ClasE) {
		this.atr3ClasE = atr3ClasE;
	}

	@Override
	public double metodoAbsClasB(int a) {
		return a * ART1CLASE;
	}

	@Override
	public String toString() {
		return super.toString() + "ART1CLASE = " + ART1CLASE + ", atr2ClasE = " + atr2ClasE + ", atr3ClasE = "
				+ atr3ClasE + "\n";
	}

}