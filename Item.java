public class Item{

private String nome;
private double preco;

//construtor da classe Item
public Item(String nome, double preco){

    this.nome =nome;
    this.preco = preco;
}

//metodo para obter o nome do item
public String getNome(){

return nome;
}
public double getPreco(){

    return preco;
 }
@Override
public String toString()
{
    return nome + " : $ " + preco;

}}