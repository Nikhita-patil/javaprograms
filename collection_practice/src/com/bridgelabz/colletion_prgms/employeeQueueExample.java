package com.bridgelabz.colletion_prgms;

public class employeeQueueExample implements Comparable<employeeQueueExample> {
	int employee_id;
	String employee_name;
     double employee_salary;
     String deptartment;
	public employeeQueueExample(int employee_id, String employee_name, double employee_salary, String deptartment) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.deptartment = deptartment;
	}

	

	public int compareTo( employeeQueueExample e) {
		
		if(employee_salary<e.employee_salary)
			return 1;
		else if(employee_salary>e.employee_salary)
			return -1;
		else
		return 0;
	}



	@Override
	public String toString() {
		return "employeeQueueExample [employee_id=" + employee_id + ", employee_name=" + employee_name
				+ ", employee_salary=" + employee_salary + ", deptartment=" + deptartment + "]";
	}



	}

