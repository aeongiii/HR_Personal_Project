package com.mysite.HR.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.HR.DataNotFoundException;
import com.mysite.HR.Entity.HR_mem;
import com.mysite.HR.Repository.HR_memRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor 	// 이 애너테이션에 의해 memRepository가 생성자 방식으로 주입됨
@Service
public class MemService {
	
	private final HR_memRepository memRepository;
	
	public List<HR_mem> getList() {
		return this.memRepository.findAll();
	}
	
	public HR_mem getHR_mem(String EmployeeID) {
		Optional<HR_mem> mem1 = this.memRepository.findById(EmployeeID);
		if (mem1.isPresent()) {
			return mem1.get();
		} else {
			throw new DataNotFoundException("member not found");
		}
	}
}
