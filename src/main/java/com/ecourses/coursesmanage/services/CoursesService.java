package com.ecourses.coursesmanage.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecourses.coursesmanage.entities.Courses;

@Repository
public interface CoursesService extends JpaRepository<Courses, Integer>{
	
	public Courses findById(int id);
}
