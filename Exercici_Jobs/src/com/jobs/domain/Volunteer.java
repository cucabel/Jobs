package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public void pay() 
	{
		totalPaid = 0;
	}
	
	@Override
	public String toString() {

		String result = "\nId: " + super.id + "\nName: " + super.name + "\nAddress: " + super.address + "\nPhone: " + super.phone + "\nTotal Paid: " + super.totalPaid + "\n"; 
		return result;
	}

}



