package one.ditialinovation.gof;
/*
 * 
 * Singleton "Preguisoço"
 */
public class SingletonLazy{
    
    private static SingletonLazy instancia;


    private SingletonLazy() {
        super();
    }


    public static SingletonLazy getinstancia() {
        if(instancia == null){
            instancia = new SingletonLazy();
        };
        return instancia;
    }


    public static void setinstancia(SingletonLazy i) {
        SungletonLazy.i = i;
    }





}