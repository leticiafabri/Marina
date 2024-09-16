import java.util.List;

class Pedido {
    private int id;
    private List<Prato> pratos;
    private double valorTotal;
    private Restaurante restaurante;
    private Endereco enderecoEntrega;

    public Pedido(int id, Restaurante restaurante, List<Prato> pratos, Endereco enderecoEntrega) {
        this.id = id;
        this.restaurante = restaurante;
        this.pratos = pratos;
        this.enderecoEntrega = enderecoEntrega;
        this.valorTotal = calcularValorTotal();
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }


    public void visualizarDetalhes() {
        System.out.println("Pedido #" + id);
        System.out.println("Restaurante: " + restaurante.getNome());
        System.out.println("Pratos: ");
        for (Prato prato : pratos) {
            prato.visualizarDetalhes();
        }
        System.out.println("Total: R$" + valorTotal);
    }
}
