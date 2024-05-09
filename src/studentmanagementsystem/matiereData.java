/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Souhaila
 */
public class matiereData {
    
    private String NomMatiere;
    private String descriptionMatiere;
    private int coeffMatiere;    
    private int volumeHoraire;
    private String module;

    
    public matiereData(String NomMatiere, String descriptionMatiere, int coeffMatiere, int volumeHoraire , String module){
        this.NomMatiere = NomMatiere;
        this.descriptionMatiere = descriptionMatiere;
        this.coeffMatiere = coeffMatiere;
        this.volumeHoraire = volumeHoraire;
        this.module = module;
    }
    
    public String getMatiere(){
        return NomMatiere;
    }
    public String getDescription(){
        return descriptionMatiere;
    }
    public int getCoeff(){
        return coeffMatiere;
    }
    public int getVolume(){
        return volumeHoraire;
    }
    
        public String getModule(){
        return module;
    }
    
    
    
}
