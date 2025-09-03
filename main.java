public class main {
    public static void main(String[] args) {
        Inventor inventor_1 = new Inventor_1("Nikolas Tesla", 86, 100, "Bobina de Tesla",
                "Estudiar los efectos de la electricidad en el cuerpo humano",
                "una base de madera, un tubo (generalmente de PVC), alambre esmaltado (magneto) para el embobinado secundario, un transistor, una resistencia, un interruptor, una pila de 9V con su conector, y en algunos casos papel de aluminio para el terminal superior y una pelota de tecnopor o esfera de unicel como electrodo.");
        Inventor inventor_2 = new Inventor_2("Mark Zuckerberg ", 41, 100, "Meta",
                "Facebook", "React entre otros", "Calcular números de Bernoulli");
        Inventor inventor_3 = new Inventor_3("Marie Curie", 66, 100, "Descubrimiento del radio y el polonio",
                "Experimento de la radiactividad", "Medir la radiactividad de diferentes sustancias");

        inventor_1.presentar();
        System.out.println("------------------------------------");
        inventor_2.presentar();
        System.out.println("------------------------------------");
        inventor_3.presentar();
        System.out.println("------------------------------------");
        System.out.println("El jurado da la calificacion");
        inventor_1.nivel_creatividad(500);
        System.out.println("el participante " + inventor_1.nombre + " tiene " + inventor_1.getNivelCreatividad());
        inventor_2.nivel_creatividad(300);
        System.out.println("el participante " + inventor_2.nombre + " tiene " + inventor_2.getNivelCreatividad());
        inventor_3.nivel_creatividad(200);
        System.out.println("el participante " + inventor_3.nombre + " tiene " + inventor_3.getNivelCreatividad());
        inventor_1.ganador();
        inventor_2.ganador();
        inventor_3.ganador();

    }
}
