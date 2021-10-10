package com.learnearn.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnearn.model.Course;
import com.learnearn.model.PostPriority;
import com.learnearn.model.PostStatus;
import com.learnearn.repository.ICourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {

	ICourseRepository courseRepository;

	@Autowired
	public void setCourseRepository(ICourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAll() {
		return courseRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {

		return courseRepository.save(course);
	}

	@Override
	public void updateCourse(Course course) {
		courseRepository.save(course);

	}

	@Override
	public void deleteCourse(int courseId) {
		courseRepository.deleteById(courseId);
	}

	@Override
	public Course getByCourseId(int courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public List<Course> getByCourseName(String courseName) {
		return courseRepository.findByCourseName(courseName);
	}

	@Override
	public List<Course> getByOwner(String owner) {
		return courseRepository.findByOwner(owner);
	}

	@Override
	public List<Course> getByStratDateAndEndDate(LocalDateTime startDate, LocalDateTime endDate) {
		return courseRepository.findByStartDateAndEndDate(startDate, endDate);
	}

	@Override
	public List<Course> getByStatus(PostStatus status) {
		return courseRepository.findByStatus(status);
	}

	@Override
	public List<Course> getByPriority(PostPriority priority) {
		return courseRepository.findByPriority(priority);
	}

	@Override
	public List<Course> getByCompanyNameCourseName(String companyName, String courseName) {
		return courseRepository.findByCompanyNameCourseName(companyName, courseName);
	}

	@Override
	public List<Course> getByBatchNameCourseName(String batchName, String courseName) {
		return courseRepository.findByBatchNameCourseName(batchName, courseName);
	}

	@Override
	public List<Course> getByCompanyNameCourseStatus(String companyName, PostStatus status) {
		return courseRepository.findByCompanyNameCourseStatus(companyName, status);
	}

	@Override
	public List<Course> getByCompanyNameCoursePriority(String companyName, PostPriority priority) {
		return courseRepository.findByCompanyNameCoursePriority(companyName, priority);
	}

	@Override
	public List<Course> getByBatchNameCourseStatus(String bacthName, PostStatus status) {
		return courseRepository.findByBatchNameCourseStatus(bacthName, status);
	}

	@Override
	public List<Course> getByBatchNameCoursePriority(String bacthName, PostPriority priority) {
		return courseRepository.findByBatchNameCoursePriority(bacthName, priority);
	}

}
