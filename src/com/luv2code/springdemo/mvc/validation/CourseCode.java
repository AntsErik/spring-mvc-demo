package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//CorseCodeConstraintValidator will be the Validator class.
@Constraint(validatedBy = CorseCodeConstraintValidator.class)
//Where can you apply this new annotation: on methods and/or on fields
@Target({ElementType.METHOD, ElementType.FIELD})
//How long will the marked annotation be stored/used? Retain this in the byte code and also use it by the JVL.
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//define the attributes that we can pass into the interface:
	//default course code
//	public String value() default "LUV"; //can pass in a value and if they wont, default shall be LUV
	public String[] value() default {"LUV"}; //CHANGING INTO AN ARRAY
	
	//default error message
	public String message() default "must start with LUV";
	
	//default groups - where you can group validation constraints together
	public Class<?>[] groups() default {};
	
	//default payloads - can pass additional information about the validation error.
	public Class<? extends Payload>[] payload() default {};
	}
