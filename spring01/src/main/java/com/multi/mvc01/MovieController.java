package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public String movie(String movie) {
		if (movie.equals("comic")) {
			return "comic";
		} else if (movie.equals("drama")) {
			return "drama";
		} else {
			return "action";
		}
	}
	
}
