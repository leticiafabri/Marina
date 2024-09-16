import java.util.ArrayList;
import java.util.List;
class Usuario extends Pessoa {
    private String senha;
    protected Endereco endereco;
    private List<Pedido> historicoPedidos;

    public Usuario(String nome, String email, String senha, Endereco endereco) {
        super(nome, email);
        this.senha = senha;
        this.endereco = endereco;
        this.historicoPedidos = new ArrayList<>();
    }

    public void alterarEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void fazerPedido(Pedido pedido) {
        historicoPedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso!");
    }

    public void visualizarHistoricoPedidos() {
        if (historicoPedidos.isEmpty()) {
            System.out.println("Você não tem pedidos realizados.");
        } else {
            System.out.println("Histórico de Pedidos:");
            for (Pedido p : historicoPedidos) {
                p.visualizarDetalhes();
            }
        }
    }
}