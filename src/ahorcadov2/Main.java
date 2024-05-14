package ahorcadov2;

import AbesedariJocs.menujocsabesedari;
import IniciarJocs.PanellJocs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

   
    private ImageIcon imgs[];
    private JButton btns[];
    private String msgs[];
    private int ran;
    private int err;
    private String res[];
    
    public Main() {
        initComponents();
        imgs = new ImageIcon[6];
        btns = new JButton[27];
        msgs = new String[10];
        
        //VECTOR CON LAS IMAGENES DEL AHORCADO
        imgs[0] = new ImageIcon(getClass().getResource("/ahorcadov2/im1.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/ahorcadov2/im2.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/ahorcadov2/im3.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/ahorcadov2/im4.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/ahorcadov2/im5.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/ahorcadov2/im6.jpg"));
        
        //VECTOR CON LOS BOTONES DE LAS LETRAS
        btns[1] = jButton2;
        btns[2] = jButton3;
        btns[3] = jButton4;
        btns[4] = jButton5;
        btns[5] = jButton6;
        btns[6] = jButton7;
        btns[7] = jButton8;
        btns[8] = jButton9;
        btns[9] = jButton10;
        btns[10] = jButton11;
        btns[11] = jButton12;
        btns[12] = jButton13;
        btns[13] = jButton14;
        btns[14] = jButton15;
        btns[15] = jButton16;
        btns[16] = jButton17;
        btns[17] = jButton18;
        btns[18] = jButton19;
        btns[19] = jButton20;
        btns[20] = jButton21;
        btns[21] = jButton22;
        btns[22] = jButton23;
        btns[23] = jButton24;
        btns[24] = jButton25;
        btns[25] = jButton26;
        btns[26] = jButton27;
        
      
        
//MENSAJES PARA ADIVINAR
        msgs[0] = "Los ordenadores son inutiles Solo pueden darte respuestas".toUpperCase();
        msgs[1] = "Se ha creado el ordenador perfecto Metes todos tus problemas y ya no vuelven a salir".toUpperCase();
        msgs[2] = "Para definir la recursividad primero debemos definir la recursividad".toUpperCase();
        msgs[3] = "El hardware es aquello a lo que puedes dar patadas Software es aquello a lo que solo puedes insultar".toUpperCase();
        msgs[4] = "En Internet nadie sabe que eres un perro".toUpperCase();
        msgs[5] = "No soy un nerd solo soy mas inteligente que TU".toUpperCase();
        msgs[6] = "Los fines de semana fueron hechos para la programacion".toUpperCase();
        msgs[7] = "Los programadores nunca mueren tan solo se pierden en el Proceso".toUpperCase();
        msgs[8] = "Cuando tengas duda usa la fuerza bruta".toUpperCase();
        msgs[9] = "Cuidense de los programadores que lleven destornilladores".toUpperCase();
        msgs[9] = "Samuel es un crak ?".toUpperCase();
        
        
        //A CADA LETRA LE ASGINNAMOS UN EVENTO PARA CHECAR CADA QUE SE PRESIONA
        for (int i = 1; i < 27; i++) {
            btns[i].addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        checarLetra(e);                    
                    } 
            });
        }
        iniciar();
    }
    
    //FUNCION INICIA TODOS LOS PARAMETROS DEL JUEGO
    private void iniciar(){
        //ERRORES EN 0
        err = 0;
        jButton1.setIcon(imgs[0]);
        jTextPane1.setText("");
        //ACTIVAMOS TODAS LAS LETRAS
        for (int i = 1; i < 27; i++) {
            btns[i].setEnabled(true);
        }
        //GENERAMOS UN MENGSAME RANDOM
        ran =(int) 0 + (int)(Math.random() * ((msgs.length - 1) + 1));
        //SEPARAMOS EL MENSAJE POR PALABRAS
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length()+1];
        int j = 0;
        //VAMOS IMPRIMIENDO EL NUMERO DE CARACTERES DEL MENSAGE CON _
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                jTextPane1.setText(jTextPane1.getText() + "_ ");
                res[j++] = "_";
            }
            jTextPane1.setText(jTextPane1.getText() + "\n");
            res[j++] = " ";
        }
    }
    
    //CADA QUE SE PRESIONA UNA LETRA SE COMPRUEBA EL ESTADO DEL JUEGO
    private void checarLetra(ActionEvent e){
        JButton bt = (JButton)e.getSource();
        char c[];
        //SE BUSCA LA LETRA QUE SE PRESIONO
        for (int i = 1; i < 27; i++) {
            if(bt == btns[i]){
                //SE SACA LA LETRA
                c = Character.toChars(64+i);
                //BUSCAMOS QUE LA LETRA SE ENCUENTRE EN LA FRASE
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if(c[0] == msgs[ran].charAt(j)){
                        res[j] = c[0]+"";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if(esta){
                    jTextPane1.setText("");
                    for (String re : res) {
                        if(" ".equals(re))jTextPane1.setText(jTextPane1.getText() + "\n");
                        else jTextPane1.setText(jTextPane1.getText() + re +" ");
                    }
                    //SE COMPRUEBA QUE SE GANO CUANDO YA NO HAYA _ EN EL MENSAGE
                    boolean gano = true;
                    for (String re : res) {
                        if(re.equals("_")){
                            gano = false;
                            break;
                        }
                    }
                    //SI SE GANO SE MANDA UN MENSAGE Y SE REINIICIA EL JUEGO
                    if(gano){
                        JOptionPane.showMessageDialog(this, "FELICIDADES HAS GANADO!!!");
                        iniciar();
                        return;
                    }
                //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN 
                }else{
                    jButton1.setIcon(imgs[++err]);
                    //SI LLEGAMOS A LOS 5 ERRORES ENTONCES SE PERDIO EL JUEGO Y SE MANDA EL MENSAGE
                    if(err == 5){
                        JOptionPane.showMessageDialog(this, "HAS PERDIDO, LA FRASE ERA:\n"+msgs[ran]);
                        iniciar();
                        return;
                    }
                }
                //CADA QUE SE PRESIONA UNA LETRA SE DESACTIVA PARA QUE NO SE PUEDA PREISONAR OTRA VEZ
                bt.setEnabled(false);
                break;
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("netosolis.com");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcadov2/im1.jpg"))); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 204, 0));
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("A");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("B");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("C");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("D");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton6.setText("E");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton7.setText("F");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton8.setText("G");

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton9.setText("H");

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton10.setText("I");

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton11.setText("J");

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton12.setText("K");

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton13.setText("L");

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton14.setText("M");

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton15.setText("N");

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton16.setText("O");

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton17.setText("P");

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton18.setText("Q");

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton19.setText("R");

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton20.setText("S");

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton21.setText("T");

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton22.setText("U");

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton23.setText("V");

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton24.setText("W");

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton25.setText("X");

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton26.setText("Y");

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton27.setText("Z");

        jButton28.setBackground(new java.awt.Color(0, 0, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Reiniciar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 0));
        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Volver");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Instrucciónes");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EL JUEGO DEL AHORACADO ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton31.setBackground(new java.awt.Color(0, 0, 0));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("MENU");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31)
                    .addComponent(jButton30)
                    .addComponent(jButton29))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton22)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton13)
                            .addComponent(jButton14)
                            .addComponent(jButton15))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton19)
                            .addComponent(jButton20)
                            .addComponent(jButton21)
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton23)
                            .addComponent(jButton24)
                            .addComponent(jButton25)
                            .addComponent(jButton26)
                            .addComponent(jButton27))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButton29)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton31)
                        .addGap(22, 22, 22))))
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

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        iniciar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
       menujocsabesedari newframe = new menujocsabesedari();

        newframe.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "\"¡Bienvenido al juego del ahorcado!\\n\\n\" +\n" +
"                         \"Instrucciones:\\n\" +\n" +
"                         \"- Se mostrará una palabra oculta.\\n\" +\n" +
"                         \"- Tu objetivo es adivinar la palabra pulsando las letras una por una.\\n\" +\n" +
"                         \"- Tienes un número limitado de intentos para adivinar la palabra antes de ser ahorcado.\\n\" +\n" +
"                         \"- Pulsa una letra en la interfaz y el sistema verificará si está en la palabra.\\n\" +\n" +
"                         \"- Si la letra está en la palabra, se mostrará en su posición correspondiente.\\n\" +\n" +
"                         \"- Si la letra no está en la palabra, se perderá un intento.\\n\" +\n" +
"                         \"- ¡Diviértete y trata de adivinar la palabra para evitar ser ahorcado!\";");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
          PanellJocs newframe = new PanellJocs();

        newframe.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton31ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
