/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.AcessoInquilinosController;
import Controllers.InquilinoController;
import Dto.Request.CadastroAcessoAreaRequestDto;
import Models.AcessoAreaModel;
import Models.AreaModel;
import Models.InquilinoModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Thais Dias
 */
public class TelaCadastroAcesso extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAcesso
     */
    private AcessoInquilinosController _acessoInquilinosCon;
    private InquilinoController _inquilinoController = new InquilinoController();
    public AreaModel area;

    public TelaCadastroAcesso() {
        super("Cadastro de Acesso");
        initComponents();
        setLocationRelativeTo(null);
    }

    public final void atualizarLista() {
        try {
            cboxAcessos.setModel(new DefaultComboBoxModel<>(_acessoInquilinosCon.montarListaAcessosInquilino()));
            Date date = new Date();

            spnDiaIni.setValue(date);
            spnDiaFim.setValue(date);

            _acessoInquilinosCon.acessoSelecionado = null;
            this.habilitarDesabilitarBotoes(false);

        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean camposPreenchidos() {
        if (spnDiaIni.getValue().equals("")
                && spnDiaFim.getValue().equals("")) {
            return false;
        }
        return true;
    }

    public void habilitarDesabilitarBotoes(boolean enabled) {
        if (enabled) {
            btnAtualizar.setEnabled(true);
            btnApagar.setEnabled(true);
            lblAcessoBotoes.setText("");
        } else {
            btnAtualizar.setEnabled(false);
            btnApagar.setEnabled(false);
            lblAcessoBotoes.setText("Selecione um Acesso para Editar/Apagar");
        }
    }

    public void setArea(AreaModel area, AcessoInquilinosController acessoController) {

        this.area = area;
        this._acessoInquilinosCon = acessoController;
        labelArea.setText(this.area.toString());

        try {
            cboxInquilino.setModel(new DefaultComboBoxModel<>(_inquilinoController.montarListaInquilinoReq(this.area)));
            InquilinoModel inq = (InquilinoModel) cboxInquilino.getSelectedItem();

            if (inq != null) {
                this._acessoInquilinosCon.definirInquilinoSelecionado(inq);
                this.atualizarLista();
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxInquilino = new javax.swing.JComboBox<>();
        Date date2 = new Date();
        SpinnerDateModel sm02 =
        new SpinnerDateModel(date2, null, null, Calendar.DATE);
        spnDiaFim = new javax.swing.JSpinner(sm02);
        Date date1 = new Date();
        SpinnerDateModel sm01 =
        new SpinnerDateModel(date1, null, null, Calendar.DATE);
        spnDiaIni = new javax.swing.JSpinner(sm01);
        jLabel1 = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        cboxAcessos = new javax.swing.JComboBox<>();
        btnApagar = new javax.swing.JButton();
        lblAcessoBotoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboxInquilino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxInquilinoItemStateChanged(evt);
            }
        });
        cboxInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInquilinosActionPerformed(evt);
            }
        });
        cboxInquilino.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), " Inquilinos que atendem ao número de doses requisitado"));
        cboxInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxInquilinoActionPerformed(evt);
            }
        });

        spnDiaFim.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Final"));

        spnDiaIni.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Inicial"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Área:");

        labelArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelArea.setForeground(new java.awt.Color(0, 0, 255));
        labelArea.setText("Baile");

        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(77, 22));
        btnVoltar.setMinimumSize(new java.awt.Dimension(77, 22));
        btnVoltar.setPreferredSize(new java.awt.Dimension(125, 40));
        btnVoltar.setRequestFocusEnabled(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setMaximumSize(new java.awt.Dimension(77, 22));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(77, 22));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(125, 40));
        btnCadastrar.setRequestFocusEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Editar");
        btnAtualizar.setMaximumSize(new java.awt.Dimension(77, 22));
        btnAtualizar.setMinimumSize(new java.awt.Dimension(77, 22));
        btnAtualizar.setPreferredSize(new java.awt.Dimension(125, 40));
        btnAtualizar.setRequestFocusEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        cboxAcessos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Acessos"));
        cboxAcessos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxAcessosItemStateChanged(evt);
            }
        });
        cboxAcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAcessosActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.setMaximumSize(new java.awt.Dimension(77, 22));
        btnApagar.setMinimumSize(new java.awt.Dimension(77, 22));
        btnApagar.setPreferredSize(new java.awt.Dimension(125, 40));
        btnApagar.setRequestFocusEnabled(false);
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        lblAcessoBotoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAcessoBotoes.setForeground(new java.awt.Color(0, 51, 255));
        lblAcessoBotoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelArea)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAcessoBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxInquilino, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnDiaFim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnDiaIni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxAcessos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelArea))
                .addGap(26, 26, 26)
                .addComponent(cboxInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(cboxAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnDiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnDiaFim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblAcessoBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxInquilinoItemStateChanged(java.awt.event.ItemEvent evt) {
        InquilinoModel inquilino = (InquilinoModel) cboxInquilino.getSelectedItem();
        _acessoInquilinosCon.definirInquilinoSelecionado(inquilino);

        try {
            cboxAcessos.setModel(new DefaultComboBoxModel<>(_acessoInquilinosCon.montarListaAcessosInquilino()));
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroAcessoAreaRequestDto request = new CadastroAcessoAreaRequestDto();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        InquilinoModel inquilino = (InquilinoModel) cboxInquilino.getSelectedItem();

        request.setIdInquilino(inquilino.getIdInquilino());
        request.setIdArea(this.area.getIdArea());
        request.setHrIni(sdf.format(spnDiaIni.getValue()));
        request.setHrFim(sdf.format(spnDiaFim.getValue()));

        JOptionPane.showMessageDialog(null, this._acessoInquilinosCon.CadatrarAcesso(request));
        if (!_acessoInquilinosCon.erroReq)
            this.atualizarLista();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        AcessoAreaModel acesso = (AcessoAreaModel) cboxAcessos.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        if (this.camposPreenchidos()) {
            acesso.setHrIni(sdf.format(spnDiaIni.getValue()));
            acesso.setHrFim(sdf.format(spnDiaFim.getValue()));

            _acessoInquilinosCon.acessoSelecionado = acesso;

            JOptionPane.showMessageDialog(null, _acessoInquilinosCon.atualizarAcesso());

            if (!_inquilinoController.erroReq) {
                atualizarLista();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void cboxAcessosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxAcessosItemStateChanged
        AcessoAreaModel acesso = (AcessoAreaModel) cboxAcessos.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try {
            String dtIni = acesso.getHrIni();
            if (dtIni != null) {
                spnDiaIni.setValue((Date) sdf.parse(dtIni));
            }

            String dtFim = acesso.getHrFim();
            if (dtFim != null) {
                spnDiaFim.setValue((Date) sdf.parse(dtFim));
            }

            _acessoInquilinosCon.acessoSelecionado = acesso;
            this.habilitarDesabilitarBotoes(false);

        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboxAcessosItemStateChanged

    private void cboxAcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAcessosActionPerformed
        AcessoAreaModel acesso = (AcessoAreaModel) cboxAcessos.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try {
            String dtIni = acesso.getHrIni();
            if (dtIni != null) {
                spnDiaIni.setValue((Date) sdf.parse(dtIni));
            }

            String dtFim = acesso.getHrFim();
            if (dtFim != null) {
                spnDiaFim.setValue((Date) sdf.parse(dtFim));
            }

            _acessoInquilinosCon.acessoSelecionado = acesso;
            this.habilitarDesabilitarBotoes(true);

        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroAcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboxAcessosActionPerformed

    private void cboxInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxInquilinoActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        AcessoAreaModel acesso = (AcessoAreaModel) cboxAcessos.getSelectedItem();
        _acessoInquilinosCon.acessoSelecionado = acesso;

        JOptionPane.showMessageDialog(null, _acessoInquilinosCon.deletarAcesso());
        if (!_inquilinoController.erroReq)
            atualizarLista();
    }//GEN-LAST:event_btnApagarActionPerformed
    private void comboInquilinosActionPerformed(java.awt.event.ActionEvent evt) {
    }

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
            java.util.logging.Logger.getLogger(TelaCadastroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<AcessoAreaModel> cboxAcessos;
    private javax.swing.JComboBox<InquilinoModel> cboxInquilino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel lblAcessoBotoes;
    private javax.swing.JSpinner spnDiaFim;
    private javax.swing.JSpinner spnDiaIni;
    // End of variables declaration//GEN-END:variables
}
