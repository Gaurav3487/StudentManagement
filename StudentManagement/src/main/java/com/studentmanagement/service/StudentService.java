package com.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.studentmanagement.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getStudentList();
	
	public Optional<Student> getStudentById(Integer id);
	
	public void deleteStudentById(Integer id);
	
	public Student updateStudentData(Student student);

}
