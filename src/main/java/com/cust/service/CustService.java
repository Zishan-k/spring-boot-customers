package com.cust.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.exec.Customers;
import com.cust.repository.CustRepository;

@Service
public class CustService {

    final CustRepository custrepository;

    public CustService(CustRepository custrepository) {
        this.custrepository = custrepository;
    }


    public List<Customers> getAllCustomers() {
        List<Customers> customers = new ArrayList<>();
        custrepository.findAll().forEach(cust1 -> customers.add(cust1));
        return customers;
    }

    public Customers getCustomerById(int custId) {
        return custrepository.findById(custId).get();
    }

    public void saveOrUpdate(Customers customers) {
        custrepository.save(customers);
    }

    public void delete(int custId) {
        custrepository.deleteById(custId);
    }

    public void update(Customers customers, int custId) {
        custrepository.save(customers);
    }

}
