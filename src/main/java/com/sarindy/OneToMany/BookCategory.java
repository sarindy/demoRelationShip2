package com.sarindy.OneToMany;

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
@Table(name = "book_category")
public class BookCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_category_id")
	private int id;

	@Column(name = "category_name")
	private String categoryName;

	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	// Mean One Category has Many Books
	private List<Book> books;

}
