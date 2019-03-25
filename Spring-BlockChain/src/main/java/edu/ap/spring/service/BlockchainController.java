package edu.ap.spring.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlockchainController {

	public BlockchainController() {
		
	}
	
	@RequestMapping("/balance")
	   public String balance() {
		   return "Balance";
	   }
}
