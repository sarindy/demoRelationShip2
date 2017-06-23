package com.sarindy.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
	
	@Autowired
	private Repo repo;
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addProduct(@RequestBody ProductPropertyMap product) {
		repo.save(product);

	}

	/*@RequestMapping(value = "/getAllBook", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = new ArrayList<>();
		bookRepo.findAll().forEach(books::add);
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}*/

}
