package com.udemy.springmvc.converter;

import org.springframework.stereotype.Component;

import com.udemy.springmvc.entity.Course;
import com.udemy.springmvc.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {

	
	//Entity--->Model
	
	public CourseModel entityToModel(Course course){
		CourseModel courseModel=new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setHours(course.getHours());
		courseModel.setPrice(course.getPrice());
		return courseModel;
	}
	//Model--->entity
	
	public Course modelToEntity(CourseModel courseModel){
		Course course =new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setHours(courseModel.getHours());
		course.setPrice(courseModel.getPrice());
		return course;
	}
}
