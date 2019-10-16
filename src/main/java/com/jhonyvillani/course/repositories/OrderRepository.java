package com.jhonyvillani.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhonyvillani.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
