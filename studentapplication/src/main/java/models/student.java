package models;

public class student {

	private String Rollnumber;
	private String Name;
	private String Email;
	private String Branch;
	private String Section;
	public String getRollnumber() {
		return Rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		Rollnumber = rollnumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String rollnumber, String name, String email, String branch, String section) {
		super();
		Rollnumber = rollnumber;
		Name = name;
		Email = email;
		Branch = branch;
		Section = section;
	}
}
