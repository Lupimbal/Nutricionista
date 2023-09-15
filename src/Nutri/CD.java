/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nutri;

/**
 *
 * @author luiza
 * Carboidratos = calorias * 0,5 / 4
    Proteínas = calorias * 0,25 / 4
Gordura = calorias * 0,25 / 9
*         this.Carboidratos = CD * (0,5 / 4);
*  public String interpretacao() {
        var resultado = calculoIMC();
 */
public class CD {
    private Double calorias;

    
    public Double getcalorias() {
        return calorias;
    }

    public void setcalorias(Double CD) {
        this.calorias = CD;
    }
     public Double calculoCarboidrato() {
        return this.calorias * (0.5 / 4);
     }
     public Double calculoProteina() {
        return this.calorias * (0.25 / 4);
     }
    public Double calculoGordura() {
        return this.calorias * (0.25 / 9);
    }

}
        
     
    /**public double CalculoRecomendacao(){
        var carboidratos = calorias * (0.5 / 4)();
        var proteinas = calorias * (0.25 / 4)();
        var gordura = calorias * (0.25 / 9)();**/
            
        
    

    

