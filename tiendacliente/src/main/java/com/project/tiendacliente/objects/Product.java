package com.project.tiendacliente.objects;

public class Product {
    
    private int id;
	private String tittle;
	private String description;
	private double price;
	private String imageLink;

    public int getId() {
		return id;
	}
	public String getTittle() {
		return tittle;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public String getimageLink() {
		return imageLink;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setimageLink(String imageLink) {
		this.imageLink = imageLink;

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", tittle=" + tittle + ", price=" + price + "]";
	}

}
