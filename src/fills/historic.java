/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fills;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import serverConexio.conexioBD;
import java.sql.Timestamp;
import javax.swing.ImageIcon;
import objectesBD.fillsBD;
import panells.families;

/**
 *
 * @author aleix
 */
public class historic extends javax.swing.JFrame {
    
    private String dniFill = "";

    /**
     * Creates new form historic
     */
    public historic() {
        initComponents();
        activitatResult.setEditable(false);
        
        fillsBD fill = new fillsBD();
        fill.lleguirFill();
        titol.setText("Historial del fill: " + fill.getNom() + " " + fill.getCognoms());
        
        dniFill = fill.getDni();
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
        titol = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dataInici = new com.toedter.calendar.JCalendar();
        dataFi = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        llistatActitats = new javax.swing.JList<>();
        visualitzarActivitats = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nota = new javax.swing.JLabel();
        visualitzarResultat = new javax.swing.JButton();
        tornar = new javax.swing.JButton();
        activitat = new javax.swing.JScrollPane();
        activitatResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        titol.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titol.setText("Historic");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Inici:");

        jLabel2.setText("Fi:");

        jScrollPane1.setViewportView(llistatActitats);

        visualitzarActivitats.setText("Visualitzar Activitats");
        visualitzarActivitats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualitzarActivitatsActionPerformed(evt);
            }
        });

        jLabel3.setText("Categoria Activitat:");

        categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoria.setText("-");

        jLabel4.setText("Activitat:");

        jLabel5.setText("Nota:");

        nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nota.setText("-");

        visualitzarResultat.setText("Visualitzar resultat");
        visualitzarResultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualitzarResultatActionPerformed(evt);
            }
        });

        tornar.setText("Panell Família");
        tornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tornarActionPerformed(evt);
            }
        });

        activitatResult.setColumns(20);
        activitatResult.setRows(5);
        activitat.setViewportView(activitatResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visualitzarActivitats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataInici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataFi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(visualitzarResultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activitat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataFi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataInici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visualitzarActivitats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addComponent(visualitzarResultat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activitat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tornar)
                    .addComponent(jLabel5)
                    .addComponent(nota))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void visualitzarActivitatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualitzarActivitatsActionPerformed
        if (dataInici.getCalendar().compareTo(dataFi.getCalendar()) <= 0) {
            String dataIniciStr = dataString(dataInici.getCalendar()), dataFiStr = dataString(dataFi.getCalendar());
            conexioBD bd = new conexioBD();
            bd.obrirConexio();
            try {
                DefaultListModel modelo = new DefaultListModel();
                ResultSet resultatUsuari = bd.ecjecutarSelect("SELECT * FROM `activitatRealitzat` WHERE ((`activitatRealitzat`.`dataHora` >= '" + dataIniciStr + " 00:00:00') AND (`activitatRealitzat`.`dataHora` <= '" + dataFiStr + " 23:59:59')) AND`activitatRealitzat`.`dniFill` = '" + dniFill + "';");
                int numResul = 0;
                while (resultatUsuari.next()){
                    numResul++;
                    Timestamp timestamp = resultatUsuari.getTimestamp("dataHora");
                    String dataHoraStr = timestamp.toString();
                    modelo.addElement(dataHoraStr);
                }
                if (numResul == 0) {
                    if (dataIniciStr.equals(dataFiStr)) {
                        missatge("No s'ha dut a terme cap activitat el dia: " + dataIniciStr);
                    } else{
                        missatge("Del dia " + dataIniciStr + " al dia " + dataFiStr + " no s'ha dut a terme cap activitat.");
                    }
                } else {
                    llistatActitats.setModel(modelo);
                }
            } catch (SQLException ex) {
                missatge(bd.missatgeError(ex.getErrorCode()));
            }
        } else {
            missatge("La data d'inici ha de ser igual o menor que la data fi.");
        }
    }//GEN-LAST:event_visualitzarActivitatsActionPerformed

    private void tornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tornarActionPerformed
        File f = new File("fill.fill");
        File dniF = new File("dni.fill");
        if (f.exists()) {
            f.delete();
            if (dniF.exists()) {
                dniF.delete();
            }
        }
        
        ImageIcon icono = new ImageIcon("img/logo.png");

        families panellFamilies = new families();
        panellFamilies.setTitle("Panell Família - Alfabetització");
        panellFamilies.setMinimumSize(new java.awt.Dimension(600, 500));
        //panellFamilies.setResizable(false);
        panellFamilies.setLocationRelativeTo(null);
        panellFamilies.setIconImage(icono.getImage());

        this.dispose();
        panellFamilies.setVisible(true);
    }//GEN-LAST:event_tornarActionPerformed

    private void visualitzarResultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualitzarResultatActionPerformed
        if (llistatActitats == null) {
            missatge("S'ha de seleccionar una franja de temps o un dia per a poder seleccionar una opció de la llista.");
        } else {
            int seleccionat = llistatActitats.getSelectedIndex();
            if (seleccionat != -1) {
                fillsBD fill = new fillsBD();
                fill.lleguirFill();
                conexioBD conexio = new conexioBD();
                conexio.obrirConexio();
                try {
                    ResultSet resultSet = conexio.ecjecutarSelect("SELECT * FROM `activitatRealitzat` WHERE `activitatRealitzat`.`dataHora` LIKE '" + llistatActitats.getModel().getElementAt(seleccionat).substring(0, llistatActitats.getModel().getElementAt(seleccionat).length() - 2) + "' AND `activitatRealitzat`.`dniFill` LIKE '" + fill.getDni() + "';");
                    if (resultSet.next()) {
                        nota.setText(resultSet.getDouble("nota") + "");
                        categoria.setText(resultSet.getString("tipo"));
                        activitatResult.setText(resultSet.getString("comtingutActiv"));
                        //activitat.setToolTipText(resultSet.getString("comtingutActiv"));
                    }
                } catch (SQLException ex) {
                    missatge(conexio.missatgeError(ex.getErrorCode()));
                    conexio.tancaConexio();
                }
                conexio.tancaConexio();
            } else {
                missatge("Has de seleccionar una data per a visualitzar el contingut.");
            }
        }
    }//GEN-LAST:event_visualitzarResultatActionPerformed

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
            java.util.logging.Logger.getLogger(historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane activitat;
    private javax.swing.JTextArea activitatResult;
    private javax.swing.JLabel categoria;
    private com.toedter.calendar.JCalendar dataFi;
    private com.toedter.calendar.JCalendar dataInici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> llistatActitats;
    private javax.swing.JLabel nota;
    private javax.swing.JLabel titol;
    private javax.swing.JButton tornar;
    private javax.swing.JButton visualitzarActivitats;
    private javax.swing.JButton visualitzarResultat;
    // End of variables declaration//GEN-END:variables

    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(rootPane, missatge);
    }
    
    private String dataString(Calendar calendar) {
        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");
        String data = dataForm.format(calendar.getTime());
        return data;
    }
}
