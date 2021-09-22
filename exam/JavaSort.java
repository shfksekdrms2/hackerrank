package exam;

import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class StudentChecker implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getCgpa() == o2.getCgpa()) {
			int length = (o1.getFname().length() > o2.getFname().length()) ? o2.getFname().length() : o1.getFname().length();
			for(int i=0; i<length; i++){
				if (o1.getFname().charAt(i) != o2.getFname().charAt(i)) {
					return o1.getFname().charAt(i) - o2.getFname().charAt(i);
				}
			}
			return o2.getId() - o1.getId();
		} else {
			return (int) (o2.getCgpa()*1000 - o1.getCgpa()*1000);
		}
	}
}

// Complete the code
public class JavaSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new StudentChecker());

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
