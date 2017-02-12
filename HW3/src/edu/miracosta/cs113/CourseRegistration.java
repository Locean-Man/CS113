package edu.miracosta.cs113;

import java.util.Scanner;

public class CourseRegistration 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		LinkedList<Student> studentList = new LinkedList<Student>();
		Menu theMenu = new Menu();
		String userInput;
		
		theMenu.getOptions().add(new MenuOption("Add student at end of list",'A'));
		theMenu.getOptions().add(new MenuOption("Add student at beginning of list",'B'));
		theMenu.getOptions().add(new MenuOption("Remove student at beginning of list", 'C'));
		theMenu.getOptions().add(new MenuOption("Remove student by name", 'D'));
		theMenu.getOptions().add(new MenuOption("Exit",'X'));
		switch(theMenu.printMenu())
		{
			case 'A':
			case 'a':
				System.out.println("Please enter student name");
				userInput = keyboard.nextLine();
				studentList.add(new Student(userInput));
				break;
			case 'B':
			case 'b':
				System.out.println("Please enter student name");
				userInput = keyboard.nextLine();
				studentList.addFirst(new Student(userInput));
				break;
			case 'C':
			case 'c':
				studentList.removeFirst();
				break;
			case 'D':
			case 'd':
				System.out.println("Please enter student name");
				userInput = keyboard.nextLine();
				studentList.remove(new Student(userInput));
				break;
				
		}
		keyboard.close();
	}
}
