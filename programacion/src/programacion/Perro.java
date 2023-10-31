package programacion;

public class Perro extends Animal{
	
    public Perro(String nombre) {
        super(nombre);
    }
    public void hacerSonido() {
        System.out.println(nombre + "dice guau");
    }
}
