package com.percepton.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.percepton.entity.User;
import com.percepton.json.CustomUserResponse;
import com.percepton.service.IUserService;

@Controller
public class LoginController 
{
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="/doLogin")
	@ResponseBody
	public String doLogin()
	{
		System.out.println("In doLogin Controller");
		
		logger.info("In doLogin mwthod");
		return "login";
	}
	
	 /**
     * Retrieves the JSP page that contains our JqGrid
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsersPage() {
     logger.debug("Received request to show users page");
     
     // This will resolve to /WEB-INF/jsp/users.jsp page
     return "users";
    }
    
    @Resource(name="userService")
    private IUserService userService;
     
    /**
     * The default method when a request to /users is made.
     * This essentially retrieves all users, which are wrapped inside a CustomUserResponse object.
     * The object is automatically converted to JSON when returning back the response.
     * The @ResponseBody is responsible for this behavior.
     */
         @RequestMapping(value = "/getusers", method = RequestMethod.GET,produces = "application/json")
         public @ResponseBody  CustomUserResponse getAll(
         ) {
          logger.debug("Received request to get all users");
  
          // Retrieve all users from the service
          List<User> users = userService.getAll();
           
          // Initialize our custom user response wrapper
          CustomUserResponse response = new CustomUserResponse();
           
          // Assign the result from the service to this response
          response.setRows(users);
  
          // Assign the total number of records found. This is used for paging
          response.setRecords( String.valueOf(users.size()) );
           
          // Since our service is just a simple service for teaching purposes
          // We didn't really do any paging. But normally your DAOs or your persistence layer should support this
          // Assign a dummy page
          response.setPage( "1" );
           
          // Same. Assign a dummy total pages
          response.setTotal( "10" );
           
          // Return the response
          // Spring will automatically convert our CustomUserResponse as JSON object. 
          // This is triggered by the @ResponseBody annotation. 
          // It knows this because the JqGrid has set the headers to accept JSON format when it made a request
          // Spring by default uses Jackson to convert the object to JSON
          System.out.println(users.size());
          System.out.println(response);
          return response;
      }
}
