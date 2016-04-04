/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private static int numeroClase;
    private ArrayListInt notas;
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numeroClase+=1;
        notas = new ArrayListInt();
    }
    
    /**
     * Metodo que añade notas.
     */
    public void addNota(int nota)
    {
        notas.add(nota);
    }
    
    /**
     * Metodo que devuelve la media redondeada de las notas de las notas
     */
    public int media()
    {
        int media = 0;
        for(int cont = 0; cont < notas.size();cont++){
            media = media + notas.get(cont);
        }
        return media/notas.size();
    }
    /**
     * Metodo que devuelve true si estas aprobado y flase si estas suspenso
     */
    public boolean aprobado()
    {
        boolean aprobado = false;
        if(media()>=5){
            aprobado = true;
        }
        return aprobado;
    }
}
