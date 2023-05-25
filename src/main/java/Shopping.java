import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        boolean result = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                result = true;
                break;
            } else {
                result = false;
                System.out.println("Não há mais espaços disponíveis para criar a loja!");
            }
        }
        return result;
    }

    public boolean removeLoja(String nome) {
        boolean result = false;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int numeroLojas = 0;
        int alimentacao = 0;
        int bijuteria = 0;
        int cosmetico = 0;
        int informatica = 0;
        int vestuario = 0;

        switch (tipoLoja.toLowerCase()) {
            case "alimentação":
                for (Loja loja : lojas) {
                    if (loja instanceof Alimentacao) {
                        alimentacao++;
                        numeroLojas = alimentacao;
                    }
                }
                break;
            case "bijuteria":
                for (Loja loja : lojas) {
                    if (loja instanceof Bijuteria) {
                        bijuteria++;
                        numeroLojas = bijuteria;
                    }
                }
                break;
            case "cosmético":
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico) {
                        cosmetico++;
                        numeroLojas = cosmetico;
                    }
                }
                break;
            case "informática":
                for (Loja loja : lojas) {
                    if (loja instanceof Informatica) {
                        informatica++;
                        numeroLojas = informatica;
                    }
                }
                break;
            case "vestuário":
                for (Loja loja : lojas) {
                    if (loja instanceof Vestuario) {
                        vestuario++;
                        numeroLojas = vestuario;
                    }
                }
                break;
            default:
                System.out.println("Não há lojas desse tipo!");
        }

        return numeroLojas;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = new Informatica();
        double seguroMaisCaro = 0;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                double valorSeguro = ((Informatica) lojas[i]).getSeguroEletronicos();
                if (valorSeguro > seguroMaisCaro) {
                    seguroMaisCaro = valorSeguro;
                    lojaSeguroMaisCaro = (Informatica) lojas[i];
                }
            }
        }

        return lojaSeguroMaisCaro;
    }


    @Override
    public String toString() {
        return "- Shopping -" +
                "\nNome: " + nome +
                "\nEndereço: " + endereco +
                "\nLojas: " + Arrays.toString(lojas);

    }

}
