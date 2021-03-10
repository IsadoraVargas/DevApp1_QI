
package exercicio03;
import java.util.Scanner; 
public class Exercicio3{
    public String nome ;
    
public static void main(String[] args) {
Scanner ler = new Scanner (System.in); 
    Pessoa p1 = new Pessoa () ; 
System.out.println("Insira seu nome: ");
p1.nome = (ler.nextLine());

System.out.println("Digite sua idade: ");
p1.setIdade(ler.nextInt());
System.out.println("Digite sua renda: ");
p1.setRenda(ler.nextDouble()); 

System.out.println("Resultado dos seus dados: ");
System.out.println("Nome: " + p1.nome);
System.out.println("Idade: " + p1.getIdade()) ;
System.out.println("Renda: " + p1.getRenda()) ;
}       
}
 