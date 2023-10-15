
public class TesteSistema {
	public static void main(String[] args) {
        Fabricante fabricante = new Fabricante("Fabricante A");
        Cliente cliente = new Cliente("João", "123.456.789-00");
        Carro carro = new Carro("Modelo X", 2023, fabricante);
        Venda venda = new Venda(carro, cliente, null, 50000);

        System.out.println("Carro: " + carro.modelo);
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Valor da Venda: " + venda.valor);
    }
}
