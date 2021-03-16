/*
Um determinado material radioativo perde metade de 
sua massa a cada 50 segundos. Dada a massa inicial, em 
gramas, fazer um programa em Java que calcule o tempo 
necessário para que essa massa se torne menor que 0,5 grama.
O programa deve escrever a massa inicial, a massa final e o
tempo calculado em horas, minutos e segundos.
 */
package laços.de.repetição;
import java.util.*;
public class MasaRadiotiva 
{
public static void main(String[] args)
{
Scanner leia = new Scanner (System.in);
double massI, massF = 0; 
int tmp = 0;

System.out.println("Qual a massa do material? ");
massI = leia.nextDouble();
massF = massI;

while (massF > 0.5)
{
massF /= 2;
tmp += 50;
}  
System.out.println("Massa inicial: " + massI);
System.out.println("Massa final: " + massF );
System.out.println("Tempo necessário: " + FormataSegundos ((int) tmp));
} 
private static String FormataSegundos(int Seg)
{
 int Hora, Minuto, Segundos;    
Hora     = (int)(Seg / (60 * 60));
Minuto   = (int)((Seg - (Hora * 60 * 60)) / 60);
Segundos = (int)(Seg - (Hora * 60 * 60) - (Minuto * 60));
return  String.format("%02d:%02d:%02d", Hora, Minuto, Segundos);
}
}


