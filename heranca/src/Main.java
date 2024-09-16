import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Usuário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Entrada de dados do endereço
        System.out.println("Cadastro de Endereço:");
        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        Endereco enderecoUsuario = new Endereco(rua, numero, bairro, cidade, cep);
        Usuario usuario = new Usuario(nome, email, senha, enderecoUsuario);


        // teste
        Endereco enderecoRestaurante = new Endereco("Rua Feliz", "123", "Centro", "Curitiba", "12345-000");
        Restaurante restaurante = new Restaurante("Pizzaria Receira Italiana", enderecoRestaurante);
        restaurante.adicionarPrato(new Prato("Pizza de Calabresa", 35.00));
        restaurante.adicionarPrato(new Prato("Pizza de Queijo", 30.00));

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n--- Menu iFood ---");
            System.out.println("1. Fazer Pedido");
            System.out.println("2. Visualizar Histórico de Pedidos");
            System.out.println("3. Visualizar Pratos do Restaurante");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha os pratos para o pedido:");
                    restaurante.mostrarMenuDePratos();
                    List<Prato> pratosEscolhidos = new ArrayList<>();
                    boolean continuarPedido=true;

                    while(continuarPedido){
                        System.out.print("Digite o numero do prato que deseja adicionar ao pedido (ou 0 se não quiser adicionar mais nada): ");
                        int pratoIndex=scanner.nextInt();
                        scanner.nextLine();
                        if (pratoIndex==0){
                            continuarPedido=false;
                        }
                        else if(pratoIndex>0 && pratoIndex<=restaurante.getPratosDisponiveis().size()){
                            pratosEscolhidos.add(restaurante.getPratosDisponiveis().get(pratoIndex-1));
                        }
                        else{
                            System.out.println("numero invalido!");
                        }
                    }
                    if (!pratosEscolhidos.isEmpty()){
                        Pedido pedido=new Pedido(1, restaurante, pratosEscolhidos, usuario.endereco);
                        usuario.fazerPedido(pedido);
                        System.out.println("pedido realizado com sucesso!");
                    }
                    else {
                        System.out.println("nenhum prato foi escolhido :(");
                    }
                    break;


                case 2:
                    usuario.visualizarHistoricoPedidos();
                    break;


                case 3:
                    restaurante.visualizarPratos();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    opcao = 5;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
