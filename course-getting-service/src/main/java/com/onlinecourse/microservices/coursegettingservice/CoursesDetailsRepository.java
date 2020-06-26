package com.onlinecourse.microservices.coursegettingservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoursesDetailsRepository extends JpaRepository<CoursesBean, Long>  {

	
	CoursesBean findByCourseId(long courseId);
	

}
