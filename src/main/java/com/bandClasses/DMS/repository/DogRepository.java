package com.bandClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandClasses.DMS.Models.Dog;

/**
 * @author ${S550520 Lokeshreddy Donthireddy}
 *
 * 
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog>findByName(String name);

}
