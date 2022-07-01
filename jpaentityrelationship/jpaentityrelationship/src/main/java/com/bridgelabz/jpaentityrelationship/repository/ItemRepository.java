package com.bridgelabz.jpaentityrelationship.repository;

import com.bridgelabz.jpaentityrelationship.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {

}
