/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estudio.caso.prac1;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author markm
 */

package estudio.caso.prac1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Biblioteca extends javax.swing.JFrame {

    private DefaultListModel<Publicacion> modelo;
    private JList<Publicacion> lista;

    public Biblioteca() {
    initComponents();

    setTitle("Sistema de Biblioteca");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    modelo = new DefaultListModel<>();
    lista = jList1;

    lista.setModel(modelo);

    cargarLista();
}
       
        

       

    private void agregarPublicacion() {

        String[] tipos = {"Libro", "Revista", "Ebook"};

        String tipo = (String) JOptionPane.showInputDialog(
                this, "Seleccione el tipo:",
                "Nueva publicacion",
                JOptionPane.QUESTION_MESSAGE,
                null, tipos, tipos[0]
        );

        if (tipo == null) return;

        try {
            String titulo = JOptionPane.showInputDialog(this, "Titulo:");
            if (titulo == null || titulo.trim().isEmpty()) return;

            String editorial = JOptionPane.showInputDialog(this, "Editorial:");
            if (editorial == null || editorial.trim().isEmpty()) return;

            int paginas = Integer.parseInt(
                    JOptionPane.showInputDialog(this, "Cantidad de paginas:")
            );

            if (paginas <= 0) {
                JOptionPane.showMessageDialog(this, "Paginas invalidas.");
                return;
            }

            if (tipo.equals("Libro")) {

                String autor = JOptionPane.showInputDialog(this, "Autor:");
                if (autor == null) return;

                String isbn = JOptionPane.showInputDialog(this, "ISBN:");
                if (isbn == null) return;

                double precio = Double.parseDouble(
                        JOptionPane.showInputDialog(this, "Precio:")
                );

                Libreria.registrarPublicacion(
                        new Libro(titulo, editorial, paginas,
                                autor, isbn, precio)
                );

            } else if (tipo.equals("Revista")) {

                int edicion = Integer.parseInt(
                        JOptionPane.showInputDialog(this, "Edicion:")
                );

                String periodicidad = JOptionPane.showInputDialog(
                        this, "Periodicidad:"
                );
                if (periodicidad == null) return;

                Libreria.registrarPublicacion(
                        new Revista(titulo, editorial, paginas,
                                edicion, periodicidad)
                );

            } else {

                String formato = JOptionPane.showInputDialog(this, "Formato:");
                if (formato == null) return;

                double tamano = Double.parseDouble(
                        JOptionPane.showInputDialog(this, "Tamano:")
                );

                String url = JOptionPane.showInputDialog(this, "URL:");
                if (url == null) return;

                Libreria.registrarPublicacion(
                        new Ebook(titulo, editorial, paginas,
                                formato, tamano, url)
                );
            }

            cargarLista();

            JOptionPane.showMessageDialog(
                    this, "Publicacion registrada correctamente."
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this, "Ingrese valores numericos validos."
            );
        }
    }

    private void devolverPublicacion() {

        Publicacion p = lista.getSelectedValue();

        if (p == null) {
            JOptionPane.showMessageDialog(
                    this, "Seleccione una publicacion."
            );
            return;
        }

        try {
            int dias = Integer.parseInt(
                    JOptionPane.showInputDialog(this, "Dias de atraso:")
            );

            JOptionPane.showMessageDialog(
                    this, Libreria.DevolverPublicacion(p, dias)
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this, "Ingrese un numero valido."
            );

        } catch (EbookNoSeDevuelve ex) {
            JOptionPane.showMessageDialog(
                    this, ex.getMessage()
            );

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    this, ex.getMessage()
            );
        }
    }

    private void cargarLista() {

        modelo.clear();

        for (Publicacion p : Libreria.getPublicaciones()) {
            modelo.addElement(p);
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

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<Publicacion>();

        jButton3.setText("Prestar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de biblioteca");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FIDELIBROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTextField1.setForeground(new java.awt.Color(153, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Agregar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setText("Catálogo de publicaciones");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Prestar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Devolver");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Actualizar");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(53, 53, 53)
                        .addComponent(jButton4)
                        .addGap(45, 45, 45)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        agregarPublicacion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Publicacion p = lista.getSelectedValue();

if (p == null) {
    JOptionPane.showMessageDialog(
            this, "Seleccione una publicacion."
    );
} else {
    JOptionPane.showMessageDialog(
            this, Libreria.prestarPublicacion(p)
    );
    cargarLista();
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       devolverPublicacion();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cargarLista();
    }//GEN-LAST:event_jButton6ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Biblioteca().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<Publicacion> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
