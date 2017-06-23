package com.sarindy.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int id;

	
	@Column(name = "book_name")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)// Mean Many Book with One Book Category
	@JoinColumn(name = "book_category_id")// Create field book_category_id in this table which the foreign key from
	// Book_category Table
	private BookCategory bookCategory;

	/*
	 * @OneToMany and @ManyToOne defines a one-to-many and many-to-one
	 * relationship between 2 entities. @JoinColumn indicates the entity is the
	 * owner of the relationship: the corresponding table has a column with a
	 * foreign key to the referenced table. mappedBy indicates the entity is the
	 * inverse of the relationship.
	 */

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	private Author author;

}
