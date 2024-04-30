//samuel
package JocsDaus;

import IniciarJocs.PanellJocs;
import SelectorMode.Numeros;
import SelectorMode.TriarModeAplicacio;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menunumeros.menujocsnumeros;


public class BuscaNumeros extends javax.swing.JFrame {

public int dado2;
public  int dado1;
public int sumaDados;



    public BuscaNumeros() {
        initComponents();
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagendado1 = new javax.swing.JLabel();
        imagendado2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Tornar ha numeros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 690, 154, 27);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 690, 72, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JUEGO DE DADOS ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 50, 212, 32);

        imagendado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alea_6.png"))); // NOI18N
        jPanel1.add(imagendado1);
        imagendado1.setBounds(30, 150, 370, 270);

        imagendado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alea_6.png"))); // NOI18N
        jPanel1.add(imagendado2);
        imagendado2.setBounds(450, 150, 380, 270);

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setText("START");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 470, 260, 50);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 470, 250, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Que numero da la suma de dados ?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 440, 240, 20);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Resultado:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 580, 330, 40);

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setText("Validar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(500, 540, 120, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          PanellJocs newframe = new PanellJocs();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        menujocsnumeros newframe = new menujocsnumeros();

        newframe.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
        Random rnd = new Random();
        int dado1 = rnd.nextInt(6) + 1; 
        int dado2 = rnd.nextInt(6) + 1; 

    imagendado1.setIcon(new ImageIcon(getClass().getResource("/imagenes/Alea_" + dado1 + ".png")));
    imagendado2.setIcon(new ImageIcon(getClass().getResource("/imagenes/Alea_" + dado2 + ".png")));
            
     System.out.println("dado1: " + dado1 + ", dado2: " + dado2);

    // Calcula la suma de los valores de los dados
    sumaDados = dado1 + dado2;
    
    
        if (dado1==0){
            imagendado1.setIcon(new ImageIcon(getClass().getResource("Alea_1.png")));
        }
        else if (dado1==1){
            imagendado1.setIcon(new ImageIcon(getClass().getResource("Alea_2.png")));
        }
        else if (dado1==2){
            imagendado1.setIcon(new ImageIcon(getClass().getResource("Alea_3.png")));
        }
        else if (dado1==3){
            imagendado1.setIcon(new ImageIcon(getClass().getResource("Alea_4.png")));
        }
        else if (dado1==4){
            imagendado1.setIcon(new ImageIcon(getClass().getResource("Alea_5.png")));
        }
        else if (dado1==5){
            imagendado1.setIcon(new ImageIcon(getClass().getResource("Alea_6.png")));
        }
        
         if (dado2==0){
            imagendado2.setIcon(new ImageIcon(getClass().getResource("Alea_1.png")));
        }
        else if (dado2==1){
            imagendado2.setIcon(new ImageIcon(getClass().getResource("Alea_2.png")));
        }
        else if (dado2==2){
            imagendado2.setIcon(new ImageIcon(getClass().getResource("Alea_3.png")));
        }
        else if (dado2==3){
            imagendado2.setIcon(new ImageIcon(getClass().getResource("Alea_4.png")));
        }
        else if (dado2==4){
            imagendado2.setIcon(new ImageIcon(getClass().getResource("Alea_5.png")));
        }
        else if (dado2==5){
            imagendado2.setIcon(new ImageIcon(getClass().getResource("Alea_6.png")));
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
     try {
        int numeroIngresado = Integer.parseInt(jTextField1.getText()); // Obtener el número ingresado por el jugador
        if (numeroIngresado == sumaDados) { // Comparar el número ingresado con la suma de los valores de los dados
            jLabel3.setText("¡Número correcto!"); // Establecer el texto del JLabel como "¡Número correcto!"
        } else {
            jLabel3.setText("Número incorrecto. La suma de los dados es: " + sumaDados ); // Establecer el texto del JLabel como "Número incorrecto. La suma de los dados es: [sumaDados]"
        }
    } catch (NumberFormatException e) {
        jLabel3.setText("Por favor, ingresa un número válido."); // Establecer el texto del JLabel como "Por favor, ingresa un número válido."
    }
     
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagendado1;
    private javax.swing.JLabel imagendado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
