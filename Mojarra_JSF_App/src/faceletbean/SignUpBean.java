package faceletbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "signUp")
@ViewScoped
public class SignUpBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4222374048972008357L;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String conformPassword;
	private String address;
	private String emailAdd;
	private String gender;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// This will rediect you to login.xhtml
	public String doBack() {
		System.out.println("Inside Back to login method");
		return "back";
	}

	public String doRegister() {
		System.out.println("Inside register method");
		String status = null;
		if (!getFirstName().isEmpty() && !getLastName().isEmpty() && !getUserName().isEmpty()
				&& !getPassword().isEmpty() && !getConformPassword().isEmpty() && !getEmailAdd().isEmpty()
				&& !getGender().isEmpty()) {
			if (getPassword().equals(getConformPassword())) {
				status = "success";
				;
			}
		} else {
			status = "failed";
		}

		return status;
	}
}
