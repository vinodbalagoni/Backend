package com.vinod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmpController {
	
	@Autowired
	private EmpRepository empRepository;
	
	
	@PostMapping("/employees")
	// create Employee rest api
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return empRepository.save(employee);
		
	}
	 
		@GetMapping("/employees/{emailId}")
		public ResponseEntity<Employee> getEmpByemailId(@PathVariable("emailId") String emailId)
		{
			Employee employee=empRepository.findByemailId(emailId);
			System.out.println(employee.getEid());
			System.out.println(employee.getEmailId());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			
					 
			return ResponseEntity.ok(employee);
			
		}
		

}
