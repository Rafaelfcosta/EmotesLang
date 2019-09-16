/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang;

import br.univali.emoteslang.model.analise.TratadorErrosLexico;
import br.univali.emoteslang.model.analise.TratadorErrosSintatico;
import br.univali.emoteslang.model.language.EmoteslangLexer;
import br.univali.emoteslang.model.language.EmoteslangParser;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author rafae
 */
public class EmotesLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(EmotesLang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.setVisible(true);
        
        if(filechooser.showOpenDialog(filechooser) == JFileChooser.APPROVE_OPTION){
            File file = filechooser.getSelectedFile();
            
            try {
                String code = new String(Files.readAllBytes(file.toPath()));
                System.out.println(code);
                                
                ANTLRInputStream ais = new ANTLRInputStream(code);
                EmoteslangLexer lexer = new EmoteslangLexer(ais);
                CommonTokenStream stream = new CommonTokenStream(lexer);
                EmoteslangParser parser = new EmoteslangParser(stream);
                
                lexer.removeErrorListeners();
                parser.removeErrorListeners();
                
                List<String> erros = new ArrayList();
                
                TratadorErrosLexico errosLexico = new TratadorErrosLexico(erros);
                TratadorErrosSintatico errosSintatico = new TratadorErrosSintatico(erros);
                
                lexer.addErrorListener(errosLexico);
                parser.addErrorListener(errosSintatico);
                
                parser.program();
                
                for (String erro : erros) {
                    System.out.println(erro);
                }             
                
            } catch (IOException ex) {
                Logger.getLogger(EmotesLang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
