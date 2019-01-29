package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.controller;

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
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.dao.IAccountDAO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.exception.AccountException;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.model.AccountDTO;

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
	
	@RequestMapping(value = "/welcome-account", method = RequestMethod.GET)
	public ModelAndView showAddAccountPage() {
		logger.debug("****Going To Enter On Add Account Page****");
		logger.debug("");
		logger.debug("");
		ModelAndView model = new ModelAndView();
		model.setViewName("addAccount");
		return model;
	}
	
	@RequestMapping(value = "/add-account", method = RequestMethod.POST)
	public ModelAndView callAddAccount(@RequestParam("accountNumber") int accountNumber,
			@RequestParam("accountType") String accountType,
			@RequestParam("accountBank") String accountBank,
			@RequestParam("accountStatus") String accountStatus,
			@ModelAttribute() AccountDTO accountDTO) throws Exception {
		logger.debug("****Going To Start Call Add Account Method****");
		if(accountNumber >= 10000) {
			logger.debug("IOException Occured :-> Unable To Add Account Number Because Limit Of Number Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new IOException("IOException Occured :-> Unable To Add Account Number Because Limit Of Number Is Not Correct !! Please Try Again..");
		}
		else {
			accountDTO.setNumber(accountNumber);
		}
		if(accountType.length() > 10) {
			logger.debug("Unable To Add Account Type Because Length Of Type Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new AccountException(new Date(), "Unable To Add Account Type Because Length Of Type Is Not Correct !! Please Try Again.."); 
		}
		else {
			accountDTO.setType(accountType);
		}
		if(accountBank.length() > 20) {
			logger.debug("Unable To Add Account Bank Name Because Length Of Bank Name Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new AccountException(new Date(), "Unable To Add Account Bank Name Because Length Of Bank Name Is Not Correct !! Please Try Again..");
		}
		else {
			accountDTO.setBank(accountBank);
		}
		if(accountStatus.length() > 10) {
			logger.debug("NullPointerException Occured :-> Unable To Add Account Status Because Length Of Status Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new NullPointerException("NullPointerException Occured :-> Unable To Add Account Status Because Length Of Status Is Not Correct !! Please Try Again..");
		}
		else {
			accountDTO.setStatus(accountStatus);
		}
		accountDAO.addAccount(accountDTO);
		if(accountDAO != null) {
			logger.debug(accountBank+" Is Save Successfully");
		}
		else {
			logger.debug("Unable To Save "+accountBank);
		}
		logger.debug("****Going To End Call Add Account Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-accounts");	
	}
	
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
	@RequestMapping(value = "/edit-account/{id}", method = RequestMethod.GET)
	public ModelAndView editAccount(@PathVariable("id") int id) throws Exception {
		logger.debug("****Going To Start Edit Account Method****");
		ModelAndView model = new ModelAndView();
		AccountDTO editAccount = accountDAO.getAccountById(id);
		if(editAccount != null) {
			model.addObject("values", editAccount);
			logger.debug("You Have Successfully Edit Account Id "+id);
		}
		else {
			logger.debug("Unable To Edit Account Id "+id);
		}
		model.setViewName("updateAccount");
		logger.debug("****Going To End Edit Account Method****");
		logger.debug("");
		logger.debug("");
		return model;
	}
	
	@RequestMapping(value = "/update-account", method = RequestMethod.POST)
	public ModelAndView callUpdateAccount(@RequestParam("id") int id,
			@RequestParam("accountNumber") int accountNumber,
			@RequestParam("accountType") String accountType,
			@RequestParam("accountBank") String accountBank, 
			@RequestParam("accountStatus") String accountStatus,
			@ModelAttribute() AccountDTO accountDTO) throws Exception {
		logger.debug("****Going To Start Call Update Account Method****");
		accountDTO.setId(id);
		if(accountNumber >= 10000) {
			logger.debug("NullPointerException Occured :-> Unable To Update Account Number Because Limit Of Number Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new NullPointerException("NullPointerException Occured :-> Unable To Update Account Number Because Limit Of Number Is Not Correct !! Please Try Again..");
		}
		else {
			accountDTO.setNumber(accountNumber);
		}
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
	@RequestMapping(value = "/delete-account/{id}", method = RequestMethod.GET)
	public ModelAndView callDeleteAccount(@PathVariable("id") int id) throws Exception {
		logger.debug("****Going To Start Call Delete Account Method****");
		accountDAO.deleteAccount(id);
		if(accountDAO != null) {
			logger.debug("You Have Successfully Delete Account Id "+id);
		}
		else {
			logger.debug("Unable To Delete Account Id "+id);
		}
		logger.debug("****Going To End Call Delete Account Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-accounts");
	}		
}
