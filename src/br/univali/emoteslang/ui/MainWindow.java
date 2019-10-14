/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang.ui;

import br.univali.emoteslang.EmotesLang;
import br.univali.emoteslang.model.analise.ErroLexico;
import br.univali.emoteslang.model.analise.Identificador;
import br.univali.emoteslang.model.language.EmoteslangLexer;
import br.univali.emoteslang.model.language.EmoteslangParser;
import br.univali.emoteslang.model.visitor.EmotesSemanticVisitor;
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author noschang
 */
public class MainWindow extends javax.swing.JFrame {

    RSyntaxTextArea emotesTextArea;
    RTextScrollPane emotesScrollPane;
    List<Identificador> ids = null;

    public MainWindow() {
        initComponents();
//        painelEditor.setBackground(new Color(100,65,164));
//        painelMsgs.setBackground(new Color(100,65,164));
//        listaMensagens.setBackground(new Color(100,65,164));
        this.setSize(1024, 768);

        emotesTextArea = new RSyntaxTextArea(20, 60);

        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/emotesLanguage", "br.univali.emoteslang.ui.rsa.EmotesTokenMaker");

        emotesTextArea.setSyntaxEditingStyle("text/emotesLanguage");

        Theme theme = carregarTema();
        theme.apply(emotesTextArea);

        emotesTextArea.setText("HeyGuys\n"
                + "    Kappa\n"
                + "	\n"
                + "	    	TriHard void main P( )G \n"
                + "	    	Kappa\n"
                + "	    	\n"
                + "	    	KappaPride\n"
                + "    	\n"
                + "    KappaPride\n"
                + "RIP");

        emotesScrollPane = new RTextScrollPane(emotesTextArea);
        painelEditor.add(emotesScrollPane);

        setLocationRelativeTo(null);

    }

    private Theme carregarTema() {
        final String caminho = "br/univali/emoteslang/ui/resources/dark.xml";
        final InputStream resourceStream = ClassLoader.getSystemClassLoader().getResourceAsStream(caminho);
        if (resourceStream != null) {
            try {
                return Theme.load(resourceStream);
            } catch (IOException e) {

            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSplitPane1 = new javax.swing.JSplitPane();
        painelEditor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        painelMsgs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMensagens = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnOpen = new javax.swing.JMenuItem();
        btnSave = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste de Gramática");

        jSplitPane1.setDividerLocation(500);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        painelEditor.setToolTipText("");
        painelEditor.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Código:");
        painelEditor.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompilar, java.awt.BorderLayout.EAST);

        painelEditor.add(jPanel1, java.awt.BorderLayout.SOUTH);

        jSplitPane1.setTopComponent(painelEditor);

        painelMsgs.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Mensagens:");
        painelMsgs.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setViewportView(listaMensagens);

        painelMsgs.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(painelMsgs);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        btnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpen);

        btnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(btnSave);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCompilarActionPerformed
    {//GEN-HEADEREND:event_btnCompilarActionPerformed
        ANTLRInputStream ais = new ANTLRInputStream(emotesTextArea.getText());
        EmoteslangLexer lexer = new EmoteslangLexer(ais);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        EmoteslangParser parser = new EmoteslangParser(stream);

        DefaultListModel modeloLista = new DefaultListModel();
        listaMensagens.setModel(modeloLista);

//        TratadorErrosLexico tratadorErrosLexico = new TratadorErrosLexico(modeloLista);
//        TratadorErrosSintatico tratadorErrosSintatico = new TratadorErrosSintatico(modeloLista);
        // Remove o tratador de erros padrão do lexer e do parser
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        // Instala o tratador de erros personalizado que irá exibir as mensagens
        // em tela na JList
//        lexer.addErrorListener(tratadorErrosLexico);
//        parser.addErrorListener(tratadorErrosSintatico);
        ErroLexico erroLexico = new ErroLexico();
        lexer.addErrorListener(erroLexico);
        parser.addErrorListener(erroLexico);

        // Chama a regra inicial do parser, esta regra deve estar definida na gramática
        ParseTree tree = parser.program();
//        parser.program();

//        if (modeloLista.isEmpty()) {
        if (erroLexico.getErrors().isEmpty()) {          
            modeloLista.addElement("Compilado com sucesso!");
            EmotesSemanticVisitor visitor = new EmotesSemanticVisitor(new ArrayList<Identificador>());
            try {
                visitor.visit(tree);
                ids = visitor.getTabelaSimbolos();
                
                
                Tree parseTreeRoot = tree;
                TreeNodeWrapper nodeRoot = new TreeNodeWrapper(parseTreeRoot);
                fillTree(nodeRoot, parseTreeRoot);

                JFrame frame = new JFrame("Árvore Sintática");
                frame.setContentPane(new JScrollPane(new TreeViewer(Arrays.asList(parser.getRuleNames()), tree)));
                frame.setPreferredSize(new Dimension(800, 600));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                

            } catch (Exception e) {
                System.out.println(e.getMessage());
                
                erroLexico.getErrors().add(e.getMessage());
                modeloLista.addElement(e.getMessage());
            }
        } else {
            for (String erro : erroLexico.getErrors()) {
                modeloLista.addElement(erro);
            }
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private static class TreeNodeWrapper extends DefaultMutableTreeNode {

        TreeNodeWrapper(Tree tree) {
            super(tree);
        }

    }

    private static void fillTree(TreeNodeWrapper node, Tree tree) {

        if (tree == null) {
            return;
        }

        for (int i = 0; i < tree.getChildCount(); i++) {

            Tree childTree = tree.getChild(i);
            TreeNodeWrapper childNode = new TreeNodeWrapper(childTree);

            node.add(childNode);

            fillTree(childNode, childTree);
        }
    }
    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        JFileChooser filechooser = new JFileChooser("./code_samples");
        filechooser.setVisible(true);

        if (filechooser.showOpenDialog(filechooser) == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();

            try {
                String code = new String(Files.readAllBytes(file.toPath()));
                emotesTextArea.setText(code);

                emotesTextArea.setCaretPosition(0);

            } catch (IOException ex) {
                Logger.getLogger(EmotesLang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser filechooser = new JFileChooser("./code_samples");
        filechooser.showSaveDialog(this);

        try (FileWriter fw = new FileWriter(filechooser.getSelectedFile() + ".txt")) {
            fw.write(emotesTextArea.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompilar;
    private javax.swing.JMenuItem btnOpen;
    private javax.swing.JMenuItem btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList listaMensagens;
    private javax.swing.JPanel painelEditor;
    private javax.swing.JPanel painelMsgs;
    // End of variables declaration//GEN-END:variables
}
