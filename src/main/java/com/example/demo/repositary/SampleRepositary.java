package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SampleEntity;

public interface SampleRepositary extends JpaRepository<SampleEntity, Integer>
{
	
}