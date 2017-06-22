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
@Table(name="author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter @Column(name="author_id")
	private int id;
	
	@Getter @Setter @Column(name="author_name")
	private String name;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	@Getter @Setter
	private List<Book> book;

}
