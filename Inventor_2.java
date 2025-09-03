public class Inventor_2 extends Inventor{
    String nombrePrograma;
    String lenguajeUsado;
    String funcionalidad;

    Inventor_2(String nombre, Integer edad, Integer nivel_creatividad, String invento, String nombrePrograma, String lenguajeUsado, String funcionalidad){
        super(nombre, edad, nivel_creatividad, invento);
        this.nombrePrograma=nombrePrograma;
        this.lenguajeUsado=lenguajeUsado;
        this.funcionalidad=funcionalidad;

    }

    public void presentar(){
        super.presentar();
        System.out.println("El programa se llama " + this.nombrePrograma + ", el lenguaje utilizado es: " + this.lenguajeUsado + " y su funcionalidad es: " + this.funcionalidad);
    }

}
