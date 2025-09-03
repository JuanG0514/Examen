public class Inventor_3 extends Inventor {
    String nombreExperiment;
    String objetivoExperimento;

    public Inventor_3(String nombre, Integer edad, Integer nivel_creatividad, String invento, String nombreExperiment, String objetivoExperimento){
        super(nombre, edad, nivel_creatividad, invento);
        this.nombreExperiment=nombreExperiment;
        this.objetivoExperimento=objetivoExperimento;

    }

    public void presentar(){
        super.presentar();
        System.out.println("El experimento se llama " + this.nombreExperiment + " y su objetivo es: " + this.objetivoExperimento);
    }

}
