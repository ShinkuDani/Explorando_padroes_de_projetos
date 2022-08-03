package one.ditialinovation.gof;
import one.ditialinovation.gof.SingletonEargy;
import one.ditialinovation.gof.SingletonLazy;
import one.ditialinovation.gof.SingletonLazyHolder;
import one.ditialinovation.gof.strategy.Comportamento;
import one.ditialinovation.gof.strategy.ComportamentoAgressivo;
import one.ditialinovation.gof.strategy.ComportamentoDefensivo;
import one.ditialinovation.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        SingletonEargy eargy = new SingletonEargy.getInstancia();
        System.out.println(eargy);

        SingletonLazy lazy = new SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonLazyHolder holder = new SingletonLazyHolder.getInstancia();
        System.out.println(holder);


        //STRATEGY

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defesivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defesivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //FACADE

        Facade facade = new Facade();

        facade.migrarCliente("Daniel","02483067");

        

    }
}
