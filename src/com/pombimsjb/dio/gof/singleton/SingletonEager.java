package com.pombimsjb.dio.gof.singleton;

/**
 * Singleton "Apressado"
 *
 * @author Giancarlo - pombimsjb
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
