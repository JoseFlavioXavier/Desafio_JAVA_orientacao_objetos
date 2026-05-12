public class Main {
    public static void main(String[] args) {
        ConversorMoeda dolar = new ConversorMoeda();
        dolar.setValorDolar(20.00);
        dolar.setTaxaConvercao(4.91);

        double resultado = dolar.getconverterDolarParaReal();

       System.out.printf("O resultado em dolar é %.2f%n", resultado);


    }
}
