import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Matheus Henrique";
        String tipoConta = "Corrente";
        Double saldo = 1500.10;
        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************");

        String menu = """
                
                ** Digite sua opção **
                
                1 - Consultar saldo
                2 - Fazer Pix
                3 - Receber valor
                4 - Sair
                
                ***************************
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("***************************");
                    System.out.println("O saldo da sua conta é: R$" + saldo);
                    System.out.println("***************************");
                    break;
                case 2:
                    System.out.println("** Qual o valor que deseja transferir? **");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("***************************");
                        System.out.println("** Não há saldo disponivel para realizar a transferência! **");
                        System.out.println("***************************");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("***************************");
                        System.out.println("Novo Saldo: " + saldo);
                        System.out.println("***************************");
                    }
                    break;
                case 3:
                    System.out.println("Qual valor deseja receber?");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("***************************");
                    System.out.println("Novo Saldo: " + saldo);
                    System.out.println("***************************");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("***************************");
                    System.out.println("Opção inválida!");
                    System.out.println("***************************");
                    break;
            }
        }
    }
}
