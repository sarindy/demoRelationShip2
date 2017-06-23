package com.sarindy.ManyToMany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<ProductPropertyMap, Integer> {

}
