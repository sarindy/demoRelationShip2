package com.sarindy.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerService {

	@Autowired
	private Repo bookRepo;

	@RequestMapping(value = "/addBook", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addBook(@RequestBody Book book) {
		bookRepo.save(book);

	}

	@RequestMapping(value = "/getAllBook", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = new ArrayList<>();
		bookRepo.findAll().forEach(books::add);
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}

}
