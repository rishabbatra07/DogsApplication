package com.pro.dap.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pro.dap.entities.Dogs;

public interface DogsRepository extends CrudRepository<Dogs,Long>{
	@Override
	List<Dogs> findAll();
}
