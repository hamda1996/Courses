package com.ecourses.coursesmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecourses.coursesmanage.entities.Courses;
import com.ecourses.coursesmanage.services.CoursesService;

@RestController
public class CoursesController {
	
	// Get courses
	
	@Autowired
	private CoursesService courseService;
	
	@GetMapping("/Cours")
	public List<Courses>getCourse(){
		
		return courseService.findAll();
	}
	
	@GetMapping ("/Cours/{id}")
	public Courses getCourseId (@PathVariable int id) {
		return courseService.findById(id);
	}
	@PostMapping("/Cours")
	public Courses AjouterCours(@RequestBody Courses course) {
		return courseService.save(course);
	}
	
	@PutMapping("/Cours")
	public Courses UpdateCours (@RequestBody Courses course) {
		return courseService.save(course);
	}
	
	@DeleteMapping ("/Cours/{id}")
	public void SupprimerCours (@PathVariable int id) {
		courseService.deleteById(id);
	}
	 
}
