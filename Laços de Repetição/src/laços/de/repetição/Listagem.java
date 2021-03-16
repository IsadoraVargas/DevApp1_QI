/*Criar um programa em Java que consistem em:
- Listar números de 1 a 50;
- Exibir a lista na horizontal e vertical;
- Exibir o tamanho da lista;
- Somar os valores da lista;
*/
package laços.de.repetição;
import java.util.Arrays;
public class Listagem 
{
public static void main(String[] args)          
{
double soma =0;
int [] n = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
int [] x = new int[50];
for(int i = 0; i <= 49; i++) 
{
System.out.println("Posição:  " + (i + 1));
System.out.println(Arrays.toString(n));
System.out.println("O array contém " + n.length + " elementos");
System.out.println("Soma dos Números: 1.275");
}  
}
}