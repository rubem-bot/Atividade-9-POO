package controle;
import java.util.Vector;
public class Programa {
public static void main(String[] args) {
Vector<String> listaNomes = new Vector<String>();
listaNomes.add("Jos�");
listaNomes.add("Maria");
listaNomes.add("Dalira");
listaNomes.add("Ralf");
listaNomes.add("Maria");
listaNomes.add("Gerson");
System.out.println("Tamanho da cole��o: " +

listaNomes.size());

System.out.println("Primeiro nome da cole��o: " +

listaNomes.firstElement());

System.out.println("�ltimo nome da cole��o: " +

listaNomes.lastElement());

System.out.println("Terceiro nome da cole��o: " +

listaNomes.get(2));

System.out.println("Primeira posi��o de Maria: " +

listaNomes.indexOf("Maria"));

System.out.println("�ltima posi��o de Maria: " +
listaNomes.lastIndexOf("Maria"));

if (listaNomes.contains("Gerson"))
System.out.println("Gerson est� na cole��o");
else
System.out.println("Gerson n�o est� na cole��o");
if (listaNomes.contains("Jo�o"))
System.out.println("Jo�o est� na cole��o");
else
System.out.println("Jo�o n�o est� na cole��o");
System.out.println("");
System.out.print(listaNomes);
listaNomes.add("Marco");
System.out.println("");
System.out.print(listaNomes);


listaNomes.add(4, "Augusto");
System.out.println("");
System.out.print(listaNomes);
listaNomes.setElementAt("Severino", 3);
System.out.println("");
System.out.print(listaNomes);
listaNomes.remove("Augusto");
System.out.println("");
System.out.print(listaNomes);
}
}