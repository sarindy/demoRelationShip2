package com.sarindy.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "property_id")
	private int id;

	@Column(name = "property_name")
	private String name;

	@OneToMany(mappedBy = "property")
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

	public Property(int id, String name, List<ProductPropertyMap> productPropertyMap) {
		super();
		this.id = id;
		this.name = name;
		this.productPropertyMap = productPropertyMap;
	}

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

}
