package com.orderManagment.internship.repository;

import com.orderManagment.internship.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT e FROM Order e WHERE e.orderDate = :date")
    List<Order> findByOrderDate(@Param("date") Date date);
}