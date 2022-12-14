package clases;

public class clasecolor {
    private static String color;
    /**
     * Clase principal utilizada para ejecutar la aplicación
     * @author  Consejería de Educación
    */
    public static void main(String[] args) {


        profesor teacherSalva = new profesor();
        color = teacherSalva.preguntacolor();
        String mensaje = "La respuesta recibida es:";
        System.out.println(mensaje + color);
		
		imprimirValores(10, 5);
    }

    /**
     *
     * @param iParamUno Primer parámetro
     * @param iParamDos Segundo parámetro
     */
    public static void imprimirValores(int iParamUno, int iParamDos){
        System.out.println("Primer parametro: " + iParamUno);
        System.out.println("Segundo  parametro: " + iParamDos);
    }	
}
