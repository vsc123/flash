package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	

	
//@GetMapping("alien")

/**@GetMapping("student")
public String getStudent(ModelMap map) { 

	Student student = new Student();
	student.setId(3187L);
	student.setAge(30);
	student.setName("Raj");
	student.setAddress("Hyderabad");
	
	
	map.put("Hi", student);
	return "student";
	
	
} */	
	
/**	@GetMapping("student")
	public String getStudent() { 
	

		return "student";
} */
		
/**	@PostMapping("studentsave")
	public String saveStudent(ModelMap map,@RequestParam("name")String name,@RequestParam("age")int age,@RequestParam("id")Long id,@RequestParam("address")String Address )
	
	
	{ 
		
		Student student = new Student();
		student.setId(id);
		student.setAge(age);
		student.setName(name);
		student.setAddress(Address);
		
		

	map.put("Hi", student);
		

	return"studentsave";
		
		
	} */
	
	
	@GetMapping("add")
	public String addpage() { 		
	
	return "addition";	
		
	}
	
	@PostMapping("addition")
	public String add(ModelMap map,@RequestParam("num1")int num1,@RequestParam("num2")int num2, @RequestParam("operation")String opr ) 	{
		
		Mat1 fun=new Mat1(num1,num2);		
		
		int num3=0;
		
		if (opr.equals("add")) 	{
		
			num3=fun.add1();	 
		}
		else if (opr.equals("sub")) {
		
			num3=fun.sub1();
			
		}
		else if (opr.equals("mul")) {
			
			num3=fun.mul1();
			
		}
		else if (opr.equals("div")) {
		num3=fun.div1();
			
		}		
		
	map.put("num3",num3);
	return "addition";	
		
	}


//@PostMapping("student")
//public String getStudent(ModelMap map) { 
//
//	Student student = new Student();
//	student.setId(3187L);
//	student.setAge(30);
//	student.setName("Raj");
//	student.setAddress("Hyderabad");
//	
//	
//	map.put("Hi", student);
//	return "student";
//	
//	
//}
//public String getAlien()
//{
//
//
//return "alien";
//	
//}

//public String getAlien(Model m)
//{
//
//m.addAttribute("hello", 5);
//return "alien";
//	
//}

//public String getAlien(ModelMap map)
//{
//
//Alien coder=new Alien(1L,"binku",28);	
//coder.setId(1);
//coder.setName("raju");
//coder.setAge(4);

//coder.Alien(1L,"binku",28);
//
//map.put("hello", coder);
//return "alien";

	
//}


//ModelAndView getAlien()
//
//{
//ModelAndView mv = new ModelAndView("alien");
////mv.setViewName("alien");
//mv.addObject("hello", 78);
//
//
//return mv;
//}
}