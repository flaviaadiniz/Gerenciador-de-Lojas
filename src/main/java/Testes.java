public class Testes {

    public static void main(String[] args) {

        Data data1 = new Data(10, 10, 1953);
        Data data2 = new Data(29, 2, 2016);
        Data data3 = new Data(32, 8, 1998);
        Data data4 = new Data(10, 13, 2000);

        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Data 3: " + data3);
        System.out.println("Data 4: " + data4);

        Data data = new Data(31, 2, 2023);
        System.out.println(data);

        Produto produto = new Produto("Carne", 70.0, new Data(25, 5, 2023));

        System.out.println(produto.estaVencido(new Data(22, 2, 2024)));

        Endereco endereco = new Endereco(
                "Paissandu",
                "Porto Alegre",
                "RS",
                "Brasil",
                "90660-360",
                "361",
                "casa"
        );

        System.out.println(endereco);

    }

}
