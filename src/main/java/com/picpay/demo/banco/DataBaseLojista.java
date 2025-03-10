package com.picpay.demo.banco;

import com.picpay.demo.model.Lojista;

import java.util.ArrayList;
import java.util.List;

public class DataBaseLojista {
    private final List<Lojista> loj = new ArrayList<>();

    //adiciona pessoas ao lista
    public void insert(Lojista l) {
        loj.add(l);
    }

    //busca pelo cnpj
    public Lojista findOne(Long id) {
        return loj.stream()
                .filter(l -> l.getCnpj().equals(id))
                .findFirst()
                .orElse(null);
    }

    

}
