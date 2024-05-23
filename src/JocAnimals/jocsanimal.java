//samuel fluerici
package JocAnimals;

import IniciarJocs.PanellJocs;
import javax.swing.*;
import panells.families;

public class jocsanimal extends javax.swing.JFrame {

    private String[] imagePaths = {"/imagenes3/imagen33.png", "/imagenes3/imagen1.png", "/imagenes3/imagen2.png", "/imagenes3/imagen3.png", "/imagenes3/imagen4.png", "/imagenes3/imagen5.png", "/imagenes3/imagen6.png", "/imagenes3/imagen7.png", "/imagenes3/imagen8.png", "/imagenes3/imagen9.png", "/imagenes3/imagen10.png", "/imagenes3/imagen11.png", "/imagenes3/imagen12.png", "/imagenes3/imagen13.png", "/imagenes3/imagen14.png", "/imagenes3/imagen15.png", "/imagenes3/imagen16.png", "/imagenes3/imagen17.png", "/imagenes3/imagen18.png", "/imagenes3/imagen19.png", "/imagenes3/imagen20.png", "/imagenes3/imagen21.png", "/imagenes3/imagen22.png", "/imagenes3/imagen23.png", "/imagenes3/imagen24.png", "/imagenes3/imagen25.png", "/imagenes3/imagen26.png", "/imagenes3/imagen27.png"};
    private String[] animalNames = {"Nombre33", "Abeja", "Ballena", "Cocodrilo", "Delfín", "Elefante", "Flamenco", "Gallina", "Hormiga", "Iguana", "jirafa", "Koala", "León", "Mono", "Nutria", "Ñu", "Oso", "Pingüino", "Quetzal", "Rana", "Serpiente", "Tortuga", "Urraca", "Vaca", "Wallaby", "Xarda", "Yapok", "Zorro"};
    private int currentIndex = 0;
    // Variable para almacenar la puntuación
    private int puntuacion = 0;
    // Variable para medir el tiempo de respuesta
    private long tiempo = 0;

    public jocsanimal() {
        initComponents();
        showImage();

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

        if (currentIndex == 0) {
        currentIndex++;
        showImage();
        return;
    }

    String userInput = jTextField1.getText().trim();

    String correctAnimalName = animalNames[currentIndex];
    boolean isCorrect = userInput.equalsIgnoreCase(correctAnimalName);

    if (isCorrect) {
        JOptionPane.showMessageDialog(this, "¡Respuesta correcta!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        // Sumar puntuación base por respuesta correcta
        int puntos = 10;
        // Bonificación por responder rápidamente
        if (tiempo <= 10) {
            puntos += 5;
        }
        puntuacion += puntos;
    } else {
        JOptionPane.showMessageDialog(this, "¡Respuesta incorrecta!", "Resultado", JOptionPane.ERROR_MESSAGE);
        // Penalización por respuesta incorrecta
        puntuacion -= 5;
    }

    currentIndex = (currentIndex + 1) % imagePaths.length;
    showImage();

    jTextField1.setText("");

    // Verificar si se ha mostrado la última imagen y mostrar la puntuación final
    if (currentIndex == 0) {
        mostrarPuntuacion();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes3/imagen33.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tornar-hi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Siguiente");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Instruccions");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENDIVINA EL ANIMAL ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Que animal és ? ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void mostrarPuntuacion() {
    JOptionPane.showMessageDialog(this, "Tu puntuación final es: " + puntuacion, "Puntuación final", JOptionPane.PLAIN_MESSAGE);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ImageIcon icono = new ImageIcon("img/logo.png");
        
        PanellJocs newframe = new PanellJocs();
        newframe.setTitle("Panell Activitats - Alfabetització");
        newframe.setMinimumSize(new java.awt.Dimension(600, 450));
        newframe.setResizable(false);
        newframe.setLocationRelativeTo(null);
        newframe.setIconImage(icono.getImage());

        this.dispose();
        newframe.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "\"¡Bienvenido al juego de adivinar animales!\\n\\n\" +\n"
                + "                         \"Instrucciones:\\n\" +\n"
                + "                         \"- Se mostrará una imagen de un animal.\\n\" +\n"
                + "                         \"- Debes escribir el nombre del animal en el campo de texto.\\n\" +\n"
                + "                         \"- Haz clic en el botón \\\"Comprobar\\\" para verificar tu respuesta.\\n\" +\n"
                + "                         \"- Puedes presionar el botón \\\"Ayuda\\\" en cualquier momento para ver esta explicación.\\n\" +\n"
                + "                         \"- ¡Diviértete aprendiendo sobre los animales!\";");
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jocsanimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
