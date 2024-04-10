package alfabetizacion;

import loginReguistre.login;

public class Alfabetizacion {
    public static void main(String[] args) {
        Alfabetizacion aplicacio =  new Alfabetizacion();
        aplicacio.inici();
    }

    private void inici() {
        login pantallaLogin = new login();
        pantallaLogin.setTitle("Iniciar Sessió - Alfabetització");
        pantallaLogin.setMinimumSize(new java.awt.Dimension(500, 600));
        pantallaLogin.setResizable(false);
        pantallaLogin.setLocationRelativeTo(null);
        pantallaLogin.setVisible(true);
    }
}
