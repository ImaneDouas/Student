/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Souhaila
 */
public class moduleData {
    
    private String NomModule;
    private String descriptionModule;
    private String niveauModule;
    private String filiere;

    
    public moduleData(String Nom_mod, String description_mod, String niveau_mod, String filiere){
        this.NomModule = Nom_mod;
        this.descriptionModule = description_mod;
        this.niveauModule = niveau_mod;
        this.filiere = filiere;
    }
    
    public String getModule(){
        return NomModule;
    }
    public String getDescription(){
        return descriptionModule;
    }
    public String getNiveau(){
        return niveauModule;
    }
    public String getFiliere(){
        return filiere;
    }
    
    
    
}
