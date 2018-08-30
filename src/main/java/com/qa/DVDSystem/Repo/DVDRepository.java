package com.qa.DVDSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.DVDSystem.Model.DVDModel;

@Repository
public interface DVDRepository extends JpaRepository <DVDModel,Long> {

	
}
