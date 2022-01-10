package fr.univamu.iut.exo3_1;

public class Velo {
	private int numero;
	private double prix;
	private String description; // attribut optionnel
	private Batterie batterie; // attribut optionnel
	
	public Velo(Builder builder) {
		numero = builder.numero;
		prix = builder.prix;
		description = builder.description;
		batterie = builder.batterie;
	}
	
	public static class Builder {
		private int numero;
		private double prix;
		private String description; // attribut optionnel
		private Batterie batterie; // attribut optionnel
		
		public Builder(int nr, double price) {
			numero = nr;
			prix = price;
		}
		
		public Builder setDescription(String description) {
			this.description = description; return this;
		}
		
		public Builder setBatterie(Batterie batterie) {
			this.batterie = batterie; return this;
		}
		
		public Velo build() {
			return new Velo(this);
		}
	}
}
