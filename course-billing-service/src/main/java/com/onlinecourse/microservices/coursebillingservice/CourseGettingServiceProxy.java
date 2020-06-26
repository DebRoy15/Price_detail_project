package com.onlinecourse.microservices.coursebillingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "course-getting-service", url = "localhost:8000")
public interface CourseGettingServiceProxy {

	@GetMapping("/getting-course-details/{courseId}")
	public BillingCourseBean retrieveCourseValues(@PathVariable("courseId") long courseId);

}
