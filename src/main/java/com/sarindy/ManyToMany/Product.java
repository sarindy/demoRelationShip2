package com.sarindy.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_name")
	private String name;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ProductPropertyMap> productPropertyMap;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductPropertyMap> getProductPropertyMap() {
		return productPropertyMap;
	}

	public void setProductPropertyMap(List<ProductPropertyMap> productPropertyMap) {
		this.productPropertyMap = productPropertyMap;
	}

	public Product(int id, String name, List<ProductPropertyMap> productPropertyMap) {
		super();
		this.id = id;
		this.name = name;
		this.productPropertyMap = productPropertyMap;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
