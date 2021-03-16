/*Faça um programa que receba somente nºs positivos e exibe e calcule:
o número digitado
a soma dos números digitados
a quantidade de números digitados
a média dos números digitados
*/
package laços.de.repetição;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class NúmerosPositivos 
{
public static void main (String[] args)
{
Scanner leia = new Scanner(System.in);
ArrayList<Integer> numdg = new ArrayList<>();

System.out.println("Quantos números deseja? ");
int num = 0;
do
{
System.out.println("Digite o número: ");
num = leia.nextInt();
numdg.add(num);    
}
while(num > 0);
int ultnum = numdg.size();
numdg.remove(ultnum -1);
System.out.println("Números digitados: ");

int smnum = 0;
for(int n : numdg)
{
smnum += n;
System.out.println("A soma dos números é  " + smnum);
System.out.println("A quantia de números é  "+ numdg);
}
int mdnum = 0;
mdnum = smnum / numdg.size();
System.out.println("A média dos números é " );
}
}

