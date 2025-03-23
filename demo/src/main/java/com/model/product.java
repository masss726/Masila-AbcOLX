package com.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "products")
public class product {

    public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private String description;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;  //store image as byte array

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }
	public product(Long id, String name, String category, Double price, String description, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.description = description;
		this.image = image;
	}
    
    
}
