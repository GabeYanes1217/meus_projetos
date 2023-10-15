
public class Venda {
    Carro carro;
    Cliente vendedor;
    Cliente comprador;
    double valor;

    Venda(Carro carro, Cliente vendedor, Cliente comprador, double valor) {
        this.carro = carro;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.valor = valor;
    }
}