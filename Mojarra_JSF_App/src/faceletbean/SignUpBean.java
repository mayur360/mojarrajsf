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
	private String fname;
	private String lname;
	private String userName;
	private String pwd;
	private String confpwd;
	private String address;
	private String emailAdd;
	private String gender;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfpwd() {
		return confpwd;
	}

	public void setConfpwd(String confpwd) {
		this.confpwd = confpwd;
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
		if (!getFname().isEmpty() && !getLname().isEmpty() && !getUserName().isEmpty() && !getPwd().isEmpty()
				&& !getConfpwd().isEmpty() && !getEmailAdd().isEmpty() && !getGender().isEmpty()) {
			if (getPwd().equals(getConfpwd())) {
				status = "success";
				;
			}
		} else {
			status = "failed";
		}

		return status;
	}
}
