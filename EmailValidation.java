package EmailValidationProgram;

import java.util.ArrayList;
import java.util.Scanner;


public class EmailValidation {

	public static void main(String[] args) {
		 ArrayList<String> emailID = new ArrayList<String>();
		        
		    emailID.add("naik.sai333@gmail.com");
	        emailID.add("saikumarnaikbukke3@gmail.com");
	        emailID.add("naik.siva1207@gmail.com");
	        emailID.add("bukkevijaykumarnaik01@gmail.com");
	        emailID.add("pavankumar123@gmail.com");
	        emailID.add("sathwik3848@gmail.com");
	        emailID.add("saikumar0708@gmail.com");
	        
		         String searchElement = null;
		         System.out.println("Enter the email to search: ");
		         Scanner sc = new Scanner(System.in);
		         searchElement = sc.nextLine();
		          if(emailID.contains(searchElement)) 
		          {
		        	  System.out.println("valid ");
		          }
		          else
		          {
		        	  System.out.println("invalid ");
		          }
		          }
		         
		    }

	