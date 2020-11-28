package dominio;
public class Animal implements Comparable<Animal> {
private String nome, raca;
public Animal(String nome, String raca) {
this.nome = nome;
this.raca = raca;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public String getRaca() {
return raca;
}

public void setRaca(String raca) {
this.raca = raca;
}
public int compareTo(Animal animal) {
return this.nome.compareTo(animal.getNome());
}
}