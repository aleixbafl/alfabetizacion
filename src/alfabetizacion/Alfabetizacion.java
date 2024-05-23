package alfabetizacion;

import java.io.File;
import javax.swing.ImageIcon;
import loginReguistre.login;

public class Alfabetizacion {
    public static void main(String[] args) {
        Alfabetizacion aplicacio =  new Alfabetizacion();
        aplicacio.inici();
    }

    private void inici() {
        File f = new File("fill.fill");
        if (f.exists()) {
            f.delete();
        }
        
        ImageIcon icono = new ImageIcon("img/logo.png");
        
        login pantallaLogin = new login();
        pantallaLogin.setTitle("Iniciar Sessió - Alfabetització");
        pantallaLogin.setMinimumSize(new java.awt.Dimension(500, 600));
        pantallaLogin.setResizable(false);
        pantallaLogin.setLocationRelativeTo(null);
        pantallaLogin.setIconImage(icono.getImage());
        pantallaLogin.setVisible(true);
    }
}
