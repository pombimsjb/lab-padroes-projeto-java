package com.pombimsjb.dio.gof.subsistema2.cep;

import com.pombimsjb.dio.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {

        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Joaquim da barra";
    }
    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}
