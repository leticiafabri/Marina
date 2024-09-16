import java.util.ArrayList;
import java.util.List;

class Restaurante {
    private String nome;
    private Endereco endereco;
    private List<Prato> pratosDisponiveis;

    public Restaurante(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pratosDisponiveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPrato(Prato prato) {
        pratosDisponiveis.add(prato);
    }

    public List<Prato> getPratosDisponiveis() {
        return pratosDisponiveis;
    }

    public void visualizarPratos() {
        System.out.println("Pratos disponíveis em " + nome + ":");
        for (Prato prato : pratosDisponiveis) {
            prato.visualizarDetalhes();
        }
    }
    public void mostrarMenuDePratos() {
        System.out.println("\n--- Menu de Pratos ---");
        for (int i = 0; i < pratosDisponiveis.size(); i++) {
            Prato prato = pratosDisponiveis.get(i);
            System.out.println((i + 1) + ". " + prato.getNome() + " - R$" + prato.getPreco());
        }
    }

}