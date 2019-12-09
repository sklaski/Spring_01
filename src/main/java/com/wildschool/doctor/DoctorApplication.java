package com.wildschool.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    public String index() {
		String menu = "";
		menu += "<ul>\n";
		menu += "<li>\n";
		menu += "<a href=\"doctor/1/\">Doctor1</a>\n";
		menu += "</li>\n";
		menu += "<li>\n";
		menu += "<a href=\"doctor/2/\">Doctor2</a>\n";
		menu += "</li>\n";
		menu += "<li>\n";
		menu += "<a href=\"doctor/3/\">Doctor3</a>\n";
		menu += "</li>\n";
		menu += "<li>\n";
		menu += "<a href=\"doctor/4/\">Doctor4</a>\n";
		menu += "</li>\n";
		menu += "</ul>\n";				
        return menu;
    }
	
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom Baker";
	}
}
