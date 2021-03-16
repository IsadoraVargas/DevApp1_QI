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
public static void main(String[] args) {
ArrayList<String> itens = new ArrayList<String>();
itens.add("Espinafre");
itens.add("Gás");
itens.add("Banana");
itens.add("Cebola");
itens.add("Farinha");
itens.add("Água");
itens.add("Desodorante");

System.out.println("Lista de compras: " +itens);
System.out.println("_________________________________________________");
System.out.println("Consultado itens da lista. Item 3: " + itens.get(4));
System.out.println("_________________________________________________");
System.out.println("Mudando item da lista de compras: ");
itens.set(4, "Feijão" + itens);
System.out.println("_________________________________________________");
System.out.println("Revendo a lista: " + itens);
System.out.println("_________________________________________________");
System.out.println("Removendo a lista: " + itens.remove(6));
System.out.println("_________________________________________________");
System.out.println("Analizando tamanho da lista: " + itens.size() + " itens na lista.");
System.out.println("_________________________________________________");
System.out.println("Analizando em ordem alfabética:" + "\n" +  "Água, Banana, Cebola, Desodorante, Espinafre, Feijão" );
System.out.println("_________________________________________________");
System.out.println("Limpando a lista de compras..."); 
itens.clear();
System.out.println(itens);
}
}