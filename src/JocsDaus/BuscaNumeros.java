//samuel fluerici
package JocsDaus;

import IniciarJocs.PanellJocs;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objectesBD.fillsBD;
import serverConexio.conexioBD;

public class BuscaNumeros extends javax.swing.JFrame {

    public int dado2;
    public int dado1;
    public int puntuacion;
    public int sumaDados;
    private int contadorJuegos = 0;
    private boolean[] respuestasCorrectas = new boolean[10];
    private String numeros = "";

    public BuscaNumeros() {
        initComponents();
        puntuacion = 0;
        valida.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        imagendado1 = new javax.swing.JLabel();
        imagendado2 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        numeroIntroduit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valida = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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
        jButton1.setBounds(30, 690, 100, 27);

        imagendado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alea_6.png"))); // NOI18N
        jPanel1.add(imagendado1);
        imagendado1.setBounds(20, 150, 370, 270);

        imagendado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alea_6.png"))); // NOI18N
        jPanel1.add(imagendado2);
        imagendado2.setBounds(450, 150, 380, 270);

        start.setBackground(new java.awt.Color(0, 0, 0));
        start.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setText("START");
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start);
        start.setBounds(50, 470, 260, 50);

        numeroIntroduit.setBackground(new java.awt.Color(0, 0, 0));
        numeroIntroduit.setForeground(new java.awt.Color(255, 255, 255));
        numeroIntroduit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(numeroIntroduit);
        numeroIntroduit.setBounds(440, 470, 250, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Quin és el resultat de la suma?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 430, 340, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Resultat:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 580, 440, 40);

        valida.setBackground(new java.awt.Color(0, 0, 0));
        valida.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        valida.setForeground(new java.awt.Color(255, 255, 255));
        valida.setText("Validar");
        valida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validaActionPerformed(evt);
            }
        });
        jPanel1.add(valida);
        valida.setBounds(500, 540, 120, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("+");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 246, 25, 50);

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
        jButton5.setBounds(150, 690, 120, 27);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Joc dels Daus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        
    }//GEN-LAST:event_startMouseClicked

    private void validaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validaActionPerformed
        if (numeroIntroduit.getText().isEmpty()) {
            missatge("Has d'introduir un número.");
        } else {
            try {
                int numInt = Integer.parseInt(numeroIntroduit.getText());
                System.out.println(respuestasCorrectas.length + " | " + contadorJuegos);
                if (numInt == sumaDados) {
                    jLabel3.setText("Resultat: Número correcte!");
                    respuestasCorrectas[contadorJuegos] = true;
                    puntuacion++;
                } else {
                    jLabel3.setText("Resultat: Número incorrecte!");
                    respuestasCorrectas[contadorJuegos] = false;
                }
                if (contadorJuegos < 9) {
                    contadorJuegos++;
                    start.setEnabled(true);
                    valida.setEnabled(false);
                } else if (contadorJuegos >= 9) {
                    start.setEnabled(false);
                    valida.setEnabled(false);
                    missatge("Ja s'ha acabat l'activitat.");
                    mostrarPuntuacion();
                    guardarNota();
                }
                guardarOperacions(dado1, dado2, sumaDados, numInt);
            } catch (NumberFormatException ex) {
                missatge("El valor que has d'introduir ha de ser un número.");
            }
        }
    }//GEN-LAST:event_validaActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        dado1 = numeroRandom();
        dado2 = numeroRandom();

        imagendado1.setIcon(new ImageIcon(getClass().getResource("/imagenes/Alea_" + dado1 + ".png")));
        imagendado2.setIcon(new ImageIcon(getClass().getResource("/imagenes/Alea_" + dado2 + ".png")));

        sumaDados = dado1 + dado2;
        
        numeroIntroduit.setText("");
        start.setEnabled(false);
        valida.setEnabled(true);
        jLabel3.setText("Resultat:");
    }//GEN-LAST:event_startActionPerformed

    private void mostrarPuntuacion() {
        int respuestasCorrectasCount = 0;
        for (boolean respuesta : respuestasCorrectas) {
            if (respuesta) {
                respuestasCorrectasCount++;
            }
        }
        JOptionPane.showMessageDialog(this, "Tu puntuación es: " + respuestasCorrectasCount + "/10");
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
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField numeroIntroduit;
    private javax.swing.JButton start;
    private javax.swing.JButton valida;
    // End of variables declaration//GEN-END:variables

    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(rootPane, missatge);
    }

    private void guardarNota() {
        double c = 0;
        for (int i = 0; i < respuestasCorrectas.length; i++) {
            if (respuestasCorrectas[i]) {
                c++;
            }
        }

        fillsBD fill = new fillsBD();
        fill.lleguirFill();

        conexioBD conexio = new conexioBD();
        conexio.obrirConexio();
        try {
            conexio.ecjecutarActualitzar("INSERT INTO `activitatRealitzat`(`dniFill`, `nota`, `tipo`, `comtingutActiv`) VALUES ('" + fill.getDni() + "','" + c + "','Números - Sumar Daus','" + numeros + "');");
        } catch (SQLException ex) {
            missatge(conexio.missatgeError(ex.getErrorCode()));
            conexio.tancaConexio();
        }
        missatge("S'ha guardat correctament la nota de l'activitat.");
        conexio.tancaConexio();
    }

    private void guardarOperacions(int dado1, int dado2, int sumaDados, int numIntroduit) {
        if (numeros.equals("")) {
            numeros = "(" + dado1 + "  + " + dado2 + " = " + sumaDados + " | Introduit: " + numIntroduit + ")";
        } else {
            numeros = numeros + ", (" + dado1 + "+" + dado2 + " = " + sumaDados + " | Introduit: " + numIntroduit + ")";
        }
    }

    private int numeroRandom() {
        Random rnd = new Random();
        return rnd.nextInt(6) + 1;
    }
}
