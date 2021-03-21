package estudodirigido;

public class Prod
{
 public int cod;   
 public String desc;
 public float preco;
 public int quant;
 
 public void setDesc (String desc)
 {
     this.desc = desc;
 }
 public String getDesc()
 {
     return this.desc;
 }
 public void setPreco (float preco) 
 {
     this.preco = preco;
 }
 public float getpreco()
 {
     return this.preco;
 }
  public void setQuant (int quant)
  {
     this.quant = quant;
 }
 public int getQuant()
 {     
  return this.quant;
 }
 public void setCod (int cod)
 {
 this.cod = cod;
 }
 public int getCod ()
 {
  return this.cod;
 }
 public String verDesc ()
 {
  String resposta;
  if(quant < 4)
  {
  resposta = "Itens recebem o desconto de 15%:   " + preco / 0.15;
}else
  { 
  resposta = "Itens não recebem desconto";
}
  return resposta;
}
}
