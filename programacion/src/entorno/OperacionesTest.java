package entorno;

class OperacionesTest {

	void testResta() {
		Operaciones halla = new Operaciones(8, 5);
		int resultado = halla.restar();
		assertEquals(3, resultado);
	}

	private void assertEquals(int i, int resultado) {
		// TODO Auto-generated method stub

	}

	private void assertEquals(int i, double resultado) {
		// TODO Auto-generated method stub

	}

	void testMultiplicacion() {
		Operaciones halla = new Operaciones(8, 5);
		int resultado = halla.multiplicar();
		assertEquals(40, resultado);
	}

	void testDivision() {
		Operaciones halla = new Operaciones(9, 3);
		double resultado = halla.dividir();
		assertEquals(5, resultado);

	}
}
