package objectesBD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuariBD implements Serializable {
    private String nomUsuari;
    private String contrasenya;
    private String correuElcectronic;

    public usuariBD(String nomUsuari, String contrasenya, String correuElcectronic) {
        this.nomUsuari = nomUsuari;
        this.contrasenya = contrasenya;
        this.correuElcectronic = correuElcectronic;
    }

    public usuariBD() {
    }

    public void setNomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public void setCorreuElcectronic(String correuElcectronic) {
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
    
    public void guardarUser(){
        File f = new File("usuari.usr");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fillsBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(fillsBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
