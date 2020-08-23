package com.hw1.run;
import com.hw1.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee();
		
		arr[1] = new Employee(1, "È«±æµ¿", 19, 'M', "01022223333", "¼­¿ï Àá½Ç");
		
		arr[2] = new Employee(2, "°­¸»¼ø", "±³À°ºÎ", "°­»ç", 20 ,'F', 1000000, 0.01, "01011112222", "¼­¿ï ¸¶°î");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("emp[" + i + "] : "  + arr[i].information());
		}
		
		System.out.println("===================================================================");
		
		arr[0] = new Employee(0, "±è¸»¶Ë", "¿µ¾÷ºÎ", "ÆÀÀå", 30, 'M', 3000000, 0.2, "01055559999", "Àü¶óµµ ±¤ÁÖ");
		
		arr[1].setDept("±âÈ¹ºÎ");
		arr[1].setJob("ºÎÀå");
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.println("emp[" + i + "] : " + arr[i].information());
		}
		
		System.out.println("===================================================================");
		
		for(Employee a : arr) {
			System.out.println(a.getEmpName() + "ÀÇ ¿¬ºÀ : " + (int)((a.getSalary() + a.getSalary() * a.getBonusPoint())* 12) + "¿ø");
		}
		
		System.out.println("===================================================================");
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += (int)((arr[i].getSalary() + arr[i].getSalary() * arr[i].getBonusPoint())* 12);
			
		}
		
		System.out.println("Á÷¿øµéÀÇ ¿¬ºÀÀÇ Æò±Õ : " + sum/arr.length + "¿ø");
		
		
	}
}
