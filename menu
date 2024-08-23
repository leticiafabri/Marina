//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro=null;
        int opcao = 0;
        int alterar;
        int valor=0;
        int valorRetirado=0;

        while (opcao != 6) {
            System.out.println("MENU");
            System.out.println("1. Cadastro");
            System.out.println("2. Sacar dinheiro");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Verificar saldo");
            System.out.println("5. Alterar dados pessoais");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("Insira os dados para seu cadastro: ");
                    System.out.print("nome: ");
                    String nome = sc.nextLine();
                    System.out.print("email: ");
                    String email = sc.nextLine();
                    String cpf = "";
                    boolean cpfValido = false;
                    while (!cpfValido) {
                        System.out.print("CPF (somente números): ");
                        cpf = sc.nextLine();
                        if (cpf.matches("\\d+")) {
                            cpfValido = true;
                        }
                        else {
                            System.out.println("CPF inválido! Digite apenas números.");
                        }
                    }
                    System.out.print("senha: ");
                    String senha = sc.nextLine();
                    cadastro= new Cadastro(nome, email, cpf, senha);
                    break;

                case 2:
                    boolean valorValido=false;
                    while (!valorValido) {
                        System.out.println("Digite o valor que você deseja sacar: ");
                        valorRetirado = sc.nextInt();

                        if (valor>valorRetirado){
                            valor = valor - valorRetirado;
                            System.out.println("Seu saldo após o saque é: " + valor + " reais");
                            valorValido=true;
                        }
                        else{
                            System.out.println("Seu saldo é insuficiente :(");
                            valorValido=true;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja depositar: ");
                     valor = sc.nextInt();
                    System.out.println("O valor depositado na sua conta é: " + valor + " reais");
                    break;

                case 4:
                    System.out.println("O valor presente na sua conta é: " + valor + " reais");
                    break;

                case 5:
                    alterar=0;
                    while (alterar !=3){
                        System.out.println("1. Alterar email");
                        System.out.println("2. Alterar senha");
                        System.out.println("3. Voltar");
                        System.out.print("Escolha uma opção:");
                        alterar = sc.nextInt();
                        sc.nextLine();

                        switch (alterar) {
                            case 1:
                                System.out.print("Digite o novo email: ");
                                String novoEmail=sc.nextLine();
                                cadastro.setEmail(novoEmail);
                                System.out.println("Email atualizado para: " + novoEmail);
                                break;

                            case 2:
                                System.out.print("Digite a nova senha: ");
                                String novaSenha = sc.nextLine();
                                cadastro.setSenha(novaSenha);
                                System.out.println("Senha atualizada com sucesso para: "+ novaSenha);
                                break;

                            case 3:
                                System.out.println("Saindo...");
                                break;

                            default:
                                System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        }

        sc.close();
    }
}
