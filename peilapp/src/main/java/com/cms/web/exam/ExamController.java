package com.cms.web.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/exam")
public class ExamController {
     
	@RequestMapping("/{pathname}")
	public String comment(@PathVariable("pathname") String pathname) {
		
		return "exam/"+pathname;
	}
}
