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

public class fillsBD implements Serializable {
    private String dni;
    private String nom;
    private String cognoms;
    private String dataNaixe;
    private int niveInici;
    private int niveActual;

    public fillsBD() {
    }

    public fillsBD(String dni, String nom, String cognoms, String dataNaixe, int niveInici, int niveActual) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataNaixe = dataNaixe;
        this.niveInici = niveInici;
        this.niveActual = niveActual;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setDataNaixe(String dataNaixe) {
        this.dataNaixe = dataNaixe;
    }

    public void setNiveInici(int niveInici) {
        this.niveInici = niveInici;
    }

    public void setNiveActual(int niveActual) {
        this.niveActual = niveActual;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public String getDataNaixe() {
        return dataNaixe;
    }

    public int getNiveInici() {
        return niveInici;
    }

    public int getNiveActual() {
        return niveActual;
    }
    
    public void guardarFill(){
        File f = new File("fill.fill");
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
    
    public void lleguirFill(){
        File f = new File("fill.fill");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            fillsBD fillObj = (fillsBD) ois.readObject();
            
            this.dni = fillObj.getDni();
            this.nom = fillObj.getNom();
            this.cognoms = fillObj.getCognoms();
            this.dataNaixe = fillObj.getDataNaixe();
            this.niveInici = fillObj.getNiveInici();
            this.niveActual = fillObj.getNiveActual();
            
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
