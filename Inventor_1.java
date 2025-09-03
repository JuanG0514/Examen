public class Inventor_1 extends Inventor {
    
    String descripcion;
    String materiales;


    public void presentar(){
        super.presentar();
        System.out.println(" su descripción es: " + this.descripcion + " y los materiales utilizados son: " + this.materiales);
    }

    public Inventor_1(String nombre, Integer edad, Integer nivel_creatividad, String invento, String descripcion, String materiales ){
        super(nombre, edad, nivel_creatividad, invento);
        this.descripcion=descripcion;
        this.materiales=materiales; 

    }

}
