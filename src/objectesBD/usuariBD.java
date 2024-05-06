package objectesBD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    
    public void lleguirUser(){
        File f = new File("usuari.usr");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            usuariBD userSave = (usuariBD) ois.readObject();
            
            this.nomUsuari = userSave.getNomUsuari();
            this.contrasenya = userSave.getContrasenya();
            this.correuElcectronic = userSave.getCorreuElcectronic();
            
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            missatge("Error d'ubicació i/o de nom de la lectura de l'arxiu de les credencials.");
        } catch (IOException ex) {
            missatge("Error de lectura de les credencials.");
        } catch (ClassNotFoundException ex) {
            missatge("Classe no trobada.");
        } 
    }
    
    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(null, missatge);
    }
}
