package com.samco.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samco.repository.StudentRepository;
import com.samco.student.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/addStudent")
	public Student addStud(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudent(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/getStudent/{id}")
	public Optional<Student> getByStudent(@PathVariable("id") int id){
		return studentRepository.findById(id);
	}
	
	@DeleteMapping("/delete")
	public void deleteAll(@PathVariable Student student) {
		studentRepository.delete(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		studentRepository.deleteById(id);
	}
}
