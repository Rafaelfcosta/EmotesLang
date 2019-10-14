/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang.model.visitor;

import br.univali.emoteslang.model.analise.Identificador;
import br.univali.emoteslang.model.analise.Escopo;
import br.univali.emoteslang.model.language.EmoteslangBaseVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public abstract class EmotesVisitor extends EmoteslangBaseVisitor<Object>{
    
    protected final List<Identificador> tabelaSimbolos;
    protected Escopo escopoAtual;
    protected Identificador.Tipo tipoAtual;
    protected int multidimensional;
    protected int qtdMultidimensional;
    protected enum Operation{
        MAIORQUE,MENORQUE,MAIOROUIGUAL,MENOROUIGUAL,IDENTICO,DIFERENTE,
        BITSHIFTLEFT,BITSHIFTRIGHT,BITNOT,
        SUBTRACAO,SOMA,MOD,MULTIPLICACAO,DIVISAO,
        OR,AND,NOT
    };

    protected Operation operacao;
    /**
     * Construtor do analisador semantico, Pode aceitar uma tabela de simbolos
     * pré iniciada.
     *
     * @param tabelaSimbolos pode ser NULL
     */
    protected EmotesVisitor(List<Identificador> tabelaSimbolos)
    {
        if (tabelaSimbolos != null)
        {
            this.tabelaSimbolos = tabelaSimbolos;
        } else
        {
            this.tabelaSimbolos = new ArrayList();
        }
    }
    protected Escopo vaiEscopoFilho(String nome){
        List<Escopo> subs = escopoAtual.getSubEscopos();
        for (Escopo sub : subs) {
            if(sub.getNome().equals(nome)){
                return sub;
            }
        }
        return null;
    }
    protected void retornaEscopoPai()
    {
        escopoAtual = escopoAtual.getPai();
    }
    
    
}
