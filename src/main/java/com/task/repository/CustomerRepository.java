package com.task.repository;

import org.springframework.data.repository.CrudRepository;
import com.task.entity.Customers;

public interface CustomerRepository extends CrudRepository<Customers, Integer> {
}  