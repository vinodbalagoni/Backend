package com.vinod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Eid ;
	@Column(name="first_name")
    private String firstName ;
	@Column(name="last_name")
 	private String lastName ;
	@Column(name="email_Id")
 	private String emailId ;
	@Column(name="password")
    private String password ;
	@Column(name="conform_Password")
    private String conformPossword;
    
    public Employee()
    {
    	
    }

	public Employee(String firstName, String lastName, String emailId, String password,
			String conformPossword) {
		super();
		 
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.conformPossword = conformPossword;
	}

	public long getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConformPossword() {
		return conformPossword;
	}

	public void setConformPossword(String conformPossword) {
		this.conformPossword = conformPossword;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", conformPossword=" + conformPossword + "]";
	}
	
    

}
