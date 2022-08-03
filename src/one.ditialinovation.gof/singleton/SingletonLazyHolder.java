package one.ditialinovation.gof;

import java.io.ObjectInputStream.GetField;
/*
 * 
 * Singleton "Holder"
 */
public class SingletonLazyHolder {
    
    public static class InstanceHolder{
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }


   public static SingletonLazyHolder getInstancia(){
    return InstanceHolder.instancia;
   }




}