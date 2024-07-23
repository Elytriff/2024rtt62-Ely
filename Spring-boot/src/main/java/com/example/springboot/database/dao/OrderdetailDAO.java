package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Orderdetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderdetailDAO extends JpaRepository<Orderdetail, Long> {
}