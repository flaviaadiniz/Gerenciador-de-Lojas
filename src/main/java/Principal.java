import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        Loja loja = null;
        Produto produto = null;

        do {
            System.out.println("----- MENU -----");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" ");

            switch (opcao) {
                case 1:
                    System.out.println("CADASTRO DE LOJA");
                    System.out.print("Nome da loja: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Salário base dos funcionários: ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Quantidade de produtos: ");
                    int quantidadeProdutos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Vamos cadastrar o endereço da loja:");
                    System.out.print("Nome da rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();
                    System.out.print("Complemento: ");
                    String complemento = scanner.nextLine();
                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    System.out.println("\nComplete as informações da data de fundação da loja usando apenas números:");
                    System.out.print("Dia: ");
                    int diaLoja = scanner.nextInt();
                    System.out.print("Mês: ");
                    int mesLoja = scanner.nextInt();
                    System.out.print("Ano: ");
                    int anoLoja = scanner.nextInt();
                    Data dataLoja = new Data(diaLoja, mesLoja, anoLoja);

                    loja = new Loja(nome, quantidadeFuncionarios, salarioBase, endereco, dataLoja, quantidadeProdutos);

                    System.out.println("Loja criada com sucesso!\n");
                    break;

                case 2:
                    System.out.println("CADASTRO DE PRODUTO");
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Data de validade: ");
                    System.out.print("Dia: ");
                    int diaProduto = scanner.nextInt();
                    System.out.print("Mês: ");
                    int mesProduto = scanner.nextInt();
                    System.out.print("Ano: ");
                    int anoProduto = scanner.nextInt();
                    Data dataValidade = new Data(diaProduto, mesProduto, anoProduto);
                    produto = new Produto(nomeProduto, preco, dataValidade);
                    System.out.println("Produto cadastrado com sucesso!\n");
                    break;

                case 3:
                    System.out.println("Encerrando o sistema de cadastro...\n");
                    break;

                default:
                    System.out.println("Opção Inválida! Escolha novamente.\n");
                    break;
            }

        } while (opcao != 3);

        if (loja != null && produto != null) {
            boolean vencido = produto.estaVencido(new Data(20, 10, 2023));

            if (vencido) {
                System.out.println("PRODUTO VENCIDO!");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO!");
            }

            System.out.println(loja);

        } else {
            System.out.println("Nenhuma loja ou produtos foram cadastrados.");
        }

        scanner.close();
    }
}
