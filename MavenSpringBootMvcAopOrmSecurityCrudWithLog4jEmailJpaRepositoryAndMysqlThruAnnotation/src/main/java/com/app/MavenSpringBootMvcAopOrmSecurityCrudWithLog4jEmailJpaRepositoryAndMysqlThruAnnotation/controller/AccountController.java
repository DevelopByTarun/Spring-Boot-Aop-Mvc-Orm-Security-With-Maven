package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.dao.IAccountDAO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.exception.AccountException;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.AccountDTO;

@Controller
public class AccountController {
	
	private Logger logger = Logger.getLogger(AccountController.class);
	
	@ExceptionHandler(AccountException.class)
	public ModelAndView showAccountExceptionView(Exception exception) {
		System.out.println("----Caught AccountException----");
		System.out.println("");
		logger.debug("----Caught AccountException----");
		logger.debug("");
	    ModelAndView model = new ModelAndView();
	    model.addObject("exception", exception);
	    model.setViewName("accountExceptionView");
	    return model;
	}
	
	@Autowired
	private IAccountDAO accountDAO;
	
	@RequestMapping(value = "/fetch-accounts", method = RequestMethod.GET)
	public ModelAndView fetchAllAccounts() throws Exception {
		logger.debug("****Going To Start Fetch All Accounts Method****");
		
		ModelAndView model = new ModelAndView("fetch-accounts");
		ArrayList<AccountDTO> accountsList = accountDAO.getAllAccounts();
		if(accountsList != null && accountsList.size() > 0) {
			model.addObject("accountsList", accountsList);
			logger.debug("You Have Successfully Fetch All Accounts List");
		}
		else {
			logger.debug("Unable To Fetch All Accounts List");
		}
		logger.debug("****Going To End Fetch All Accounts Method****");
		logger.debug("");
		logger.debug("");
		return model;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/edit-account/{number}", method = RequestMethod.GET)
	public ModelAndView editAccount(@PathVariable("number") int number) throws Exception {
		logger.debug("****Going To Start Edit Account Method****");
		ModelAndView model = new ModelAndView();
		AccountDTO editAccount = accountDAO.getAccountByNumber(number);
		if(editAccount != null) {
			model.addObject("values", editAccount);
			logger.debug("You Have Successfully Edit Account Number "+number);
		}
		else {
			logger.debug("Unable To Edit Account Number "+number);
		}
		model.setViewName("updateAccount");
		logger.debug("****Going To End Edit Account Method****");
		logger.debug("");
		logger.debug("");
		return model;
	}
	
	@RequestMapping(value = "/update-account", method = RequestMethod.POST)
	public ModelAndView callUpdateAccount(@RequestParam("number") int number,
			@RequestParam("accountType") String accountType,
			@RequestParam("accountBank") String accountBank, 
			@RequestParam("accountStatus") String accountStatus,
			@ModelAttribute() AccountDTO accountDTO) throws Exception {
		logger.debug("****Going To Start Call Update Account Method****");
		accountDTO.setNumber(number);
		if(accountType.length() > 10) {
			logger.debug("Unable To Update Account Type Because Length Of Type Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new AccountException(new Date(), "Unable To Update Account Type Because Length Of Type Is Not Correct !! Please Try Again.."); 
		}
		else {
			accountDTO.setType(accountType);
		}
		if(accountBank.length() > 20) {
			logger.debug("Unable To Update Account Bank Name Because Length Of Bank Name Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new AccountException(new Date(), "Unable To Update Account Bank Name Because Length Of Bank Name Is Not Correct !! Please Try Again..");
		}
		else {
			accountDTO.setBank(accountBank);
		}
		if(accountStatus.length() > 10) {
			logger.debug("IOException Occured :-> Unable To Update Account Status Because Length Of Status Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new IOException("IOException Occured :-> Unable To Update Account Status Because Length Of Status Is Not Correct !! Please Try Again..");
		}
		else {
			accountDTO.setStatus(accountStatus);
		}
		accountDAO.updateAccount(accountDTO);
		if(accountDAO != null) {
			logger.debug(accountDTO.getBank()+" Bank Account Updated Successfully");
		}
		else {
			logger.debug("Unable To Update "+accountDTO.getBank()+" Bank Account");
		}
		logger.debug("****Going To End Call Update Account Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-accounts");
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/delete-account/{number}", method = RequestMethod.GET)
	public ModelAndView callDeleteAccount(@PathVariable("number") int number,
			@ModelAttribute() AccountDTO accountDTO) throws Exception {
		logger.debug("****Going To Start Call Delete Account Method****");
		accountDTO.setNumber(number);
		accountDAO.deleteAccount(accountDTO);
		if(accountDAO != null) {
			logger.debug("You Have Successfully Delete Account Number "+number);
		}
		else {
			logger.debug("Unable To Delete Account Number "+number);
		}
		
		logger.debug("****Going To End Call Delete Account Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-accounts");
	}	
}
