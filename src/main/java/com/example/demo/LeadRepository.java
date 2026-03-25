package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository gives save(), findAll(), findById(), and delete()
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
