public class ConversorMoeda implements ConversaoFinanceira {
    private double valorDolar;
    private double taxaConvercao;

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getTaxaConvercao() {
        return taxaConvercao;
    }

    public void setTaxaConvercao(double taxaConvercao) {
        this.taxaConvercao = taxaConvercao;
    }

    @Override
    public double getconverterDolarParaReal() {
        return getValorDolar() * getTaxaConvercao();
    }
}
