package com.learnearn.service;

import java.time.LocalDateTime;
import java.util.List;

import com.learnearn.model.Course;
import com.learnearn.model.PostPriority;
import com.learnearn.model.PostStatus;

public interface ICourseService {

	List<Course> getAll();

	Course addCourse(Course course);

	void updateCourse(Course course);

	void deleteCourse(int courseId);
	
	//
	Course getByCourseId(int courseId);
	List<Course> getByCourseName(String courseName);
	List<Course> getByOwner(String owner);
	List<Course> getByStratDateAndEndDate(LocalDateTime startDate,LocalDateTime endDate);
	List<Course> getByStatus(PostStatus status);
	List<Course> getByPriority(PostPriority priority);
	
	//custom
	List<Course> getByCompanyNameCourseName(String companyName,String courseName);
	List<Course> getByBatchNameCourseName(String batchName,String courseName);
	List<Course> getByCompanyNameCourseStatus(String companyName,PostStatus status);
	List<Course> getByCompanyNameCoursePriority(String companyName,PostPriority priority);
	List<Course> getByBatchNameCourseStatus(String bacthName,PostStatus status);
	List<Course> getByBatchNameCoursePriority(String bacthName,PostPriority priority);



	
	
	
}
