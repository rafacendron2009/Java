/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifsc.View;

import edu.ifsc.Daos.Marca;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Id;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MarcasView extends javax.swing.JFrame {

    public MarcasView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListMarcas = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                OpenInitialView(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GERENCIADOR DE MARCAS");

        cadastrar.setText("Cadastrar");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdicionaMarca(evt);
            }
        });
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        limpar.setText("Atualizar Listagem");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        ListMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ListMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetCampos(evt);
            }
        });
        jScrollPane3.setViewportView(ListMarcas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(name)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir)
                    .addComponent(limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenInitialView(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OpenInitialView

    }//GEN-LAST:event_OpenInitialView

    private void AdicionaMarca(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdicionaMarca

    }//GEN-LAST:event_AdicionaMarca

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        String name = this.name.getText();

        if (name.length() == 0) {
            JOptionPane.showMessageDialog(this, "Você deve informar o nome da marca!");
            return;
        }
        Marca p = new Marca();
        p.setNome(name);
        try {
            p.cadastrarMarca(p);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        DefaultTableModel val = (DefaultTableModel) ListMarcas.getModel();
        val.getDataVector().removeAllElements();
        try {
            List<Marca> marca = p.buscarTodos();
            for (int i = 0; i < marca.size(); i++) {
                val.addRow(new String[]{"" + marca.get(i).getId() + "", marca.get(i).getNome()});
            }
        } catch (Exception ex) {
            Logger.getLogger(MarcasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.name.setText("");


    }//GEN-LAST:event_cadastrarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Marca p = new Marca();
        DefaultTableModel val = (DefaultTableModel) ListMarcas.getModel();
        val.getDataVector().removeAllElements();
        try {
            List<Marca> marca = p.buscarTodos();
            for (int i = 0; i < marca.size(); i++) {
                val.addRow(new String[]{"" + marca.get(i).getId() + "", marca.get(i).getNome()});
            }

        } catch (Exception ex) {
            Logger.getLogger(MarcasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_limparActionPerformed

    private void SetCampos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetCampos
        System.out.println(ListMarcas.getSelectedRow());
        int row = ListMarcas.getSelectedRow();
        this.id.setText(ListMarcas.getValueAt(row, 0).toString());
        this.name.setText(ListMarcas.getValueAt(row, 1).toString());
    }//GEN-LAST:event_SetCampos

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        String name = this.name.getText();
        int id = Integer.parseInt(this.id.getText());
        Marca p = new Marca();
        p.setNome(name);
        p.setId(id);
        DefaultTableModel val = (DefaultTableModel) ListMarcas.getModel();
        val.getDataVector().removeAllElements();
        try {
            List<Marca> marca = p.buscarTodos();
            for (int i = 0; i < marca.size(); i++) {
                val.addRow(new String[]{"" + marca.get(i).getId() + "", marca.get(i).getNome()});
            }
        } catch (Exception ex) {
            Logger.getLogger(MarcasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.name.setText("");
        this.id.setText("");

        try {
            p.atualizar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
    }//GEN-LAST:event_editarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        int id = Integer.parseInt(this.id.getText());
        Marca p = new Marca();
        p.setId(id);

        try {
            p.delete();

            DefaultTableModel val = (DefaultTableModel) ListMarcas.getModel();
            val.getDataVector().removeAllElements();
            List<Marca> marca = p.buscarTodos();
            for (int i = 0; i < marca.size(); i++) {
                val.addRow(new String[]{"" + marca.get(i).getId() + "", marca.get(i).getNome()});
            }
            this.name.setText("");
            this.id.setText("");
        } catch (Exception ex) {
            Logger.getLogger(MarcasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MarcasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListMarcas;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
