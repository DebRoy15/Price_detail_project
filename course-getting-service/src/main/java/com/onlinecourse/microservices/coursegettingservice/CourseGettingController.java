package com.onlinecourse.microservices.coursegettingservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseGettingController {
	
	@Autowired
	private CoursesDetailsRepository courseRepo;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello World";
	}
	
	
	@GetMapping("/getting-course-details/{courseId}")
	public CoursesBean getCourseById(@PathVariable long courseId) {
		CoursesBean coursesbean = courseRepo.findByCourseId(courseId);
		return coursesbean;
	}
	


}
