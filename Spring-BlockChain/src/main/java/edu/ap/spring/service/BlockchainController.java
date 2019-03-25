package edu.ap.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.ap.spring.transaction.Transaction;

@Controller
public class BlockchainController {
	
	public BlockchainController() {
		
	}
	
	@Autowired
	private Transaction transaction;
	private Wallet wallet;
	private Block block;
	private BlockChain blockChain;
	
	@RequestMapping("/balance/walletA")
	   public String balance( Model model) {
		Wallet walletA = null;
		walletA.generateKeyPair();
		model.addAttribute("wallet", walletA.getBalance());
		return "balance";
	   }
	
	@RequestMapping("/transaction")
		public String transaction() {
			return "transaction";
	}
	
	@RequestMapping("/transaction", method= RequestMethod.POST)
	   //worden volgende waarde opgehaald uit dit form
	   public Transaction setTransaction(@RequestParam("sender") Transaction transaction) {
		wallet.sendFunds(transaction.getRecipient(), transaction.getValue());
	      return "transaction";
	   }
	
	
	@RequestMapping("/")
	   public String root() {
		   return "redirect:/balance/walletA";
	   } 
}
