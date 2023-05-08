package com.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/savestudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student savestudent=studentService.saveStudent(student);
		return ResponseEntity.ok().body(savestudent);
	}
	
	@GetMapping("/getstudentlist")
	public ResponseEntity<List<Student>> getStudentlist(){
	List<Student> studentlist	=studentService.getStudentList();
		return ResponseEntity.ok().body(studentlist);
	}
	
	@GetMapping("/getstudent/{id}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") Integer id){
		Optional<Student> studentbyid= studentService.getStudentById(id);
		return ResponseEntity.ok().body(studentbyid);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudentById(@PathVariable("id") Integer id) {
		
		studentService.deleteStudentById(id);
		
	}
	
	@PutMapping("/updatestudent")
	public ResponseEntity<Student> updateStudentById(@RequestBody Student student){
	Student updatestudent	=studentService.updateStudentData(student);
		return ResponseEntity.ok().body(updatestudent);
	}
 }
