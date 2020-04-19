package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	private static JobsController controller = new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Address 1", "666666666", 2000.0);			
		controller.createEmployee("Laura Employee", "Address 2", "625266666", 2000.0);
		controller.createEmployee("Pedro Employee", "Address 3", "665266666", 2000.0);
		controller.createVolunteer("Juan Volunteer", "Address 4", "614266666", "Internship");
		controller.createManagerEmployee("Pedro Manager Employee", "Address 5", "665226666", 2000.0);		
		
		controller.payAllEmployeers();
		
		String allEmployees = controller.getAllEmployeers();
		
		System.out.println("EMPLOYEES:\n" + allEmployees);
		
	}

}



