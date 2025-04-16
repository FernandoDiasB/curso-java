import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
    
    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for (Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        itemList.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItens = item.getPreco() * item.getQuantidade();
                valorTotal += valorItens;
            }
        }
        return valorTotal;

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(" ");
        carrinhoDeCompras.adicionarItem("Arroz", 25.90, 8);
        carrinhoDeCompras.adicionarItem("feijão", 5.90, 8);
        carrinhoDeCompras.adicionarItem("alface", 2.70, 8);
        carrinhoDeCompras.adicionarItem("tomate", 8.50, 8);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("arroz");
        System.out.println(" ");
        carrinhoDeCompras.exibirItens();
        System.out.println(" ");
        System.out.println("");
        System.out.printf("O valor da sua compra é: R$ %.2f\n", carrinhoDeCompras.calcularValorTotal());
    }
}

