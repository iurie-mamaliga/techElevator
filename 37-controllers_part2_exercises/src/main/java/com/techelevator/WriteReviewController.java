package com.techelevator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.model.JdbcReviewDao;
import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class WriteReviewController {
	
	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping(path="/writeReview", method=RequestMethod.GET)
	public String showReviewForm() {	
		return "writeReview";
	}
	
	@RequestMapping(path="/reviewSubmitionResult", method=RequestMethod.GET)
	public String showReviewSubmitionResult() {
		return "reviewSubmitionResult";
	}
	
	@RequestMapping(path="/writeReview", method=RequestMethod.POST)
	public String saveReview(@RequestParam String name,
			 @RequestParam int rating,
			 @RequestParam String reviewName,
			 @RequestParam String reviewBody) throws FileNotFoundException, IOException {

		Review review = new Review();
		review.setUsername(name);
		review.setRating(rating);
		review.setTitle(reviewName);
		review.setText(reviewBody);
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
	return "redirect:/reviewSubmitionResult";
	}
	
}
