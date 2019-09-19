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
import br.univali.emoteslang.ui.MainWindow;
import com.alee.laf.WebLookAndFeel;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
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
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(EmotesLang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        }
        );

    }

}
