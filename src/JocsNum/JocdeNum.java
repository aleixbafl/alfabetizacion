//samuel Fluerici
package JocsNum;

import java.util.Random;
import javax.swing.ImageIcon;


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JOC DE NUMEROS ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Comprovar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Resultado : ");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Menu");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Volver");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cuanto da esta resta ? ");

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JocsNum/ocho.png"))); // NOI18N

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JocsNum/cinco.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)
                        .addGap(292, 292, 292)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(116, 116, 116)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     try {
        int numeroIngresado = Integer.parseInt(jTextField1.getText()); // Obtener el número ingresado por el jugador
        if (numeroIngresado == restaNum) { // Comparar el número ingresado con la suma de los valores de los dados
            jLabel3.setText("¡Número correcto!"); // Establecer el texto del JLabel como "¡Número correcto!"
        } else {
            jLabel3.setText("Número incorrecto. La resta de los dados es: " + restaNum ); // Establecer el texto del JLabel como "Número incorrecto. La suma de los dados es: [sumaDados]"
        }
    } catch (NumberFormatException e) {
        jLabel3.setText("Por favor, ingresa un número válido."); // Establecer el texto del JLabel como "Por favor, ingresa un número válido."
    }
             
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Random rnd = new Random();
        int num1 = rnd.nextInt(6) + 1; 
        int num2 = rnd.nextInt(6) + 1; 

    imagen1.setIcon(new ImageIcon(getClass().getResource("/JocsNum/un" + num1 + ".png")));
    imagen2.setIcon(new ImageIcon(getClass().getResource("/JocsNum/un" + num2 + ".png")));
            
     System.out.println("num1: " + num1 + ", num2: " + num2);

    // Calcula la suma de los valores de los dados
    restaNum = num1 - num2;
    
    
        if (num1==0){
            imagen1.setIcon(new ImageIcon(getClass().getResource("uno.png")));
        }
        else if (num1==1){
            imagen1.setIcon(new ImageIcon(getClass().getResource("dos.png")));
        }
        else if (num1==2){
            imagen1.setIcon(new ImageIcon(getClass().getResource("tres.png")));
        }
        else if (num1==3){
            imagen1.setIcon(new ImageIcon(getClass().getResource("cuanto.png")));
        }
        else if (num1==4){
            imagen1.setIcon(new ImageIcon(getClass().getResource("cinco.png")));
        }
        else if (num1==5){
            imagen1.setIcon(new ImageIcon(getClass().getResource("seis.png")));
        }
         else if (num1==6){
            imagen1.setIcon(new ImageIcon(getClass().getResource("siete.png")));
        }
         else if (num1==7){
            imagen1.setIcon(new ImageIcon(getClass().getResource("ocho.png")));
        }
         else if (num1==8){
            imagen1.setIcon(new ImageIcon(getClass().getResource("nueve.png")));
        }
         else if (num1==9){
            imagen1.setIcon(new ImageIcon(getClass().getResource("diez.png")));
        }
        
         if (num2==0){
            imagen2.setIcon(new ImageIcon(getClass().getResource("uno.png")));
        }
        else if (num2==1){
            imagen2.setIcon(new ImageIcon(getClass().getResource("dos.png")));
        }
        else if (num2==2){
            imagen2.setIcon(new ImageIcon(getClass().getResource("tres.png")));
        }
        else if (num2==3){
            imagen2.setIcon(new ImageIcon(getClass().getResource("cuatro.png")));
        }
        else if (num2==4){
            imagen2.setIcon(new ImageIcon(getClass().getResource("cinco.png")));
        }
        else if (num2==5){
            imagen2.setIcon(new ImageIcon(getClass().getResource("seis.png")));
        }
           else if (num2==6){
            imagen2.setIcon(new ImageIcon(getClass().getResource("siete.png")));
        }
           else if (num2==7){
            imagen2.setIcon(new ImageIcon(getClass().getResource("ocho.png")));
        }
           else if (num2==8){
            imagen2.setIcon(new ImageIcon(getClass().getResource("nueve.png")));
        }
           else if (num2==9){
            imagen2.setIcon(new ImageIcon(getClass().getResource("diez.png")));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
