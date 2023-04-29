package com.pombimsjb.dio.gof.facade;

import com.pombimsjb.dio.gof.subsistema1.crm.CrmService;
import com.pombimsjb.dio.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);

    }
}
