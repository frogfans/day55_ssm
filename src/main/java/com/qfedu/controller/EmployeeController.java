package com.qfedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qfedu.entity.Employee;
import com.qfedu.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/list.do")
	public String list(Model model){
		
		List<Employee> list = empService.findAllEmp();
		model.addAttribute("empList", list);
		
		return "list";
	}
	
	@RequestMapping("/add.do")
	public String add(Employee emp){
		empService.addEmp(emp);
		
		return "redirect:/list.do";
	}
	@RequestMapping("/delete.do")
	public String deleteById(int id){
		empService.deleteEmpById(id);
		return "redirect:/list.do";
	}
	@RequestMapping("/query.do")
	public String findById(int id, Model model){
		Employee emp = empService.findEmpById(id);
		model.addAttribute("emp", emp);
		return "update";
	}
	
	@RequestMapping("/update.do")
	public String update(Employee emp){
		empService.udpateEmp(emp);
		return "redirect:/list.do";
	}

}







