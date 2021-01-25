package com.klu.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.Student;
import com.klu.insert.DOA;

public class Main{
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Student s = new Student();
		Scanner scan = new Scanner(System.in);
		DOA si = new DOA();
		while(true) {
			System.out.println("CRUD OPERATIONS To Be DONE...");
			System.out.println("1. Insert the data.");
			System.out.println("2. Display the data.");
			System.out.println("3. Total Cost of the items");
			System.out.println("4. Exit.");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter id:");
				s.setId(scan.nextInt());
				System.out.println("Enter item name ");
				s.setName(scan.next());
				System.out.println("Enter item cost: ");
				s.setCost(scan.nextFloat());
				int i = si.Insert(s);
				if(i > 0) {
					System.out.println("Insertion is successful");
				}	
				else
					System.out.println("Insertion failed");
				break;
			case 2:
				si.Display();
				break;
			case 3:	
				System.out.println("Total Cost:");
				si.TotalCost();
				break;
			case 4:	
				System.exit(0);
			default:
				System.out.println("Enter a valid number");
			}
		}
	}
}
		
