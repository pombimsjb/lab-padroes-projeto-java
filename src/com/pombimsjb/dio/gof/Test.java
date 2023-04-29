package com.pombimsjb.dio.gof;

import com.pombimsjb.dio.gof.facade.Facade;
import com.pombimsjb.dio.gof.singleton.SingletonEager;
import com.pombimsjb.dio.gof.singleton.SingletonLazy;
import com.pombimsjb.dio.gof.singleton.SingletonLazyHolder;
import com.pombimsjb.dio.gof.strategy.*;

public class Test {
    //Testes relacionados ao Design Pattern Singleton:
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        System.out.println(" ");
        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        System.out.println("Robo foi atacado");
        robo.setComportamento(defensivo);
        robo.mover();
        System.out.println("Robo vai contra-atacar");
        robo.setComportamento(agressivo);
        robo.mover();

        System.out.println(" ");
        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Giancarlo","14600-000");

    }
}
