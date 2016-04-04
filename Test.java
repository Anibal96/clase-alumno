import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private static final int EDAD_MAXIMA = 30;
    /**
     * Metodo test para la clase alumno.
     */
    public void test(){
        ArrayList<String>nombreAlumnos = new ArrayList<String>();
        Alumno alumno;
        ArrayList<Alumno>alumnos = new ArrayList<Alumno>();
        Random numeros = new Random();
        nombreAlumnos.add("Anibal");
        nombreAlumnos.add("Jose");
        nombreAlumnos.add("Dani");
        nombreAlumnos.add("Pepe");
        nombreAlumnos.add("Juan");
        nombreAlumnos.add("Alba");
        nombreAlumnos.add("Vero");

        alumnos.add(alumno = new Alumno(nombreAlumnos.get(numeros.nextInt(nombreAlumnos.size())),(numeros.nextInt(EDAD_MAXIMA) + 15)));
        alumnos.add(alumno = new Alumno(nombreAlumnos.get(numeros.nextInt(nombreAlumnos.size())),(numeros.nextInt(EDAD_MAXIMA) + 15)));
        alumnos.add(alumno = new Alumno(nombreAlumnos.get(numeros.nextInt(nombreAlumnos.size())),(numeros.nextInt(EDAD_MAXIMA) + 15)));
        alumnos.add(alumno = new Alumno(nombreAlumnos.get(numeros.nextInt(nombreAlumnos.size())),(numeros.nextInt(EDAD_MAXIMA) + 15)));
        alumnos.add(alumno = new Alumno(nombreAlumnos.get(numeros.nextInt(nombreAlumnos.size())),(numeros.nextInt(30) + 15)));
        for(int cont = 0; cont==2; cont++){
            for(Alumno alumnos1:alumnos){
                alumnos1.addNota(numeros.nextInt(11));
            }
        }

        for(Alumno alumnos1:alumnos){
            System.out.println(alumnos1);
        }
    }
}
