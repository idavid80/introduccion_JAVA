package programacion.tarea_abril;

public class Main {

    public static void main(String[] args) {

        ClasC objC = new ClasC(3, "dato2A en claseC", 6, false);
        ClasD objD = new ClasD(5, "dato2A en claseD", EnumA.VALOR1, 25.6, "ObjetoD");
        ClasE objE = new ClasE(8, "dato2A en claseE", EnumA.VALOR3, "atributoE1", "atributoE2");
        
        System.out.println("**Datos objeto C**\n" + objC.toString());
        System.out.println("**Datos objeto D**\n" +objD.toString());
        System.out.println("**Datos objeto E**\n" +objE.toString());
        
        System.out.println("Total de objetos instanciados de tipo ClasA: "+ ClasA.getAtr3ClasA() + "\n");
        
        System.out.println("Método abstracto en clase B e implementado en clsae D = " + objD.metodoAbsClasB(6) + "\n");
        System.out.println("Método abstracto en clase B e implementado en clsae E = " + objE.metodoAbsClasB(6) + "\n");
    }
}
