package com.udemy.springmvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import com.udemy.springmvc.entity.Course;
import com.udemy.springmvc.entity.QCourse;

@Repository("queryDSLExampleRepo")
public class QueryDSLExampleRepo {

	private QCourse qCourse=QCourse.course;
	
	@PersistenceContext
	private EntityManager em;
	
	public Course find(boolean exist){
		JPAQuery<Course> query=new JPAQuery<Course>(em);
		BooleanBuilder predicateBuilder=new BooleanBuilder(qCourse.description.endsWith("OP"));
		if (exist) {
			Predicate p1=qCourse.id.eq(23);
			predicateBuilder.and(p1);
		} else {
			Predicate p2=qCourse.name.endsWith("OP");
			predicateBuilder.or(p2);
		}
		
		return query.select(qCourse).from(qCourse).where(qCourse.id.eq(23)).fetchOne();
		
	}
}
