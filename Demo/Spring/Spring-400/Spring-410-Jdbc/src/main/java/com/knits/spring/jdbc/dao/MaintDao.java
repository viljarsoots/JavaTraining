package com.knits.spring.jdbc.dao;

import com.knits.spring.common.model.CD;

import java.util.List;

public interface MaintDao {


	public CD findById(Long id);

	public List<CD> findByTitle(String title);

	public Long save(CD newCd);

	public void update(CD updatedCd);

	public void delete(CD updatedCd);
	
}
