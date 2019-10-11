package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CorseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String>{
	
//	private String coursePrefix;
	private String[] coursePrefixes; //adding in the array function
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		//Does the result start with my assigned prefix
		boolean result = false;
//		//need to check for null
//		if (theCode != null) {
//			result = theCode.startsWith(coursePrefix);
        if (theCode != null) {
            
            //
            // loop thru course prefixes
            //
            // check to see if code matches any of the course prefixes
            //
        	 for (String tempPrefix : coursePrefixes) {
                 result = theCode.startsWith(tempPrefix);
                 
                 // if we found a match then break out of the loop
                 if (result) {
                     break;
                 }
             }
		} else {
			result = true;
		}
		//if so, return the result:
		return result;
	}

}
