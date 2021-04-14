package Project.appClasses;

public class Contact implements Comparable<Contact> {
	
	//define attributes
	private String firstName;
	private String lastName;
	
	private int phoneNumber;
	private String eMail;
	
	public Contact(String firstName, String lastName, int phoneNumber, String eMail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	public String getfirstName() {
		return this.firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return this.eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	//toString
	public String toString() {
		return lastName + " " + firstName;
	}

	//implement Comparable - compare contacts by lastName
	//must-have for treeSet
	public int compareTo(Contact o) {
		int valCompare = this.getlastName().compareTo(o.getlastName());
		if(valCompare  == 0)
		return 0;
		else
			if (valCompare < 0)
				return -1;
			else
				return 1;
		
	}
	


}
