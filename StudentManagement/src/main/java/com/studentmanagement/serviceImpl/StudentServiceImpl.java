package com.studentmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.model.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		Student savestudent=studentRepository.save(student);
		return savestudent;
	}

	@Override
	public List<Student> getStudentList() {
		List<Student> studentlist= studentRepository.findAll();
		return studentlist;
	}

	@Override
	public Optional<Student> getStudentById(Integer id) {
		Optional<Student> student= studentRepository.findById(id); 
		return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudentData(Student student) {
    Student	 updatestudent	=studentRepository.save(student);
		return updatestudent;
	}

}
