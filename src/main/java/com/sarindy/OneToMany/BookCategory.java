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

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Entity
@Table(name="book_category")
public class BookCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter @Column(name="book_category_id")
	private int id;

	@Getter @Setter @Column(name = "category_name")
	private String categoryName;

	@Getter @Setter
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	//Mean One Category has Many Books
	private List<Book> books;

}
