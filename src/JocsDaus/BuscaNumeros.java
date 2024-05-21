//samuel
package JocsDaus;

import IniciarJocs.PanellJocs;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menunumeros.menujocsnumeros;

public class BuscaNumeros extends javax.swing.JFrame {

    public int dado2;
    public int dado1;
    public int puntuacion;
    public int sumaDados;
    private int contadorJuegos = 0;
    private boolean[] respuestasCorrectas = new boolean[10];

    public BuscaNumeros() {
        initComponents();
        puntuacion = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagendado1 = new javax.swing.JLabel();
        imagendado2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tornar-hi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 690, 100, 26);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Joc dels Daus");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 50, 147, 33);

        imagendado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alea_6.png"))); // NOI18N
        jPanel1.add(imagendado1);
        imagendado1.setBounds(20, 150, 370, 270);

        imagendado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alea_6.png"))); // NOI18N
        jPanel1.add(imagendado2);
        imagendado2.setBounds(450, 150, 380, 270);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
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

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 470, 250, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Quin és el resultat de la suma?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 430, 340, 26);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Resultat:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 580, 440, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Validar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(500, 540, 120, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("+");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 246, 21, 50);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Instruccions");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(150, 690, 120, 26);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(210, 30, 360, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImageIcon icono = new ImageIcon("img/logo.png");

        PanellJocs pantallaJocs = new PanellJocs();
        pantallaJocs.setTitle("Panell Activitats - Alfabetització");
        pantallaJocs.setMinimumSize(new java.awt.Dimension(600, 450));
        pantallaJocs.setResizable(false);
        pantallaJocs.setLocationRelativeTo(null);
        pantallaJocs.setIconImage(icono.getImage());

        this.dispose();
        pantallaJocs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Random rnd = new Random();
        int dado1 = rnd.nextInt(6) + 1;
        int dado2 = rnd.nextInt(6) + 1;

        imagendado1.setIcon(new ImageIcon(getClass().getResource("/imagenes/Alea_" + dado1 + ".png")));
        imagendado2.setIcon(new ImageIcon(getClass().getResource("/imagenes/Alea_" + dado2 + ".png")));

        sumaDados = dado1 + dado2;

        contadorJuegos++;
        if (contadorJuegos >= 10) {
            mostrarPuntuacion();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            int numeroIngresado = Integer.parseInt(jTextField1.getText());
            if (numeroIngresado == sumaDados) {
                jLabel3.setText("¡Número correcto!");
                respuestasCorrectas[contadorJuegos - 1] = true;
            } else {
                jLabel3.setText("Número incorrecto. La suma de los dados es: " + sumaDados);
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


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

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
        respuestasCorrectas = new boolean[10];
        jLabel3.setText("");
        jTextField1.setText("");
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "\"¡Bienvenido al juego de los dados!\\n\\n\" +\n"
                + "\"Instrucciones:\\n\" +\n"
                + "\"- Se lanzarán dos dados.\\n\" +\n"
                + "\"- Se mostrarán las imágenes de los dados y la suma de sus valores.\\n\" +\n"
                + "\"- ¡Intenta adivinar cuál será la suma de los valores de los dados!\\n\" +\n"
                + "\"- Escribe tu respuesta en el campo de texto.\\n\" +\n"
                + "\"- Haz clic en el botón \\\"Comprobar\\\" para verificar tu respuesta.\\n\" +\n"
                + "\"- Puedes presionar el botón \\\"Ayuda\\\" en cualquier momento para ver esta explicación.\\n\" +\n"
                + "\"- ¡Diviértete jugando con los dados!\";");
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
