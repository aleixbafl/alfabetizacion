/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginReguistre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objectesBD.usuariBD;
import org.mindrot.jbcrypt.BCrypt;
import panells.families;
import serverConexio.conexioBD;

/**
 *
 * @author aleix
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login(){
        initComponents();
        
        /*
            Comprovar si hi ha un arxiu anomenat "usuari.usr", en cas de ser així li pregunta a l'usuari (els pares) si volen recarregar les credencials.
            Respostes:
            - Si: llegirà l'arxiu i introduirà l'usuari i la contrasenya als camps corresponents (camp del nom d'usuari i camp de contrasenya).
            - No: eliminarà l'arxiu.
        */
        File f = new File("usuari.usr");
        if (f.exists()) {
            if (preguntaSiNo("Vols recarregar les credencials?") == JOptionPane.YES_OPTION) {
                usuariBD userLogin = new usuariBD();
                userLogin.lleguirUser();
                usuari.setText(userLogin.getNomUsuari());
                contrasenya.setText(userLogin.getContrasenya());
            } else {
                f.delete();
            }
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
        jLabel2 = new javax.swing.JLabel();
        usuari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contrasenya = new javax.swing.JPasswordField();
        inicia = new javax.swing.JButton();
        registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sessió");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nom Usuari:");

        usuari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuari.setToolTipText("Los Simpson");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contrasenya:");

        contrasenya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contrasenya.setToolTipText("Contrasenya1234");

        inicia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inicia.setText("Iniciar");
        inicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciaActionPerformed(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrar.setText("Registrar-se");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuari)
                    .addComponent(contrasenya)
                    .addComponent(inicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(140, 140, 140))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(usuari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(contrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(inicia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
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
                .addGap(25, 25, 25))
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

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        //Carregar la pantalla de registrar-se i tanca la d'iniciar sessió.        
        ImageIcon icono = new ImageIcon("img/logo.png");
        
        reguistre pantallaReguistre = new reguistre();
        pantallaReguistre.setTitle("Registrar-se - Alfabetització");
        pantallaReguistre.setMinimumSize(new java.awt.Dimension(500, 600));
        pantallaReguistre.setResizable(false);
        pantallaReguistre.setLocationRelativeTo(null);
        pantallaReguistre.setIconImage(icono.getImage());
        
        this.dispose();
        pantallaReguistre.setVisible(true);
    }//GEN-LAST:event_registrarActionPerformed

    private void iniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciaActionPerformed
        /*
            Primer comprova que s'ha introduït dades als camps, en cas de no ser així t'ho indica.
            A continuació comprova si el nom d'usuari i la contrasenya introduïts són correctes, en cas de no ser-ho t'ho indica.
            Si és correcte sé la informació de l'usuari en un arxiu a l'ordinador i donarà pas al panell de la família.
        */
        
        if (usuari.getText().isEmpty()) {
            missatge("Has d'inserir el nom d'usuari del compte.");
        } else if (contrasenya.getText().isEmpty()) {
            missatge("Has d'inserir la contrasenya.");
        } else {
            conexioBD conectar = new conexioBD();
            try {
                conectar.obrirConexio();
                ResultSet resultatUsuari = conectar.ecjecutarSelect("SELECT * FROM `usuari` WHERE `nomUsuari` LIKE '" + usuari.getText() + "'; ");
                if (resultatUsuari.next()) {
                    if (BCrypt.checkpw(contrasenya.getText(), resultatUsuari.getString("contrasenya"))) {
                        File f = new File("usuari.usr");
                        usuariBD userLogin = new usuariBD(resultatUsuari.getString("nomUsuari"), contrasenya.getText(), resultatUsuari.getString("correuElecUsuari"));
                        userLogin.guardarUser();
                        conectar.tancaConexio();

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
                        missatge("La contrasenya és incorrecta.");
                    }
                } else {
                    missatge("El nom d'usuari introduït no existeix o s'ha escrit malament.");
                }
            } catch (SQLException ex) {
                missatge(conectar.missatgeError(ex.getErrorCode()));
            }
        }
    }//GEN-LAST:event_iniciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        login inici = new login();
        inici.primer();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenya;
    private javax.swing.JButton inicia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField usuari;
    // End of variables declaration//GEN-END:variables

    private void primer() {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(rootPane, missatge);
    }
    
    private int preguntaSiNo(String missatge) {
        return JOptionPane.showConfirmDialog(this, missatge, "Confirmación", JOptionPane.YES_NO_OPTION);
    }

    private void cargarCredencials() {
        
    }
}
