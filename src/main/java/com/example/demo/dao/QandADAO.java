package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.QandA;

@Repository
public interface QandADAO extends JpaRepository<QandA, Integer> {

}
