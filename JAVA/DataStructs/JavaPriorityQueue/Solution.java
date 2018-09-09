package hackerrank.hackerrank.JAVA.DataStructs.JavaPriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-priority-queue/problem
 * Java Priority Queue
 */

class Student {
	private int id;
	private double cgpa;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Priorities {
	public static List<Student> getStudents(List<String> events) {
		List<Student> list = new ArrayList<Student>();

		for (String string : events) {
			String[] tmp = string.split(" ");
			if (tmp[0].equals("ENTER")) {
				Student student = new Student();
				student.setCgpa(Double.valueOf(tmp[2]));
				student.setId(Integer.valueOf(tmp[3]));
				student.setName(tmp[1]);
				// System.out.println("student.getCpga(): " + student.getCgpa()
				// + " student.getid: " + student.getId() +
				// " student.getName(): "
				// + student.getName());
				list.add(student);
				Collections.sort(list, new mySort());
			} else {
				if(list.size() != 0){
					list.remove(0);
				}
			}
//			for (Student temp : list) {
//				System.out.println(" temp.getName(): " + temp.getName() + " temp.getCgpa(): " + temp.getCgpa() + " temp.getId(): " + temp.getId());
//			}
			// System.out.println("-------------");
		}

		return list;
	}
}

class mySort implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if ((int) (o1.getCgpa() * 100) == (int) (o2.getCgpa() * 100)) {
			String name1 = o1.getName();
			String name2 = o2.getName();
			int length = Math.min(name1.length(), name2.length());
			for (int i = 0; i < length; i++) {
				if (name1.charAt(i) != name2.charAt(i)) {
					return name1.charAt(i) - name2.charAt(i);
				} else {
					return o1.getId() - o2.getId();
				}
			}

		} else {
			return (int) (o2.getCgpa() * 100 - o1.getCgpa() * 100);
		}
		return 0;
	}
}

public class Solution {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
