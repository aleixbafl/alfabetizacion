package objectesBD;

import java.io.Serializable;

public class usuariBD implements Serializable {
    private String nomUsuari;
    private String contrasenya;
    private String correuElcectronic;

    public usuariBD(String nomUsuari, String contrasenya, String correuElcectronic) {
        this.nomUsuari = nomUsuari;
        this.contrasenya = contrasenya;
        this.correuElcectronic = correuElcectronic;
    }

    public String getNomUsuari() {
        return nomUsuari;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public String getCorreuElcectronic() {
        return correuElcectronic;
    }
}
