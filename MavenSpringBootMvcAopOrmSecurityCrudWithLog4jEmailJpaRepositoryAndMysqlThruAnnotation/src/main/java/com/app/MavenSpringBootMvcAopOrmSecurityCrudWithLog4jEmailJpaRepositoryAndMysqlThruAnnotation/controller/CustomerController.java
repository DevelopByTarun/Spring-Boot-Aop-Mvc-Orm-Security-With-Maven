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
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.dao.ICustomerDAO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.exception.AccountException;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.exception.CustomerException;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.AccountDTO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.CustomerDTO;

@Controller
public class CustomerController {
	
	private Logger logger = Logger.getLogger(CustomerController.class);
	
	@ExceptionHandler(CustomerException.class)
	public ModelAndView showCustomerExceptionView(Exception exception) {
		System.out.println("----Caught CustomerException----");
		System.out.println("");
		logger.debug("----Caught CustomerException----");
		logger.debug("");
	    ModelAndView model = new ModelAndView();
	    model.addObject("exception", exception);
	    model.setViewName("customerExceptionView");
	    return model;
	}
	
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
	private ICustomerDAO customerDAO;
	
	@RequestMapping(value = "/welcome-customer-account", method = RequestMethod.GET)
	public ModelAndView showAddCustomerAccountPage() {
		logger.debug("****Going To Enter On Add Customer Account Page****");
		logger.debug("");
		logger.debug("");
		ModelAndView model = new ModelAndView();
		model.setViewName("addCustomerAccount");
		return model;
	}
	
	@RequestMapping(value = "/add-customer-account", method = RequestMethod.POST)
	public ModelAndView addCustomerAccount(@RequestParam("customerName") String customerName,
			@RequestParam("customerAge") int customerAge, 
			@RequestParam("customerCity") String customerCity,
			@RequestParam("customerCountry") String customerCountry,
			@RequestParam("accountType") String accountType,
			@RequestParam("accountBank") String accountBank,
			@RequestParam("accountStatus") String accountStatus,
			@ModelAttribute() CustomerDTO customerDTO,
			@ModelAttribute() AccountDTO accountDTO) throws Exception {
		logger.debug("****Going To Start Add Customer Account Method****");
		// for AccountDTO
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
		// for CustomerDTO
		if(customerName.length() > 15) {
			logger.debug("Unable To Add Customer Name Because Length Of Name Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new CustomerException(new Date(), "Unable To Add Customer Name Because Length Of Name Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setName(customerName);
		}
		if(customerAge <= 21) {
			logger.debug("IOException Occured :-> Unable To Add Customer Age Because Given Age Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new IOException("IOException Occured :-> Unable To Add Customer Age Because Given Age Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setAge(customerAge);
		}
		if(customerCity.length() > 15) {
			logger.debug("Unable To Add Customer City Because Length Of City Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new CustomerException(new Date(), "Unable To Add Customer City Because Length Of City Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setCity(customerCity);
		}
		if(customerCountry.length() > 15) {
			logger.debug("NullPointerException Occured :-> Unable To Add Customer Country Because Length Of Country Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new NullPointerException("NullPointerException Occured :-> Unable To Add Customer Country Because Length Of Country Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setCountry(customerCountry);
		}
		customerDTO.setCustomerAccount(accountDTO);
		customerDAO.addCustomer(customerDTO);
		if(customerDAO != null) {
			logger.debug(customerName+" Is Save Successfully");
		}
		else {
			logger.debug("Unable To Save "+customerName);
		}
		logger.debug("****Going To End Add Customer Account Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-customers");
	}
	
	@RequestMapping(value = "/fetch-customers", method = RequestMethod.GET)
	public ModelAndView fetchAllCustomers() throws Exception {
		logger.debug("****Going To Start Fetch All Customers Method****");
		ModelAndView model = new ModelAndView("fetch-customers");
		ArrayList<CustomerDTO> customersList = customerDAO.getAllCustomers();
		if(customersList != null && customersList.size() > 0) {
			model.addObject("customersList", customersList);
			logger.debug("You Have Successfully Fetch All Customers List");
		}
		else {
			logger.debug("Unable To Fetch All Customers List");
		}
		logger.debug("****Going To End Fetch All Customers Method****");
		logger.debug("");
		logger.debug("");
		return model;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/edit-customer/{id}", method = RequestMethod.GET)
	public ModelAndView editCustomer(@PathVariable("id") int id) throws Exception {
		logger.debug("****Going To Start Edit Customer Method****");
		ModelAndView model = new ModelAndView();
		CustomerDTO editCustomer = customerDAO.getCustomerById(id);
		if(editCustomer != null) {
			model.addObject("values", editCustomer);
			logger.debug("You Have Successfully Edit Customer Id "+id);
		}
		else {
			logger.debug("Unable To Edit Customer Id "+id);
		}
		model.setViewName("updateCustomer");
		logger.debug("****Going To End Edit Customer Method****");
		logger.debug("");
		logger.debug("");
		return model;
	}
	
	@RequestMapping(value = "/update-customer", method = RequestMethod.POST)
	public ModelAndView callUpdateCustomer(@RequestParam("id") int id,
			@RequestParam("customerName") String customerName,
			@RequestParam("customerAge") int customerAge, 
			@RequestParam("customerCity") String customerCity,
			@RequestParam("customerCountry") String customerCountry, 
			@ModelAttribute() CustomerDTO customerDTO) throws Exception {
		logger.debug("****Going To Start Call Update Customer Method****");
		customerDTO.setId(id);
		if(customerName.length() > 15) {
			logger.debug("Unable To Update Customer Name Because Length Of Name Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new CustomerException(new Date(), "Unable To Update Customer Name Because Length Of Name Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setName(customerName);
		}
		if(customerAge <= 21) {
			logger.debug("IOException Occured :-> Unable To Update Customer Age Because Given Age Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new IOException("IOException Occured :-> Unable To Update Customer Age Because Given Age Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setAge(customerAge);
		}
		if(customerCity.length() > 15) {
			logger.debug("Unable To Update Customer City Because Length Of City Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new CustomerException(new Date(), "Unable To Update Customer City Because Length Of City Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setCity(customerCity);
		}
		if(customerCountry.length() > 15) {
			logger.debug("NullPointerException Occured :-> Unable To Update Customer Country Because Length Of Country Is Not Correct !! Please Try Again..");
			logger.debug("");
			throw new NullPointerException("NullPointerException Occured :-> Unable To Update Customer Country Because Length Of Country Is Not Correct !! Please Try Again..");
		}
		else {
			customerDTO.setCountry(customerCountry);
		}
		customerDAO.updateCustomer(customerDTO);
		if(customerDAO != null) {
			logger.debug(customerDTO.getName()+" Updated Successfully");
		}
		else {
			logger.debug("Unable To Update "+customerDTO.getName());
		}
		logger.debug("****Going To End Call Update Customer Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-customers");
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/delete-customer/{id}", method = RequestMethod.GET)
	public ModelAndView callDeleteCustomer(@PathVariable("id") int id,
			@ModelAttribute() CustomerDTO customerDTO) throws Exception {
		logger.debug("****Going To Start Call Delete Customer Method****");
		customerDTO.setId(id);
		customerDAO.deleteCustomer(customerDTO);
		if(customerDAO != null) {
			logger.debug("You Have Successfully Delete Customer Id "+id);
		}
		else {
			logger.debug("Unable To Delete Customer Id "+id);
		}
		logger.debug("****Going To End Call Delete Customer Method****");
		logger.debug("");
		logger.debug("");
		return new ModelAndView("redirect:/fetch-customers");
	}
}
