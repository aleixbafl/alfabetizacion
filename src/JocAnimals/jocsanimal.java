//samuel fluerici
package JocAnimals;

import AbesedariJocs.menujocsabesedari;
import javax.swing.*;
import java.awt.event.*;
import panells.families;

public class jocsanimal extends javax.swing.JFrame {
    
    private String[] imagePaths = {"/imagenes3/imagen33.png", "/imagenes3/imagen1.png", "/imagenes3/imagen2.png", "/imagenes3/imagen3.png", "/imagenes3/imagen4.png", "/imagenes3/imagen5.png", "/imagenes3/imagen6.png", "/imagenes3/imagen7.png", "/imagenes3/imagen8.png", "/imagenes3/imagen9.png", "/imagenes3/imagen10.png", "/imagenes3/imagen11.png", "/imagenes3/imagen12.png", "/imagenes3/imagen13.png", "/imagenes3/imagen14.png", "/imagenes3/imagen15.png", "/imagenes3/imagen16.png", "/imagenes3/imagen17.png", "/imagenes3/imagen18.png", "/imagenes3/imagen19.png", "/imagenes3/imagen20.png", "/imagenes3/imagen21.png", "/imagenes3/imagen22.png", "/imagenes3/imagen23.png", "/imagenes3/imagen24.png", "/imagenes3/imagen25.png", "/imagenes3/imagen26.png", "/imagenes3/imagen27.png"};
    private String[] animalNames = {"Nombre33", "Abeja", "Ballena", "Cocodrilo", "Delfín", "Elefante", "Flamenco", "Gallina", "Hormiga", "Iguana", "jirafa", "Koala", "León", "Mono", "Nutria", "Ñu", "Oso", "Pingüino", "Quetzal", "Rana", "Serpiente", "Tortuga", "Urraca", "Vaca", "Wallaby", "Xarda", "Yapok", "Zorro"};
    private int currentIndex = 0;

    public jocsanimal() {
        initComponents();
        showImage();
        // Agregar el ActionListener al botón
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
    }

    private void showImage() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePaths[currentIndex]));
        imagen.setIcon(imageIcon);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Si currentIndex es 0 (primera imagen), simplemente avanzar a la siguiente imagen
        if (currentIndex == 0) {
            currentIndex++;
            showImage();
            return;
        }

        // Obtener el texto ingresado en el campo de texto
        String userInput = jTextField1.getText().trim();
        // Obtener el nombre del animal asociado a la imagen actual
        String correctAnimalName = animalNames[currentIndex];

        // Verificar si el texto ingresado coincide con el nombre del animal
        if (userInput.equalsIgnoreCase(correctAnimalName)) {
            JOptionPane.showMessageDialog(this, "¡Respuesta correcta!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "¡Respuesta incorrecta!", "Resultado", JOptionPane.ERROR_MESSAGE);
        }

        // Avanzar a la siguiente imagen
        currentIndex = (currentIndex + 1) % imagePaths.length;
        showImage();
        // Limpiar el campo de texto para la próxima entrada
        jTextField1.setText("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENDIVINA EL ANIMAL ");

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes3/imagen33.png"))); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Siguiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 105, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addComponent(jButton3)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              menujocsabesedari newframe = new menujocsabesedari();

        newframe.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         families newframe = new families();

        newframe.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jocsanimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

             
