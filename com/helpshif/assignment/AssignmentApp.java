package com.helpshif.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.helpshif.assignment.datastructures.KeyValueDataStructure;

/**
 * This class is the entry point for running the application Need to run this
 * class file by providing required options given.
 * 
 * @author pramodg
 *
 */
public class AssignmentApp {

	/**
	 * main method of the application
	 * 
	 * @param {@link String[] } - args
	 */
	public static void main(String[] args) {

		KeyValueDataStructure keyValueDs = new KeyValueDataStructure();

		Scanner in = new Scanner(System.in);
		boolean exit = false;
		
		while (!exit) {
			System.out.println("\n-----------------------------------------\n" 
								+ "1. Insert\n" 
								+ "2. Retrieve\n"
								+ "3. Display current state\n" 
								+ "4. Exit"
								+ "\n Note: Key will in number format and value would be in text format");
			
			try {
				int choice = in.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter key: ");
					Integer key = in.nextInt();
					System.out.println("Enter value: ");
					String value = in.next();
					keyValueDs.insert(key, value);
					break;

				case 2:
					System.out.println("Enter key: ");
					Integer keyTofind = in.nextInt();
					System.out.println("Retrieved value: " + keyValueDs.retrive(keyTofind));
					break;

				case 3:
					keyValueDs.displayDSState();
					break;

				case 4:
					System.out.println("Exiting from the program...");
					exit = true;
					break;

				default:
					System.out.println("Incorrect choice");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Invalid input format, please provide the input in correct format.\n");
				in = new Scanner(System.in);
			}
		}
		
		System.out.println("Program execution completed.");
	}
}
