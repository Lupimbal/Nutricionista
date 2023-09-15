/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nutri;

/**
 * “Magreza”, se o IMC for menor que 18,5 “Normal”, se o IMC for entre 18,5 e
 * 24,9 “Sobrepeso”, se o IMC for entre 25 e 29,9 “Obesidade”, se o IMC for
 * entre 30 e 39,9 “Obesidade grave”, se o IMC for maior ou igual a 40
 *
 * @author luiza
 */
public class IMC {

    private Double altura;
    private Double peso;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double calculoIMC() {
        return this.peso / (altura * altura);
    }

    public String interpretacao() {
        var resultado = calculoIMC();
        
        if (resultado < 18.5) {
            return ("Magreza");
        } 
        
        else if (resultado >= 18.5 && resultado <= 24.9) {
            return ("Normal");

        } 
        
        else if (resultado >= 25 && resultado <= 29.0) {
            return ("Sobrepeso");
        } 
        
            else if (resultado >= 30 && resultado <= 39.9) {
            return ("Obesidade");
        } 
            
            else 
            return ("Obesidade grave");


    }
}