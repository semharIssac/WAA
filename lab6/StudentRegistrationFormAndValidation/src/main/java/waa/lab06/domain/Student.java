package waa.lab06.domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


public class Student {
	
	private int id;
	
	@NotEmpty @Size(min=4, max=50, message="{Size.Student.name.validation}")
	private String firstName = null;
	
	@NotEmpty(message="Enter the last name")
	private  String lastName  = null;
	
	@NotEmpty @Email
	private String email = null;
	
	@NotEmpty
	private String gender = null;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull @Past
    private Date birthday;
	
	@Valid
	private Phone phone;

  	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
	   	
	   

}
