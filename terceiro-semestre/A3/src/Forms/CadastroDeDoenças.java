/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

/**
 *
 * @author anton
 */
public class CadastroDeDoenças extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeDoenças
     */
    public CadastroDeDoenças() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BtnVoltar = new javax.swing.JButton();
        TxtCodigo = new javax.swing.JTextField();
        TxtNomeCliente = new javax.swing.JTextField();
        BtnNovo1 = new javax.swing.JButton();
        BtnSalvar1 = new javax.swing.JButton();
        BtnEditar1 = new javax.swing.JButton();
        BtnExcluir1 = new javax.swing.JButton();
        BtnCancelar1 = new javax.swing.JButton();
        TxtNomeCliente1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 175, 239));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setBackground(new java.awt.Color(3, 175, 239));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro e Edição de Doenças");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        BtnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        BtnVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnVoltar.setForeground(new java.awt.Color(51, 51, 51));
        BtnVoltar.setText("Voltar");

        TxtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        TxtCodigo.setText("ID Doença");
        TxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Doença", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 8))); // NOI18N
        TxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtCodigoFocusGained(evt);
            }
        });
        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });

        TxtNomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        TxtNomeCliente.setText("Nome Doença");
        TxtNomeCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Doença", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 8))); // NOI18N
        TxtNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNomeClienteFocusGained(evt);
            }
        });
        TxtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeClienteActionPerformed(evt);
            }
        });

        BtnNovo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnNovo1.setText("Novo");
        BtnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovo1ActionPerformed(evt);
            }
        });

        BtnSalvar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSalvar1.setText("Salvar");
        BtnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvar1ActionPerformed(evt);
            }
        });

        BtnEditar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnEditar1.setText("Editar");
        BtnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditar1ActionPerformed(evt);
            }
        });

        BtnExcluir1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnExcluir1.setText("Excluir");
        BtnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluir1ActionPerformed(evt);
            }
        });

        BtnCancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCancelar1.setText("Cancelar");
        BtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelar1ActionPerformed(evt);
            }
        });

        TxtNomeCliente1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtNomeCliente1.setForeground(new java.awt.Color(102, 102, 102));
        TxtNomeCliente1.setText("Sintomas");
        TxtNomeCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sintomas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 8))); // NOI18N
        TxtNomeCliente1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNomeCliente1FocusGained(evt);
            }
        });
        TxtNomeCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeCliente1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Doença", "Nome Doença", "Sintomas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BtnNovo1)
                        .addGap(63, 63, 63)
                        .addComponent(BtnSalvar1)
                        .addGap(76, 76, 76)
                        .addComponent(BtnEditar1)
                        .addGap(58, 58, 58)
                        .addComponent(BtnExcluir1)
                        .addGap(47, 47, 47)
                        .addComponent(BtnCancelar1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNomeCliente1)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TxtNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNovo1)
                    .addComponent(BtnSalvar1)
                    .addComponent(BtnEditar1)
                    .addComponent(BtnExcluir1)
                    .addComponent(BtnCancelar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCodigoFocusGained

        TxtCodigo.setText("");
    }//GEN-LAST:event_TxtCodigoFocusGained

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoActionPerformed

    private void TxtNomeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNomeClienteFocusGained

        TxtNomeCliente.setText("");
    }//GEN-LAST:event_TxtNomeClienteFocusGained

    private void TxtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeClienteActionPerformed

    private void BtnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovo1ActionPerformed

    }//GEN-LAST:event_BtnNovo1ActionPerformed

    private void BtnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvar1ActionPerformed

    }//GEN-LAST:event_BtnSalvar1ActionPerformed

    private void BtnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditar1ActionPerformed

    }//GEN-LAST:event_BtnEditar1ActionPerformed

    private void BtnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluir1ActionPerformed

    }//GEN-LAST:event_BtnExcluir1ActionPerformed

    private void BtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelar1ActionPerformed

    }//GEN-LAST:event_BtnCancelar1ActionPerformed

    private void TxtNomeCliente1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNomeCliente1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeCliente1FocusGained

    private void TxtNomeCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeCliente1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeDoenças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeDoenças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeDoenças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeDoenças.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeDoenças().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JButton BtnEditar1;
    private javax.swing.JButton BtnExcluir1;
    private javax.swing.JButton BtnNovo1;
    private javax.swing.JButton BtnSalvar1;
    private javax.swing.JButton BtnVoltar;
    public static javax.swing.JTextField TxtCodigo;
    public static javax.swing.JTextField TxtNomeCliente;
    public static javax.swing.JTextField TxtNomeCliente1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
