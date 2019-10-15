/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang.model.analise;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author rafae
 */
public class ErroLexico implements ANTLRErrorListener {

    List<String> errors = new ArrayList();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
//        Parser parser = (Parser) recognizer;
//
//        List<String> stack = (parser).getRuleInvocationStack();
//        Collections.reverse(stack);

//        String mensagem = "Erro sintático na linha " + line + ", coluna " + charPositionInLine + ": Regras: " + stack + ", Símbolo: " + offendingSymbol + ": " + msg;
//        String mensagem = "Erro sintático na linha " + line + ", coluna " + charPositionInLine + ": Regras: " + "??" + ", Símbolo: " + offendingSymbol + ": " + msg;;

//        errors.add(mensagem);
        errors.add(msg);
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
//        System.out.println("reportAmbiguity");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.;
//        System.out.println("reportAttemptingFullContext");
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
//        System.out.println("reportContextSensitivity");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
