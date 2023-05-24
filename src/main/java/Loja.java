import java.util.ArrayList;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private ArrayList<Produto> estoqueProdutos;

    public Loja() {

    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,
                Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new ArrayList<>(quantidadeProdutos);
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
                Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new ArrayList<>(quantidadeProdutos);
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public double gastosComSalario() {
        return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        char tamanho = ' ';

        if (this.quantidadeFuncionarios < 10) {
            tamanho = 'P';
        } else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
            tamanho = 'M';
        } else if (this.quantidadeFuncionarios > 30) {
            tamanho = 'G';
        }

        return tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
        return "- Loja -" +
                "\nNome: " + nome +
                "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
                "\nSalário Base dos Funcionários: " + salarioBaseFuncionario +
                "\n" + endereco +
                "\nData de Fundação: " + dataFundacao;
    }
}
