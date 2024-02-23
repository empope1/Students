import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Feb 22, 2024
 */

@Entity
public class Student {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="MAJOR")
	private String major;
	
	
	





	public int getId() {
		return id;
	}








	public void setId(int id) {
		this.id = id;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public String getMajor() {
		return major;
	}








	public void setMajor(String major) {
		this.major = major;
	}








	public Student(String name, String major) {
		super();
		this.name = name;
		this.major = major;
	}








	public Student(int id, String name, String major) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
	}








	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}








	public String returnStudent() {
		return this.name+ ":" + this.major;
	}
	
	

}
