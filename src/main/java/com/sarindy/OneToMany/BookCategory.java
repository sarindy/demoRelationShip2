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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book_category")
public class BookCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_category_id")
	private int id;

	@Column(name = "category_name")
	private String categoryName;
	@JsonIgnore
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	// Mean One Category has Many Books
	private List<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", categoryName=" + categoryName + ", books=" + books + "]";
	}

}
