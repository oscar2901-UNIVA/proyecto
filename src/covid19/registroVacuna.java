/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

import Controladores.VacunasJpaController;
import Controladores.exceptions.NonexistentEntityException;
import Entidades.Vacunas;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class registroVacuna extends javax.swing.JFrame {

    /**
     * Creates new form registroVacuna
     */
    public registroVacuna() {
        initComponents();
        cargaTabla();
        limpiar();
    }
    private void cargaTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nombre de vacuna");
        dtm.addColumn("Cantidad");
        
       
        Object[] fila = new Object[3];
        VacunasJpaController pc = new VacunasJpaController();
        List<Vacunas> lista = pc.findVacunasEntities();
        for(Vacunas p:lista){
            fila[0]= p.getId();
            fila[1]= p.getNombreDeVacuna();
            fila[2]= p.getCantidad();
            
     
            dtm.addRow(fila);
            
        }
        tblVacunas.setModel(dtm);
    }
//    
    private void limpiar(){
        txtNombreVacuna.setText("");
        txtCantidadVacunas.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVacunas = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNombreVacuna = new javax.swing.JTextField();
        txtCantidadVacunas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre de la vacuna:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 170, 180, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 230, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro Vacunas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 0, 290, 80);

        tblVacunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVacunasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblVacunas);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(150, 460, 560, 250);

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(390, 370, 130, 31);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(530, 370, 130, 31);

        jLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLimpiar.setText("limpiar campos");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jLimpiar);
        jLimpiar.setBounds(230, 370, 151, 31);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(40, 370, 170, 31);

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(670, 370, 120, 31);
        getContentPane().add(txtNombreVacuna);
        txtNombreVacuna.setBounds(300, 180, 190, 30);
        getContentPane().add(txtCantidadVacunas);
        txtCantidadVacunas.setBounds(300, 230, 190, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covid19/imagenfONDO.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 920, 844);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblVacunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVacunasMouseClicked
        int renglon = tblVacunas.getSelectedRow();
        txtNombreVacuna.setText(tblVacunas.getValueAt(renglon, 1).toString());
        txtCantidadVacunas.setText(tblVacunas.getValueAt(renglon, 2).toString());

        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblVacunasMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int renglon = tblVacunas.getSelectedRow();
        int id =  (int)tblVacunas.getValueAt(renglon, 0);
        Vacunas us = new Vacunas();
        us.setId(id);
        us.setNombreDeVacuna(txtNombreVacuna.getText());
        us.setCantidad(Integer.parseInt(txtCantidadVacunas.getText()));
        

        VacunasJpaController oscar = new VacunasJpaController();
        try {
            oscar.edit(us);
            limpiar();
            cargaTabla();
            btnModificar.setEnabled(false); //se desactiva el btn
        } catch (Exception ex) {
            Logger.getLogger(pacienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int renglon = tblVacunas.getSelectedRow();
        int id =  (int)tblVacunas.getValueAt(renglon, 0);
        VacunasJpaController oscar = new VacunasJpaController();
        try {
            oscar.destroy(id);
            limpiar();
            cargaTabla();
            btnEliminar.setEnabled(false); //desactivar el btn
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(pacienteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //
        Vacunas vac = new Vacunas();
        vac.setNombreDeVacuna(txtNombreVacuna.getText());
        vac.setCantidad(Integer.parseInt(txtCantidadVacunas.getText()));
        
        Controladores.VacunasJpaController Oscar = new Controladores.VacunasJpaController();
        Oscar.create(vac);
        JOptionPane.showMessageDialog(this, "Vacuna agregada exitosamente");
        cargaTabla();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(registroVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroVacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroVacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblVacunas;
    private javax.swing.JTextField txtCantidadVacunas;
    private javax.swing.JTextField txtNombreVacuna;
    // End of variables declaration//GEN-END:variables
}