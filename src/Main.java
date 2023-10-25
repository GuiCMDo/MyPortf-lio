import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Conta bancária

        //Variáveis
        Scanner sc = new Scanner(System.in);
        String nome = "Guilherme Dourado";
        String tipoDeConta = "Conta-Corrente";
        double saldo = 5000.00;

        //Inicializar dados do cliente;
        System.out.println("****************************************************");
        System.out.println("Dados Iniciais do cliente");
        System.out.println(nome);
        System.out.println(tipoDeConta);
        System.out.println("R$ " + saldo);
        System.out.println("****************************************************");
        
        //Criação do Menu de opções
        int opcao;

        for (int i = 0;i < 4; i++) {
            System.out.println("                          ");
            System.out.println("Operações: ");
            System.out.println("1 - Consultar saldos ");
            System.out.println("2 - Receber valor ");
            System.out.println("3 - Transferir valor ");
            System.out.println("4 - Sair ");

            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: R$ " + saldo);

            } else if (opcao == 2) {
                System.out.println("Informe o valor que está recebendo: ");
                double credito = sc.nextDouble();
                saldo += credito;
                System.out.println("Saldo atualizado: R$ " + saldo);

            } else if (opcao == 3) {
                System.out.println("Quanto deseja transferir?");
                double transferencia = sc.nextDouble();
                    if (transferencia > saldo) {
                       System.out.println("Saldo insuficiente!");
                    } else {
                       System.out.println("Transferência realizada com sucesso");
                       saldo -= transferencia;
                      System.out.println("Seu saldo é de: R$ " + saldo);
                    }

            } else if (opcao == 4){
                System.out.println("Encerrando aplicação...");
                break;

            } else {
                System.out.println("Opção inválida, informe a opção correta!");
            }
        }
    }
}