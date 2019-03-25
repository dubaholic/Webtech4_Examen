package edu.ap.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlockchainController {
	
	public BlockchainController() {
		
	}
	
	@RequestMapping("/balance/walletA")
	   public String balance( Model model) {
		Wallet walletA;
		walletA.generateKeyPair();
		
		 model.addAttribute("wallet", walletA.getBalance());
		return "balance";
	   }
	
	@RequestMapping("/")
	   public String root() {
		   return "redirect:/balance/walletA";
	   }
}
