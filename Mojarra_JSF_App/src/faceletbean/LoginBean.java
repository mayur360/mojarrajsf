package faceletbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8619434251652355587L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		System.out.println("User name is " + getUsername());
		System.out.println("Password is " + getPassword());
		if (username.equals("Mayuresh") && password.equals("mayuresh")) {
			System.out.println("Login is succesful");
			return "succesful";
		} else {
			System.out.println("Login is unsuccesful");
			return "failed";
		}
	}

}
