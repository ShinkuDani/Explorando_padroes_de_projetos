package one.ditialinovation.gof;
/*
 * 
 * Singleton "Apressado"
 */
public class SingletonEargy {
    
    private static SingletonEargy instancia;


    private SingletonEargy() {
        super();
    }

    public static SingletonEargy getInstancia() {
        return instancia;
    }






}