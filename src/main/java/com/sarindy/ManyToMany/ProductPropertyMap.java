package com.sarindy.ManyToMany;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "product_property_map")
public class ProductPropertyMap implements Serializable {

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	@Getter
	@Setter
	private Product product;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "property_id")
	@Getter
	@Setter
	private Property property;

	@Column(name = "modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	@Getter
	@Setter
	private Date modifiedDate;

}
