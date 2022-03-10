package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.repo.EmpDeptRepository;

public class TestEmpDept {
	private static EmpDeptRepository repo;

	@BeforeAll
	public static void init() {
		repo = new EmpDeptRepository();
	}
	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDeptId(10);
		dept.setDeptName("sales");
		repo.addDept(dept);
		
	}
	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpName("samantha");
		emp.setSalary(100);
		repo.addEmp(emp, 10);
	}
	@Test
	public void testRemoveDept() {
		repo.removeDept(10);
		
	}
	@Test
	public void testFindDept() {
		Department dept = repo.findDept(10);
		
		System.out.println(dept);
		System.out.println(dept.getEmps());
	}
}
