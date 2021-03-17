/*
Criar um programa em Java que consiste em uma lista de compras:
- Adicionar itens na lista de compras;
- Consultar itens pelo seu índice;
- Alterar itens da Lista de compras;
- Exibir o tamanho da lista de compras;
- Remover itens da lista de compras;
- Classificar em ordem alfabética  
- Limpar a lista de compras
Obs: Criar uma interface que exibe o que está acontecendo com o programa
 */
package laços.de.repetição;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaDeCompras {
public static void main(String[] args) 
{
Scanner leia = new Scanner(System.in);
ArrayList<String> ListaCompras = new ArrayList<>();
String itens;
String texto;

System.out.println("Adicione itens na sua lista de compras: ");
itens = leia.nextLine();
ListaCompras.add(itens);
System.out.println(itens + " adicionado com sucesso !");

System.out.println("Lista de compras: " +itens);
System.out.println("_________________________________________________");
System.out.println("Consultado itens da lista. Item 3: " + ListaCompras.get(4));
System.out.println("_________________________________________________");
System.out.println("Mudando item da lista de compras: ");
ListaCompras.set(4, itens + itens);
System.out.println("_________________________________________________");
System.out.println("Revendo a lista: " + itens);
System.out.println("_________________________________________________");
System.out.println("Removendo a lista: " + ListaCompras.remove(6));
System.out.println("_________________________________________________");
System.out.println("Analizando tamanho da lista: " + ListaCompras.size() + " itens na lista.");
System.out.println("_________________________________________________");
System.out.println("Analizando em ordem alfabética:" + "\n" +  ListaCompras.sort());
System.out.println("_________________________________________________");
System.out.println("Limpando a lista de compras..."); 
ListaCompras.clear();
System.out.println(itens);
}
}