
package biblioteca;

 public class Livro {
 public String titulo;
 public int ano;
 private double preco;
 private double orcamento;
public void setTitulo (String titulo) {
     this.titulo = titulo;       
}     
public String getTitulo () { 
     return this.titulo;
}
private void setAno (int ano) {
     this.ano = ano;       
}     
int getAno() { 
     return this.ano;
}

void setPreco (double preco) {
     this.preco = preco;       
}     
double getPreco () { 
     return this.preco;  
}
void setOrcamento (double orcamento) {
     this.orcamento = orcamento;       
}     
private double getOrcamento () { 
     return this.orcamento; 
}
public String verificarPreco () {
    String resposta; 
 if(this.preco <= this.orcamento) {
  resposta = "você pode comprar este livro.";
}else{ 
  resposta = "DINHERIO INSUFICIENTE PARA COMPRA.";
}
 return resposta;
}
}
