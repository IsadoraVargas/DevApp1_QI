/*
Mariazinha tem 1,50m e cresce 2 centímetros 
por ano, enquanto Maricota tem 1,10m e cresce 
3 centímetros por ano. Construir um programa que calcule 
e imprima quantos anos serão necessários para
que Maricota seja maior que Mariazinha.
*/
package laços.de.repetição;

public class Mariazinha {
public static void main(String[] args) 
{
double  mr = 150, mc = 110, anos=0;
while (mr >= mc) 
{
mr = mr + 2;
mc = mc + 3;
anos = anos + 1; 
}
System.out.println("Maricota ficara mais alta em " + anos + " anos");
}
}
