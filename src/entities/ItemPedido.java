package entities;

public class ItemPedido {

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	private Integer quant;
	private double preco;

	private Produto produto;

	public ItemPedido(Integer quant, double preco, Produto produto) {
		this.quant = quant;
		this.preco = preco;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double subTotal() {
		return preco * quant;
	}

	public String toString() {
		return produto.getNomeProduto() + ", $" + String.format("%.2f", preco) + ", Quantidade: " + quant
				+ ", Subtotal: $" + String.format("%.2f", subTotal());

	}
}
