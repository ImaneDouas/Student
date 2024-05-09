/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Souhaila
 */
public class filiereData {
    
    private String nom_filiere;
    private String description;
    private String objectif;
    
    public filiereData(String nom_filiere, String description, String objectif){
        this.nom_filiere = nom_filiere;
        this.description = description;
        this.objectif = objectif;
    }
    
    public String getFiliere(){
        return nom_filiere;
    }
    public String getDescription(){
        return description;
    }
    public String getObjectif(){
        return objectif;
    }
    
    
    
}
