package com.mysite.HR.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.HR.Entity.HR_mem;

public interface HR_memRepository extends JpaRepository<HR_mem, String>{
	Page<HR_mem> findAll(Pageable pageable);
}
