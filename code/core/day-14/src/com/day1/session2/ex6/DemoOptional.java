package com.day1.session2.ex6;

import com.day1.session1.common.Emp;
import com.day1.session1.common.Employee;

import java.util.Optional;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */
//raj
class EmpApp{
	public Optional<Employee> getEmployee(int id){
		///
		//
		return  Optional.empty();
	}

//	public Optional<String> getName(int id){
//		///
//		return  Optional.empty();
//	}
}

class EmpNotFound extends RuntimeException{

}

//rajat
public class DemoOptional {

	public static void main(String[] args) {
		//what is optional in java 8 how it help us?

		String nameValue=null;
		//Optional<String> nameOpt=Optional.of(nameValue); //ofNullable vs of
		Optional<String> nameOpt=Optional.empty();
		System.out.println(nameOpt.orElse("name is not found"));

		EmpApp empApp=new EmpApp();
		Optional<Employee> optEmp=empApp.getEmployee(44);
		if(!optEmp.isEmpty()){
			Employee e=optEmp.get();
		}
//		String name=optEmp.map(e-> e.getName()).orElse(" not found");

//
//		Optional<String> optName=empApp.getName(555);
////		System.out.println(optName.orElse("name not found"));
//		System.out.println(optName.orElseThrow(()-> new EmpNotFound()));
	}
}






