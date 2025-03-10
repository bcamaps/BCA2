package java_lab_a3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JAVA_LAB_A3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add elements");
            System.out.println("2. Sort elements");
            System.out.println("3. Replace an element");
            System.out.println("4. Remove an element");
            System.out.println("5. Display all elements");
            System.out.println("6. Add an element between two elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = scanner.nextInt();
                    arrayList.add(elementToAdd);
                    System.out.println("Element added successfully.");
                    break;
                case 2:
                    Collections.sort(arrayList);
                    System.out.println("Elements sorted successfully.");
                    break;
                case 3:
                    System.out.print("Enter the index of the element to replace: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < arrayList.size()) {
                        System.out.print("Enter the new element: ");
                        int newElement = scanner.nextInt();
                        arrayList.set(index, newElement);
                        System.out.println("Element replaced successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of the element to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                        arrayList.remove(indexToRemove);
                        System.out.println("Element removed successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.println("All elements: " + arrayList);
                    break;
                case 6:
                    System.out.print("Enter the index where you want to add the element: ");
                    int addIndex = scanner.nextInt();
                    if (addIndex >= 0 && addIndex <= arrayList.size()) {
                        System.out.print("Enter the element to add: ");
                        int element = scanner.nextInt();
                        arrayList.add(addIndex, element);
                        System.out.println("Element added successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
