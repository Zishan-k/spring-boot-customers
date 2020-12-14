package com.cust.repository;

import com.entity.ShopifyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ShopifyRepository extends JpaRepository<ShopifyEntity, String> {

    Optional<ShopifyEntity> findAllById(String id);
}