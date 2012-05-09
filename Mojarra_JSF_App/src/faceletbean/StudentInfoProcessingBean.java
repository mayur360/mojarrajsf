package faceletbean;

import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "studentInfo")
@ViewScoped
public class StudentInfoProcessingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5094827581022476636L;
	private Integer rollNo;
	private String firstName;
	private String lastName;
	private String studentClass;
	private String division;
	private String address;
	private String contactNo;
	private String grade;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
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

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// This Method will add info from addInfo page to database
	public String addInfo() throws SQLException, ClassNotFoundException {
		String sql_statement = "insert into student_info(roll_number,fname,lname,sclass,division,grade,address,contact)values("
				+ "'"
				+ this.getRollNo()
				+ "',"
				+ "'"
				+ this.getFirstName()
				+ "',"
				+ "'"
				+ this.getLastName()
				+ "',"
				+ "'"
				+ this.getStudentClass()
				+ "',"
				+ "'"
				+ this.getDivision()
				+ "',"
				+ "'"
				+ this.getGrade()
				+ "',"
				+ "'"
				+ this.getAddress() + "'," + "'" + this.getContactNo() + "'" + ");";
		System.out.println(sql_statement);
		dbconnection.DataConnection db = new dbconnection.DataConnection();
		db.connect();
		db.execUpdate(sql_statement);
		db.close();
		return "added";
	}

	// This method will redirect addInfo page to home page on clicking back button
	public String backHome() {
		return "backHome";
	}

	// This method will Reset addInfo form data after clicking Reset button
	public String doReset() {
		return "reset";
	}

	// This Method will give yopu grade of student based on his roll number
	public String showGrade() {
		return "grades";
	}

	// This Method will display whole information about student based on his roll number & first name
	public String showInfo() {

		return "studentInfo";
	}

}
