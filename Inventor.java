public class Inventor {
    String nombre;
    Integer edad;
    private Integer nivel_creatividad;
    String invento;

    public Integer getNivelCreatividad() {
        return nivel_creatividad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void nivel_creatividad(Integer puntos){
        if(puntos>0){
            nivel_creatividad += puntos;
        }
    }

    public void ganador(){
        if(this.nivel_creatividad>=500){
        System.out.println("El ganador es: " + this.nombre);
        }
    }

    public void presentar(){
        System.out.println("Hola, mi nombre es " + this.nombre + ", tengo " + this.edad + " años y mi nivel de creatividad es " + this.nivel_creatividad + ". Mi invento se llama " + this.invento);
    }


    public Inventor(String nombre, Integer edad, Integer nivel_creatividad, String invento){
        this.nombre = nombre;
        this.edad=edad;
        this.nivel_creatividad= nivel_creatividad;
        this.invento=invento;
    }

}
