package faceletbean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "studentInfo")
@ViewScoped
public class StudentInfoProcessingBean {

	private static final long serialVersionUID = 1773837052165664939L;
	private Integer rollNo;
	private String firstName;
	private String lastName;
	private String studentClass;
	private String division;
	private String address;
	private String contactNo;
	private String grade;

	public Integer getRollNo() {
	if(rollNo== null){
		return new rollNo
	}
	else{
		return rollNo;
	}}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
	if(firstName== null){
		return new firstName
	}
	else{
		return firstName;
	}}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
	if(lastName== null){
		return new lastName
	}
	else{
		return lastName;
	}}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentClass() {
	if(studentClass== null){
		return new studentClass
	}
	else{
		return studentClass;
	}}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getDivision() {
	if(division== null){
		return new division
	}
	else{
		return division;
	}}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getAddress() {
	if(address== null){
		return new address
	}
	else{
		return address;
	}}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
	if(contactNo== null){
		return new contactNo
	}
	else{
		return contactNo;
	}}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGrade() {
	if(grade== null){
		return new grade
	}
	else{
		return grade;
	}}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// This Method will add info from addInfo page to database
	public String addInfo() throws SQLException, ClassNotFoundException {
		String sql_statement = "insert into student_info(roll_number,fname,lname,sclass,division,grade,address,contact)values("
				+ "'"
				+ this.getRoll_No()
				+ "',"
				+ "'"
				+ this.getFname()
				+ "',"
				+ "'"
				+ this.getLname()
				+ "',"
				+ "'"
				+ this.getsClass()
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
