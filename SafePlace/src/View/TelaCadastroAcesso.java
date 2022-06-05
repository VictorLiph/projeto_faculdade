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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
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
    private InquilinoController _inquilinoController;
    public AreaModel area;

    public TelaCadastroAcesso() {
        super("Cadastro de Acesso");
        initComponents();
        setLocationRelativeTo(null);
        _inquilinoController = new InquilinoController();
    }

    public final void atualizarDados() {
        /*try {
            //_acessoInquilinosCon.montarListaInquilino();
            if (_acessoInquilinosCon.listaInq != null) {
                cboxInquilino.setModel(new DefaultComboBoxModel<>(_acessoInquilinosCon.listaInq));
            }
            //this.setEnableBtnCadastrar();

        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);

        }*/
        try 
        {            
            cboxInquilino.setModel(new DefaultComboBoxModel<>(_inquilinoController.montarListaInquilino()));
            
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setArea(AreaModel area, AcessoInquilinosController acessoController) {
        this.area = area;
        this._acessoInquilinosCon = acessoController;
        labelArea.setText(this.area.getDescricao());
        this.atualizarDados();
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
        cboxInquilino.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), " Inquilino "));

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnDiaFim, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(spnDiaIni)
                        .addComponent(cboxInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 117, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(spnDiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnDiaFim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxInquilinoItemStateChanged(java.awt.event.ItemEvent evt){
        //AcessoAreaModel acesso = (AcessoAreaModel)cboxInquilino.getSelectedItem();
        
        //montarListaInquilino;
        this._acessoInquilinosCon.montarListaInquilino();
        //this._acessoInquilinosCon.acessoSelecionado.setHrIni(acesso.getHrIni());
        //this._acessoInquilinosCon.acessoSelecionado.setHrFim(acesso.getHrFim());
        //spnDiaIni.setValue(this._acessoInquilinosCon.acessoSelecionado.getHrIni());
        //spnDiaIni.setValue(this._acessoInquilinosCon.acessoSelecionado.getHrFim());
        System.out.println(this._acessoInquilinosCon.acessoSelecionado.getHrIni());
        System.out.println(this._acessoInquilinosCon.acessoSelecionado.getHrFim());
    }
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroAcessoAreaRequestDto request = new CadastroAcessoAreaRequestDto();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        InquilinoModel inquilino = (InquilinoModel) cboxInquilino.getSelectedItem();
        request.setIdInquilino(inquilino.getIdInquilino());
        request.setHrIni(sdf.format(spnDiaIni.getValue()));
        request.setHrFim(sdf.format(spnDiaIni.getValue()));

        JOptionPane.showMessageDialog(null, this._acessoInquilinosCon.CadatrarAcesso(request));

        String ini = sdf.format(spnDiaIni.getValue());
        String fim = sdf.format(spnDiaIni.getValue());
        System.out.println("AQUI ------------ " + ini + " --- " + fim + " -- ");
    }//GEN-LAST:event_btnCadastrarActionPerformed
    private void comboInquilinosActionPerformed(java.awt.event.ActionEvent evt) {
        //InquilinoModel inquilino = (InquilinoModel)cboxListaInquilinos.getSelectedItem();
        
        
        //txtCadastrarCPFInquilino.setText(inquilino.getCpf());
        //txtCadastrarAPInquilino.setText(String.valueOf(inquilino.getAprtNumero()));
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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<InquilinoModel> cboxInquilino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelArea;
    private javax.swing.JSpinner spnDiaFim;
    private javax.swing.JSpinner spnDiaIni;
    // End of variables declaration//GEN-END:variables
}
