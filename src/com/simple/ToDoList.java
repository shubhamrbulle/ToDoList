package com.simple;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        ArrayList<String> todoList = new ArrayList<>();

		        while (true) {
		            System.out.println("To-Do List:");
		            listItems(todoList);
		            
		            System.out.println("\nOptions:");
		            System.out.println("1. Add Item");
		            System.out.println("2. Remove Item");
		            System.out.println("3. Quit");
		            System.out.print("Enter your choice: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine();  // Consume newline
		            
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter the item to add: ");
		                    String newItem = scanner.nextLine();
		                    addItem(todoList, newItem);
		                    break;
		                case 2:
		                    System.out.print("Enter the item to remove: ");
		                    String itemToRemove = scanner.nextLine();
		                    removeItem(todoList, itemToRemove);
		                    break;
		                case 3:
		                    System.out.println("Goodbye!");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }

		    private static void listItems(ArrayList<String> todoList) {
		        if (todoList.isEmpty()) {
		            System.out.println("No items in the list.");
		        } else {
		            for (int i = 0; i < todoList.size(); i++) {
		                System.out.println((i + 1) + ". " + todoList.get(i));
		            }
		        }
		    }

		    private static void addItem(ArrayList<String> todoList, String item) {
		        todoList.add(item);
		        System.out.println("Item added: " + item);
		    }

		    private static void removeItem(ArrayList<String> todoList, String item) {
		        if (todoList.contains(item)) {
		            todoList.remove(item);
		            System.out.println("Item removed: " + item);
		        } else {
		            System.out.println("Item not found in the list.");
		        }
		    }
		}

	


