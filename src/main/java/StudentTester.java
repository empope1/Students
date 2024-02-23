import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Feb 22, 2024
 */
public class StudentTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student cameron = new Student("Cameron");
		
		//StudentHelper sh = new StudentHelper();
		
		//sh.insertStudent(cameron);
		
		Student emily = new Student();
		Student evan = new Student();
		
		List<Student> cameronsItems = new ArrayList<Student>();
		cameronsItems.add(emily);
		cameronsItems.add(evan);
		
		StudentHelper ldh = new StudentHelper();
		Student cameronList = new Student("Cameron's Roster", LocalDate.now(), cameron);
		cameronList.setListOfItems(cameronsItems);
		
		ldh.insertNewStudent(cameronList);
		
		List<Student> allLists = ldh.getLists();
		
		for(Student a : allStudents) {
			System.out.println(a.toString());
		}

	}

}
