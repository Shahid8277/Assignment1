package com.ty.revision.comparatorassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class DemoTest {

	static class IdComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.id - o2.id;
		}
	}

	static class NameComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	static class AgeComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.age - o2.age;
		}
	}

	static class MarksComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			int val = (int) (o1.marks - o2.marks);
			return val;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(11, "ray", 75.25, 23));
		hashSet.add(new Student(07, "nik", 55.75, 35));
		hashSet.add(new Student(06, "naf", 84.38, 46));
		hashSet.add(new Student(20, "dhruv", 95.00, 24));
		hashSet.add(new Student(20, "nani", 64.61, 28));
		hashSet.add(new Student(15, "nani", 64.61, 28));
		
		for (Student student : hashSet) {
			System.out.println(student);
		}
		
		ArrayList<Student> arrayList2=new ArrayList<Student>(hashSet);
		/*
		 * Collections.sort(arrayList2, (Object obj1 , object obj2)->{ obj1.c });
		 */
		System.out.println(" Sorting Functionalities");
		String str="yes";
		do {
		System.out.println(" Enter 1 - for Sort by id , ");
		System.out.println(" Enter 2 - for Sort by name , ");
		System.out.println(" Enter 3 - for Sort by age , ");
		System.out.println(" Enter 4 - for Sort by Marks , ");
		int val = sc.nextInt();
		if(val>4) {
			try {
				throw new EnterProperInput("enter proper one");
			} catch (EnterProperInput e) {
				e.printStackTrace();
			}
		}
		switch (val) {
		case 1:
			Collections.sort(arrayList2, new IdComparator());
			System.out.println(arrayList2);
			break;
		case 2:
			Collections.sort(arrayList2, new NameComparator());
			System.out.println(arrayList2);
			break;

		case 3:
			Collections.sort(arrayList2, new AgeComparator());
			System.out.println(arrayList2);
			break;

		case 4:
			Collections.sort(arrayList2, new MarksComparator());
			System.out.println(arrayList2);
			break;
		default:
			System.out.println("INVALID INPUT ----enter proper input ");
			break;
		}
		System.out.println("Do you wanna sort again based on other enter YES else NO");
		str=sc.next();
		}while(str.equalsIgnoreCase("yes"));
		
	}
	

}
