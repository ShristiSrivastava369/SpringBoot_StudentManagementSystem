package com.codSoft;

import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Integer> {
	public Student findById(int id);
}
