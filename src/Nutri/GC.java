/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nutri;

/**
 *
 * @author luiza
 */
public class GC {
    private Double altura;
    private Double peso;
    private int idade;
    private String sexo;




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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
      public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double calculaGB(){
        if (sexo.equals("F")){
        double gbf = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
        return gbf;
        }
        else if (sexo.equals("M")){
        double gbm = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
        return gbm;
        }
        else {
            return 0;
        }
    }
  }
        

    

   


       
       /** CalBasal = 66 + (13,8 * Peso) + (5 * Altura) – (6,8 * Idade) = homem
        CalBasal = 655 + (9,6 * Peso) + (1,9 * Altura) – (4,7 * Idade)= mulher*/
  




