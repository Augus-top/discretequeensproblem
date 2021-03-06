/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.alee.laf.WebLookAndFeel;
import controller.ExternalIOController;
import controller.MainWindowController;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Augustop
 */
public class MainWindow extends javax.swing.JFrame {
    private MainWindowController controller;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }
    
    public MainWindow(MainWindowController ctr) {
        this.controller = ctr;
        try {
            javax.swing.UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setButtonColor(this.botaoExecutar, Color.WHITE, Color.WHITE, Color.BLACK, Color.RED, Color.DARK_GRAY, Color.RED);
        this.setButtonColor(this.botaoModuloTestes, Color.WHITE, Color.WHITE, Color.BLACK, Color.RED, Color.DARK_GRAY, Color.RED);
        this.setButtonColor(this.botaoPassoAPasso, Color.WHITE, Color.WHITE, Color.BLACK, Color.RED, Color.DARK_GRAY, Color.RED);
        this.botaoExecutar.requestFocus();
        this.getContentPane().setBackground(Color.WHITE);
        URL urlIcon = getClass().getResource("/touhou_icon.png");
        Image frameIcon = null;
        try {
            frameIcon = ExternalIOController.getImage(urlIcon);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIconImage(frameIcon.getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        this.repaint();
    }

    private void setButtonColor(com.alee.laf.button.WebButton b, Color fore, Color selFor, Color top, Color topSel, Color bot, Color botSel){
        b.setForeground (fore);
        b.setSelectedForeground (selFor);
        b.setTopBgColor (top);
        b.setTopSelectedBgColor (topSel);
        b.setBottomBgColor (bot);
        b.setBottomSelectedBgColor (botSel);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chessboardPanel = new javax.swing.JPanel();
        botaoExecutar = new com.alee.laf.button.WebButton();
        labelFalha = new javax.swing.JLabel();
        labelSucesso = new javax.swing.JLabel();
        botaoModuloTestes = new com.alee.laf.button.WebButton();
        botaoPassoAPasso = new com.alee.laf.button.WebButton();
        painelTempoIte = new javax.swing.JPanel();
        labelTempo = new javax.swing.JLabel();
        outputTempo = new javax.swing.JTextField();
        outputIteracoes = new javax.swing.JTextField();
        labelIte = new javax.swing.JLabel();
        painelCorN = new javax.swing.JPanel();
        labelCor = new javax.swing.JLabel();
        comboCor = new javax.swing.JComboBox();
        inputTamanho = new javax.swing.JTextField();
        labelTamanho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Discrete Queens Problem");
        setPreferredSize(new java.awt.Dimension(1020, 699));
        setResizable(false);

        chessboardPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout chessboardPanelLayout = new javax.swing.GroupLayout(chessboardPanel);
        chessboardPanel.setLayout(chessboardPanelLayout);
        chessboardPanelLayout.setHorizontalGroup(
            chessboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        chessboardPanelLayout.setVerticalGroup(
            chessboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        botaoExecutar.setText("Buscar Solução");
        botaoExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExecutarActionPerformed(evt);
            }
        });

        labelFalha.setForeground(new java.awt.Color(255, 0, 0));
        labelFalha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelSucesso.setForeground(new java.awt.Color(51, 51, 255));
        labelSucesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botaoModuloTestes.setText("Módulo de Testes");
        botaoModuloTestes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoModuloTestesActionPerformed(evt);
            }
        });

        botaoPassoAPasso.setText("Executar Passo a Passo");
        botaoPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPassoAPassoActionPerformed(evt);
            }
        });

        painelTempoIte.setBackground(new java.awt.Color(255, 255, 255));
        painelTempoIte.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 204), null));

        labelTempo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelTempo.setText("Tempo de Solução (MS)");

        outputTempo.setEditable(false);
        outputTempo.setBackground(new java.awt.Color(255, 255, 255));
        outputTempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputTempo.setText("0");
        outputTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTempoActionPerformed(evt);
            }
        });

        outputIteracoes.setEditable(false);
        outputIteracoes.setBackground(new java.awt.Color(255, 255, 255));
        outputIteracoes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputIteracoes.setText("0");
        outputIteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputIteracoesActionPerformed(evt);
            }
        });

        labelIte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelIte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIte.setText("Iterações");

        javax.swing.GroupLayout painelTempoIteLayout = new javax.swing.GroupLayout(painelTempoIte);
        painelTempoIte.setLayout(painelTempoIteLayout);
        painelTempoIteLayout.setHorizontalGroup(
            painelTempoIteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTempoIteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTempoIteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTempo)
                    .addComponent(labelIte, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(painelTempoIteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputTempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputIteracoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        painelTempoIteLayout.setVerticalGroup(
            painelTempoIteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTempoIteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelTempoIteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTempo)
                    .addComponent(outputTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelTempoIteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIte)
                    .addComponent(outputIteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        painelCorN.setBackground(new java.awt.Color(255, 255, 255));
        painelCorN.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 204), null));

        labelCor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCor.setText("Cor do Tabuleiro: ");

        comboCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Preto", "Azul", "Amarelo", "Cinza", "Verde", "Vermelho" }));

        inputTamanho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTamanho.setText("8");
        inputTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTamanhoActionPerformed(evt);
            }
        });

        labelTamanho.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelTamanho.setText("Tamanho do Tabuleiro: ");

        javax.swing.GroupLayout painelCorNLayout = new javax.swing.GroupLayout(painelCorN);
        painelCorN.setLayout(painelCorNLayout);
        painelCorNLayout.setHorizontalGroup(
            painelCorNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCorNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTamanho)
                    .addComponent(labelCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(painelCorNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCorNLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inputTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        painelCorNLayout.setVerticalGroup(
            painelCorNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCorNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(painelCorNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTamanho)
                    .addComponent(inputTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chessboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelFalha, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(botaoModuloTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(botaoPassoAPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(painelTempoIte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(labelSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelCorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chessboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(painelTempoIte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelFalha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoModuloTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPassoAPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExecutarActionPerformed
        this.controller.iniciarDemonstracao();
    }//GEN-LAST:event_botaoExecutarActionPerformed

    private void inputTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamanhoActionPerformed
        this.botaoExecutar.doClick();
    }//GEN-LAST:event_inputTamanhoActionPerformed

    private void outputTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputTempoActionPerformed

    private void outputIteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputIteracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputIteracoesActionPerformed

    private void botaoModuloTestesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoModuloTestesActionPerformed
        this.controller.iniciarModuloTeste();
    }//GEN-LAST:event_botaoModuloTestesActionPerformed

    private void botaoPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPassoAPassoActionPerformed
        this.controller.iniciarPassoAPasso();
    }//GEN-LAST:event_botaoPassoAPassoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton botaoExecutar;
    private com.alee.laf.button.WebButton botaoModuloTestes;
    private com.alee.laf.button.WebButton botaoPassoAPasso;
    private javax.swing.JPanel chessboardPanel;
    private javax.swing.JComboBox comboCor;
    private javax.swing.JTextField inputTamanho;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelFalha;
    private javax.swing.JLabel labelIte;
    private javax.swing.JLabel labelSucesso;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTempo;
    private javax.swing.JTextField outputIteracoes;
    private javax.swing.JTextField outputTempo;
    private javax.swing.JPanel painelCorN;
    private javax.swing.JPanel painelTempoIte;
    // End of variables declaration//GEN-END:variables

    public JPanel getChessboardPanel() {
        return chessboardPanel;
    }

    public JTextField getInputTamanho() {
        return inputTamanho;
    }

    public JLabel getLabelFalha() {
        return labelFalha;
    }

    public JComboBox getComboCor() {
        return comboCor;
    }

    public JLabel getLabelSucesso() {
        return labelSucesso;
    }

    public JTextField getOutputTempo() {
        return outputTempo;
    }

    public JTextField getOutputIteracoes() {
        return outputIteracoes;
    }
}
