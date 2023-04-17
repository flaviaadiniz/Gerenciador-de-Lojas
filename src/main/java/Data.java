public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if ((mes > 0 && mes <= 12) && (dia > 0 && dia <= 31)) {

            if (mes == 2 && dia == 29) {
                if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0)) {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                } else {
                    System.out.println("Erro!");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2020;
                }
            }

            if ((dia == 31) && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }

        } else {
            System.out.println("Erro!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2020;
        }

    }

    public boolean verificaBissexto() {
        if (this.ano % 4 == 0 && (this.ano % 400 == 0 || this.ano % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  dia +
                "/" + mes +
                "/" + ano;
    }
}
