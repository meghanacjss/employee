package com.example.SpringBoot_DB.Repository;

import com.example.SpringBoot_DB.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Employee,Integer> {

}
