package com.learnearn.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnearn.model.Course;
import com.learnearn.model.PostPriority;
import com.learnearn.model.PostStatus;
import com.learnearn.service.ICourseService;

@RestController
@RequestMapping("/course-service")
public class CourseController {

	ICourseService courseService;

	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}

	@PostMapping("/courses")
	Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	@PutMapping("/courses")
	void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	void deleteCourse(@PathVariable int courseId) {
		courseService.deleteCourse(courseId);
	}

	@GetMapping("/courses")
	List<Course> getAll() {
		return courseService.getAll();
	}

	@GetMapping("/courses/id/{courseId}")
	Course getByCourseId(@PathVariable int courseId) {
		return courseService.getByCourseId(courseId);
	}

	@GetMapping("/courses/name/{courseName}")
	List<Course> getByCourseName(@PathVariable String courseName) {
		return courseService.getByCourseName(courseName);
	}

	@GetMapping("/courses/owner/{owner}")
	List<Course> getByOwner(@PathVariable String owner) {
		return courseService.getByOwner(owner);
	}

	@GetMapping("/courses/startdate/{startDate}/enddate/{endDate}")
	List<Course> getByStratDateAndEndDate(@PathVariable String startDate,@PathVariable String endDate) {
		return courseService.getByStratDateAndEndDate(LocalDateTime.parse(startDate), LocalDateTime.parse(endDate));
	}

	@GetMapping("/courses/status/{status}")
	List<Course> getByStatus(@PathVariable PostStatus status) {
		return courseService.getByStatus(status);
	}

	@GetMapping("/courses/priority/{priority}")
	List<Course> getByPriority(@PathVariable PostPriority priority) {
		return courseService.getByPriority(priority);
	}

	@GetMapping("/courses/companyname/{companyName}/coursename/{courseName}")
	List<Course> getByCompanyNameCourseName(@PathVariable String companyName,@PathVariable String courseName) {
		return courseService.getByCompanyNameCourseName(companyName, courseName);
	}

	@GetMapping("/courses/batchname/{batchName}/coursename/{courseName}")
	List<Course> getByBatchNameCourseName(@PathVariable String batchName,@PathVariable String courseName) {
		return courseService.getByBatchNameCourseName(batchName, courseName);
	}

	@GetMapping("/courses/companyname/{companyName}/status/{status}")
	List<Course> getByCompanyNameCourseStatus(@PathVariable String companyName,@PathVariable PostStatus status) {
		return courseService.getByCompanyNameCourseStatus(companyName, status);
	}

	@GetMapping("/courses/companyname/{companyName}/priority/{priority}")
	List<Course> getByCompanyNameCoursePriority(@PathVariable String companyName,@PathVariable PostPriority priority) {
		return courseService.getByCompanyNameCoursePriority(companyName, priority);
	}

	@GetMapping("/courses/bacthname/{bacthName}/status/{status}")
	List<Course> getByBatchNameCourseStatus(@PathVariable String bacthName,@PathVariable PostStatus status) {
		return courseService.getByBatchNameCourseStatus(bacthName, status);
	}

	@GetMapping("/courses/bacthname/{bacthName}/priority/{priority}")
	List<Course> getByBatchNameCoursePriority(@PathVariable String bacthName,@PathVariable PostPriority priority) {
		return courseService.getByBatchNameCoursePriority(bacthName, priority);
	}
}
