package com.sarindy.OneToMany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Book, Integer> {

}
