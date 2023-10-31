package programacion;

public abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
    
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}
