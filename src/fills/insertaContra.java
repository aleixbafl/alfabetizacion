/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fills;

import IniciarJocs.PanellJocs;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objectesBD.usuariBD;
import panells.families;

/**
 *
 * @author aleix
 */
public class insertaContra extends javax.swing.JFrame {

    /**
     * Creates new form insertaContra
     */
    public insertaContra() {
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

        jLabel1 = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();
        acceptar = new javax.swing.JButton();
        tornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Introdueix la contrasenya del vostre usuari.");

        acceptar.setText("Acceptar");
        acceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptarActionPerformed(evt);
            }
        });

        tornar.setText("Tornar-hi");
        tornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contra)
                    .addComponent(acceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tornar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tornar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptarActionPerformed
        if (contra.getText().isEmpty()) {
            missatge("Has d'introduir la contrasenya del vostre usuari.");
        } else {
            usuariBD user = new usuariBD();
            user.lleguirUser();
            if (user.getContrasenya().equals(contra.getText())) {
                ImageIcon icono = new ImageIcon("img/logo.png");

                families panellFamilies = new families();
                panellFamilies.setTitle("Panell Família - Alfabetització");
                panellFamilies.setMinimumSize(new java.awt.Dimension(600, 500));
                //panellFamilies.setResizable(false);
                panellFamilies.setLocationRelativeTo(null);
                panellFamilies.setIconImage(icono.getImage());

                this.dispose();
                panellFamilies.setVisible(true);
            } else {
                missatge("La contrasenya introduïda és incorrecta.");
            }
        }
        
    }//GEN-LAST:event_acceptarActionPerformed

    private void tornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tornarActionPerformed
        ImageIcon icono = new ImageIcon("img/logo.png");

        PanellJocs pantallaJocs = new PanellJocs();
        pantallaJocs.setTitle("Panell Activitats - Alfabetització");
        pantallaJocs.setMinimumSize(new java.awt.Dimension(450, 600));
        pantallaJocs.setResizable(false);
        pantallaJocs.setLocationRelativeTo(null);
        pantallaJocs.setIconImage(icono.getImage());

        this.dispose();
        pantallaJocs.setVisible(true);
    }//GEN-LAST:event_tornarActionPerformed

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
            java.util.logging.Logger.getLogger(insertaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertaContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertaContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptar;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tornar;
    // End of variables declaration//GEN-END:variables
    
    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(rootPane, missatge);
    }
}
