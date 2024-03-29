package com.santhosh.restapi.day4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.restapi.day4.model.StudentModel;
import com.santhosh.restapi.day4.service.StudentService;

@RestController
@RequestMapping("/api/v1/add")
public class StudentController {
	@Autowired
	StudentService sser;
	@PostMapping("/add")
	public StudentModel add(@RequestBody StudentModel s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/show")
	public List<StudentModel> showinfo() {
		return sser.showinfo();
	}
	@PutMapping("/update")
	public StudentModel changeinfo(@RequestBody StudentModel s) {
		return sser.changeinfo(s);
	}
	@DeleteMapping("/delete")
	public void delete() {
		sser.delete();
	}
}
