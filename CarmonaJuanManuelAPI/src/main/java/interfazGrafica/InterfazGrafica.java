/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazGrafica;

/**
 *
 * @author juanm
 */
public class InterfazGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
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
        barca = new javax.swing.JButton();
        athletic = new javax.swing.JButton();
        alaves = new javax.swing.JButton();
        alcorcon = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WIKIFUTBOL");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        barca.setBackground(new java.awt.Color(255, 255, 204));
        barca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barca.png"))); // NOI18N
        barca.setBorder(null);
        barca.setMargin(new java.awt.Insets(30, 30, 30, 30));
        barca.setPreferredSize(new java.awt.Dimension(120, 120));
        barca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcaActionPerformed(evt);
            }
        });
        jPanel1.add(barca);

        athletic.setBackground(new java.awt.Color(255, 255, 204));
        athletic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/athletic.png"))); // NOI18N
        jPanel1.add(athletic);

        alaves.setBackground(new java.awt.Color(255, 255, 204));
        alaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alaves.png"))); // NOI18N
        alaves.setBorder(null);
        alaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alavesActionPerformed(evt);
            }
        });
        jPanel1.add(alaves);

        alcorcon.setBackground(new java.awt.Color(255, 255, 204));
        alcorcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alcorcon.png"))); // NOI18N
        alcorcon.setBorder(null);
        alcorcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alcorconActionPerformed(evt);
            }
        });
        jPanel1.add(alcorcon);

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atMadrid.png"))); // NOI18N
        jPanel1.add(jButton2);

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/albacete.png"))); // NOI18N
        jPanel1.add(jButton4);

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/antequera.png"))); // NOI18N
        jPanel1.add(jButton3);

        jButton5.setBackground(new java.awt.Color(255, 255, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almeria.png"))); // NOI18N
        jPanel1.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 255, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arandina.png"))); // NOI18N
        jPanel1.add(jButton6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcaActionPerformed

    private void alavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alavesActionPerformed

    private void alcorconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alcorconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alcorconActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alaves;
    private javax.swing.JButton alcorcon;
    private javax.swing.JButton athletic;
    private javax.swing.JButton barca;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}