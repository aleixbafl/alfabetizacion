//samuel 
package ahorcado;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ini extends javax.swing.JFrame {

    public ini() {
        initComponents();
        setSize(600,500);//cambiar tamaÃ±o de la ventana
        this.setLocationRelativeTo(null);//posicion de la ventana
        Image icon=new ImageIcon(getClass().getResource("ahoracado/hol.png")).getImage();
        setIconImage(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cre = new javax.swing.JButton();
        jugar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        cre.setBackground(new java.awt.Color(102, 102, 102));
        cre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cre.setForeground(new java.awt.Color(0, 0, 0));
        cre.setText("CREDITOS");
        cre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creActionPerformed(evt);
            }
        });
        getContentPane().add(cre);
        cre.setBounds(70, 290, 200, 70);

        jugar.setBackground(new java.awt.Color(51, 255, 51));
        jugar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jugar.setForeground(new java.awt.Color(0, 0, 0));
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar);
        jugar.setBounds(70, 120, 200, 70);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 200, 200, 70);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EL AHORCADO...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 310, 47);

        jLabel1.setBackground(new java.awt.Color(102, 51, 255));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventana_inicio/ahorcado.jpg"))); // NOI18N
        jLabel1.setText("EL AHORCADO");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creActionPerformed
       Icon g = new ImageIcon(getClass().getResource("/ahoracado/univer.png"));
        JOptionPane.showMessageDialog(null," Hello" , "Ahorcado",JOptionPane.INFORMATION_MESSAGE, g);
    }//GEN-LAST:event_creActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Ahorcado", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {System.exit(0);
        }
        else{
                setDefaultCloseOperation(0);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        juego_normal jn=new juego_normal();
        jn.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jugarActionPerformed


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jugar;
    // End of variables declaration//GEN-END:variables
}
