package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.ReviewDao;

@Controller 
public class IndexController {

	@Autowired
	private ReviewDao reviewDao;
	
	@RequestMapping("/index")
	public String displayExistingReviews(HttpServletRequest request) {
		request.setAttribute("reviews", reviewDao.getAllReviews());
		
		
		
		return "index";
	}
}
