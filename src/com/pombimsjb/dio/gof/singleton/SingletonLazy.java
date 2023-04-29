package com.pombimsjb.dio.gof.singleton;


/**
 * Singleton "Preguiçoso"
 *
 * @author Giancarlo - pombimsjb
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}