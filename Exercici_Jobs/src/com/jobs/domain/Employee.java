package com.jobs.domain;

public class Employee extends AbsStaffMember
{
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate; 

	public Employee(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}

	public IPaymentRate getPaymentRate() {
		return paymentRate;
	}

	public void setPaymentRate(IPaymentRate paymentRate) {
		this.paymentRate = paymentRate;
	}	
	
	@Override
	public void pay() {
		totalPaid = paymentRate.pay(salaryPerMonth);			
	}
	
	@Override
	public String toString() {
		
		String result = "\nId: " + super.id + "\nName: " + super.name + "\nAddress: " + super.address + "\nPhone: " + super.phone + "\nTotal Paid: " + super.totalPaid + "\n"; 
		return result;
	}
																
}



