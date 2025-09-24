package com.example.mallmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mallmanagement.entity.Emp;
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
	

	
	
	


}
