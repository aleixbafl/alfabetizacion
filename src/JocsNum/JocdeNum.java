//samuel Fluerici
package JocsNum;

import AbesedariJocs.menujocsabesedari;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menunumeros.menujocsnumeros;
import panells.families;


public class JocdeNum extends javax.swing.JFrame {

 public int num1;
public  int num2;
public int restaNum;

    public JocdeNum() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JOC DE NUMEROS ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(286, 26, 215, 32);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("START");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 400, 210, 60);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Comprovar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 480, 111, 27);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 410, 195, 53);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Resultado : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 530, 195, 42);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(560, 680, 72, 23);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(680, 680, 72, 23);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cuanto da esta resta ? ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 370, 203, 20);

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/un5.png"))); // NOI18N
        jPanel1.add(imagen2);
        imagen2.setBounds(512, 123, 204, 204);

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/un5.png"))); // NOI18N
        jPanel1.add(imagen1);
        imagen1.setBounds(171, 123, 204, 204);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(381, 206, 15, 48);

        jButton5.setText("Instrucciónes ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(405, 680, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     try {
        int numeroIngresado = Integer.parseInt(jTextField1.getText()); 
        if (numeroIngresado == restaNum) { 
            jLabel3.setText("¡Número correcto!"); 
        } else {
            jLabel3.setText("Número incorrecto. La resta de los dados es: " + restaNum ); 
        }
    } catch (NumberFormatException e) {
        jLabel3.setText("Por favor, ingresa un número válido."); 
    }
             
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        Random rnd = new Random();
        int num1 = rnd.nextInt(6) + 1; 
        int num2 = rnd.nextInt(6) + 1; 

    imagen1.setIcon(new ImageIcon(getClass().getResource("/imagenes2/un" + num1 + ".png")));
    imagen2.setIcon(new ImageIcon(getClass().getResource("/imagenes2/un" + num2 + ".png")));
            
     System.out.println("num1: " + num1 + ", num2: " + num2);

    restaNum = num1 - num2;
    
    
        if (num1==0){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un1.png")));
        }
        else if (num1==1){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un2.png")));
        }
        else if (num1==2){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un3.png")));
        }
        else if (num1==3){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un4.png")));
        }
        else if (num1==4){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un5.png")));
        }
        else if (num1==5){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un6.png")));
        }
         else if (num1==6){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un7.png")));
        }
         else if (num1==7){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un8.png")));
        }
         else if (num1==8){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un9.png")));
        }
         else if (num1==9){
            imagen1.setIcon(new ImageIcon(getClass().getResource("un10.png")));
        }
        
         if (num2==0){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un1.png")));
        }
        else if (num2==1){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un2.png")));
        }
        else if (num2==2){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un3.png")));
        }
        else if (num2==3){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un4.png")));
        }
        else if (num2==4){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un5.png")));
        }
        else if (num2==5){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un6.png")));
        }
           else if (num2==6){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un7.png")));
        }
           else if (num2==7){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un8.png")));
        }
           else if (num2==8){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un9.png")));
        }
           else if (num2==9){
            imagen2.setIcon(new ImageIcon(getClass().getResource("un10.png")));
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menujocsnumeros newframe = new menujocsnumeros();

        newframe.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         families newframe = new families();

        newframe.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       JOptionPane.showMessageDialog(rootPane, "\"¡Bienvenido al juego de la resta!\\n\\n\" +\n" +
"                         \"Instrucciones:\\n\" +\n" +
"                         \"- Se mostrarán dos números aleatorios.\\n\" +\n" +
"                         \"- Debes calcular la resta entre ambos números.\\n\" +\n" +
"                         \"- Escribe tu respuesta en el campo de texto.\\n\" +\n" +
"                         \"- Haz clic en el botón \\\"Comprobar\\\" para verificar tu respuesta.\\n\" +\n" +
"                         \"- Puedes presionar el botón \\\"Ayuda\\\" en cualquier momento para ver esta explicación.\\n\" +\n" +
"                         \"- ¡Diviértete practicando resta!\";");
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JocdeNum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
