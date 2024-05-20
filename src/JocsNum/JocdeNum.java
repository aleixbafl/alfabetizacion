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
    public int num2;
    public int restaNum;
    public int puntuacion;
    private int contadorJuegos = 0;
    private boolean[] respuestasCorrectas = new boolean[10];

    public JocdeNum() {
        initComponents();
        puntuacion = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JOC DE NUMEROS ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(286, 26, 215, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("START");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 400, 210, 60);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Comprovar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 480, 111, 27);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 410, 195, 53);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 680, 72, 27);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(680, 680, 80, 27);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cuanto da esta resta ? ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 370, 203, 20);

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/un5.png"))); // NOI18N
        jPanel1.add(imagen2);
        imagen2.setBounds(490, 130, 204, 204);

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/un5.png"))); // NOI18N
        jPanel1.add(imagen1);
        imagen1.setBounds(171, 123, 204, 204);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(381, 206, 15, 48);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Instrucciónes ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(405, 680, 130, 27);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(220, 10, 340, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Operacines contestadas : ");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 540, 250, 70);

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
                respuestasCorrectas[contadorJuegos - 1] = true;
            } else {
                jLabel3.setText("Número incorrecto. La resta de los dados es: " + restaNum);
                respuestasCorrectas[contadorJuegos - 1] = false;
            }
        } catch (NumberFormatException e) {
            jLabel3.setText("Por favor, ingresa un número válido.");
            respuestasCorrectas[contadorJuegos - 1] = false;
        }
        contadorJuegos++;

        if (contadorJuegos >= 10) {
            mostrarPuntuacion();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (contadorJuegos < 10) {
            if (contadorJuegos < 10) {
                Random rnd = new Random();
                num1 = rnd.nextInt(10) + 1;
                num2 = rnd.nextInt(10) + 1;

                contadorJuegos++;
                jLabel4.setText(String.valueOf(contadorJuegos));

                imagen1.setIcon(new ImageIcon(getClass().getResource("/imagenes2/un" + num1 + ".png")));
                imagen2.setIcon(new ImageIcon(getClass().getResource("/imagenes2/un" + num2 + ".png")));

                System.out.println("num1: " + num1 + ", num2: " + num2);

                restaNum = num1 - num2;

                // Actualizar la etiqueta de imagen solo es necesario si las imágenes no coinciden con el valor
                imagen1.setIcon(new ImageIcon(getClass().getResource("/imagenes2/un" + num1 + ".png")));
                imagen2.setIcon(new ImageIcon(getClass().getResource("/imagenes2/un" + num2 + ".png")));

            } else {
                mostrarPuntuacion();
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void mostrarPuntuacion() {
        int respuestasCorrectasCount = 0;
        for (boolean respuesta : respuestasCorrectas) {
            if (respuesta) {
                respuestasCorrectasCount++;
            }
        }
        JOptionPane.showMessageDialog(this, "Tu puntuación es: " + respuestasCorrectasCount + "/10");
        reiniciarJuego();
    }

    private void reiniciarJuego() {
        contadorJuegos = 0;
        respuestasCorrectas = new boolean[10]; // Reiniciar el array de respuestas correctas
        puntuacion = 0;
        jLabel4.setText(String.valueOf(contadorJuegos));
        jLabel3.setText("");
        jTextField1.setText("");
    }

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
        JOptionPane.showMessageDialog(rootPane, "\"¡Bienvenido al juego de la resta!\\n\\n\" +\n"
                + "\"Instrucciones:\\n\" +\n"
                + "\"- Se mostrarán dos números aleatorios.\\n\" +\n"
                + "\"- Debes calcular la resta entre ambos números.\\n\" +\n"
                + "\"- Escribe tu respuesta en el campo de texto.\\n\" +\n"
                + "\"- Haz clic en el botón \\\"Comprobar\\\" para verificar tu respuesta.\\n\" +\n"
                + "\"- Puedes presionar el botón \\\"Ayuda\\\" en cualquier momento para ver esta explicación.\\n\" +\n"
                + "\"- ¡Diviértete practicando resta!\";");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private String toString(int contadorJuegos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
