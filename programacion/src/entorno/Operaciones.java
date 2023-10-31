package entorno;

public class Operaciones {
	int num1;
	int num2;
	
	public Operaciones(int a, int b) {

    	num1 = a;
    	num2 = b;
	}
	
    public int restar() {
    	int resultado = num1 - num2;
        return resultado;
    }

    public int multiplicar() {
    	int resultado = num1 * num2;
        return resultado;
    }

    public double dividir() {

    	double resultado = num1 / num2;
        return resultado;
    }
}
