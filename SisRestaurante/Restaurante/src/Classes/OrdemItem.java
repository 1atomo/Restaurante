package Classes;

public class OrdemItem {

		private Integer quantidade;
		private double price;
		
		private Produto product;
	
		
		public OrdemItem() {
		}

		

		public OrdemItem(Integer quantidade, double price, Produto product) {
			this.quantidade = quantidade;
			this.price = price;
			this.product = product;
		}



		public Integer getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		
		public Produto getProduct() {
			return product;
		}

		public void setProduct(Produto product) {
			this.product = product;
		}


		public double TotalP() {
			
			return price * quantidade;
		}

		
		public String toString() {
			return getProduct().getName()
					+ ", $"
					+ String.format("%.2f", price)
					+ ", Quantidade: "
					+ quantidade
					+ ", Valor Total : $"
					+ String.format("%.2f", TotalP());
		}
	}