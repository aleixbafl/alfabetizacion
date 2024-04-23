/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package panells;

import fills.afegir;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import loginReguistre.login;
import objectesBD.usuariBD;
import serverConexio.conexioBD;

/**
 *
 * @author aleix
 */
public class families extends javax.swing.JFrame {

    /**
     * Creates new form families
     */
    public families() {
        initComponents();
        
        File f = new File("usuari.usr");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0 ) {
                usuariBD userLogin = (usuariBD) ois.readObject();

                conexioBD bd = new conexioBD();
                bd.obrirConexio();
                try {
                    DefaultListModel modelo = new DefaultListModel();
                    ResultSet resultatUsuari = bd.ecjecutarSelect("SELECT `fills`.`nom`, `fills`.`cognoms` FROM `fills` WHERE `fills`.`dni` LIKE (SELECT `familia`.`dniFill` FROM `familia` WHERE `familia`.`nomUsuariFamil` LIKE '" + userLogin.getNomUsuari() + "' AND `familia`.`dniFill` IS NOT NULL); ");
                    String nomCognom = "";
                    while(resultatUsuari.next()){
                        if (nomCognom.equalsIgnoreCase("")) {
                            nomCognom = resultatUsuari.getString("nom") + " " + resultatUsuari.getString("cognoms");
                        } else {
                            nomCognom = nomCognom + "|" + resultatUsuari.getString("nom") + " " + resultatUsuari.getString("cognoms");
                        }
                    }
                    if (nomCognom.contains(String.valueOf('|'))) {
                        String[] nomCognomArry = nomCognom.split("|");
                        for (int i = 0; i < nomCognomArry.length; i++) {
                            modelo.addElement(nomCognomArry[i]);
                        }
                    } else {
                        modelo.addElement(nomCognom);
                    }
                    if (nomCognom.isEmpty()) {
                        fillsMissatge.setText("No hi ha fills");
                    }
                    llistaFills.setModel(modelo);
                } catch (SQLException ex) {
                    Logger.getLogger(families.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            missatge("Error d'ubicació i/o de nom de la lectura de l'arxiu de les credencials.");
        } catch (IOException ex) {
            missatge("Error de lectura de les credencials.");
        } catch (ClassNotFoundException ex) {
            missatge("Error no especificat.");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        afegir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        historic = new javax.swing.JButton();
        activitats = new javax.swing.JButton();
        tancaSessio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        llistaFills = new javax.swing.JList<>();
        fillsMissatge = new javax.swing.JLabel();
        desseleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestió de Fills ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setToolTipText("");

        afegir.setText("Afegir");
        afegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afegirActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        historic.setText("Històric");
        historic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicActionPerformed(evt);
            }
        });

        activitats.setText("Activitats");
        activitats.setActionCommand("Iniciar Activitats");

        tancaSessio.setText("Tanca Sessió");
        tancaSessio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tancaSessioActionPerformed(evt);
            }
        });

        llistaFills.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(llistaFills);

        fillsMissatge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        desseleccionar.setText("Desseleccionar");
        desseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desseleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(tancaSessio)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(afegir)
                    .addComponent(historic)
                    .addComponent(eliminar)
                    .addComponent(activitats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desseleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fillsMissatge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(fillsMissatge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(afegir)
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addComponent(eliminar)
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addComponent(activitats)
                        .addGap(18, 25, Short.MAX_VALUE)
                        .addComponent(historic))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desseleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(tancaSessio)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

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

    private void historicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historicActionPerformed

    private void tancaSessioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tancaSessioActionPerformed
        File f = new File("usuari.usr");
        f.delete();
        
        ImageIcon icono = new ImageIcon("img/logo.png");

        login pantallaLogin = new login();
        pantallaLogin.setTitle("Iniciar Sessió - Alfabetització");
        pantallaLogin.setMinimumSize(new java.awt.Dimension(500, 600));
        pantallaLogin.setResizable(false);
        pantallaLogin.setLocationRelativeTo(null);
        pantallaLogin.setIconImage(icono.getImage());

        this.dispose();
        pantallaLogin.setVisible(true);
    }//GEN-LAST:event_tancaSessioActionPerformed

    private void desseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desseleccionarActionPerformed
        llistaFills.clearSelection();
    }//GEN-LAST:event_desseleccionarActionPerformed

    private void afegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afegirActionPerformed
        ImageIcon icono = new ImageIcon("img/logo.png");

        afegir afegirFill = new afegir();
        afegirFill.setTitle("Afegir Fill - Alfabetització");
        afegirFill.setMinimumSize(new java.awt.Dimension(600, 500));
        afegirFill.setResizable(false);
        afegirFill.setLocationRelativeTo(null);
        afegirFill.setIconImage(icono.getImage());

        this.dispose();
        afegirFill.setVisible(true);
    }//GEN-LAST:event_afegirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (llistaFills == null) {
            missatge("No hi ha fills per a poder eliminar.");
        } else {
            int seleccionat = llistaFills.getSelectedIndex();
            if (seleccionat != -1) {
                String contingut = (String) llistaFills.getModel().getElementAt(seleccionat);
                try {
                    File f = new File("usuari.usr");
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    while (fis.available() > 0 ) {
                        usuariBD userLogin = (usuariBD) ois.readObject();
                        conexioBD bd = new conexioBD();
                        bd.obrirConexio();
                        try {
                            boolean seguir = true;
                            ResultSet resultatUsuari = bd.ecjecutarSelect("SELECT f.nom, f.cognoms FROM fills f JOIN familia fa ON f.dni = fa.dniFill JOIN usuari u ON fa.nomUsuariFamil = u.nomUsuari WHERE u.nomUsuari = '" + userLogin.getNomUsuari() + "'; ");
                            while (resultatUsuari.next() && seguir){
                                String nom = resultatUsuari.getString("f.nom"), cognom = resultatUsuari.getString("f.cognoms");
                                String nomCognom = resultatUsuari.getString("f.nom") + " " + resultatUsuari.getString("f.cognoms");
                                if (nomCognom.equals(contingut)) {
                                    bd.ecjecutarActualitzar("DELETE FROM fills WHERE nom = '" + nom + "' AND cognoms = '" + cognom + "';");
                                    DefaultListModel<String> model = (DefaultListModel<String>) llistaFills.getModel();
                                    model.remove(seleccionat);
                                    missatge("S'ha eliminat correctament el fill.");
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(families.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    ois.close();
                    fis.close();
                } catch (FileNotFoundException ex) {
                    missatge("Error d'ubicació i/o de nom de la lectura de l'arxiu de les credencials.");
                } catch (IOException ex) {
                    missatge("Error de lectura de les credencials.");
                } catch (ClassNotFoundException ex) {
                    missatge("Error no especificat.");
                }
            } else {
                missatge("Has de seleccionar un element per a poder eliminar-lo.");
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(families.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(families.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(families.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(families.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new families().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activitats;
    private javax.swing.JButton afegir;
    private javax.swing.JButton desseleccionar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fillsMissatge;
    private javax.swing.JButton historic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> llistaFills;
    private javax.swing.JButton tancaSessio;
    // End of variables declaration//GEN-END:variables

    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(rootPane, missatge);
    }
}
