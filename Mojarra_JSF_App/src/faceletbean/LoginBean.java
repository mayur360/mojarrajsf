package faceletbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9097631887148949702L;
	/**
	 * 
	 */

	private String userName;
	private String password;

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

	// Redirect Page to Sign up page
	public String signUp() {
		System.out.println("Inside sign up method");
		return "signup";
	}

	public String authenticateUser() {
		System.out.println("User name is " + getUserName());
		System.out.println("Password is " + getPassword());
		if (userName.equals("Mayuresh") && password.equals("mayuresh")) {
			System.out.println("Login is succesful");
			return "succesful";
		} else {
			System.out.println("Login is unsuccesful");
			return "failed";
		}
	}

}
