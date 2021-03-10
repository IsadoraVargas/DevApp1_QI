
package exeraula3;

public class Pessoa {
    public String nome ;
    private int idade ;
    private double renda ;   
    boolean String;
    
public int getIdade() {
   return idade; 
}
public void setIdade (int idade) {
    this.idade = idade;
}
public double getRenda() {
    return renda;
}
public void setRenda (double renda){
    this.renda = renda;
}
 public String veriIdade(int idade){
  String resposta;
   if (18 <= this.idade){
    resposta = "MAIOR de idade";
 }else{
     resposta = "MENOR de idade";
 }
 return resposta; 
 }
 public String veriRenda(double renda ){
  String resposta;
   if (this.renda >= 15.000){
    resposta = "Declarado RICO ";
 }else{
     resposta = "Declarado POBRE";
 }
 return resposta;        
}
}