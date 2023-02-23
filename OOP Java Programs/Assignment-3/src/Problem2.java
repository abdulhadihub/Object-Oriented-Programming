import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// SP21-BCS(A)-045-ABDUL HADI

public class Problem2 {

    public static void main(String[] args){

        Scanner localInput = new Scanner(System.in);
        System.out.println("Welcome to Pet records management System.");
        int option;

        // ARRAY LIST TO STORE RECORDS THAT ARE ADDED USING addRecord FUNTION
        ArrayList<Pet> pets = new ArrayList<Pet>();
//        pets.add(new Pet("cat", 2, 5.5));
//        pets.add(new Pet("dog", 5, 5.5));
//        pets.add(new Pet("lion", 6, 5.5));
//        pets.add(new Pet("hamster", 3, 5.5));
//        pets.add(new Pet("eagle", 10, 5.5));

        // DO-WHILE LOOP FOR USER INTERFACE
        do{
            System.out.print("\n");
            System.out.println("1. Display all Pet records");
            System.out.println("2. Write all Pet records to file");
            System.out.println("3. Write all Pet records sorted by age to file");
            System.out.println("4. Write all Pet records sorted by name to the file");
            System.out.println("5. Exit Program");
            System.out.print("\nSelect option number: ");

            option = localInput.nextInt();

            switch (option){
                case 1:
                    System.out.println("1. Display all Pet records");
                    // DISPLAY ALL RECORDS STORED IN "pets.dat" FILE
                    displayRecords(pets);
                    break;
                case 2:
                    System.out.println("2. Write all Pet records to file");
                    // addRecord ALLOWS THE USER TO ENTER RECORDS UPTO RECORD LIMIT
                    addRecord(pets);
                    // writeAllRecords WRITES ALL THE RECORDS STORED IN PETS ARRAY LIST TO "pets.dat" FILE
                    writeAllRecords(pets);
                    System.out.println("File Write operation completed");
                    break;
                case 3:
                    System.out.println("3. Write all Pet records sorted by age to file");
                    // addRecord ALLOWS THE USER TO ENTER RECORDS UPTO RECORD LIMIT
                    addRecord(pets);
                    // WRITES RECORDS AFTER SORTING THEM BY AGE USING compareTo() FROM Comparable INTEFACE
                    writeAgeSortedRecords(pets);
                    System.out.println("Age Sorted records writing completed");
                    break;
                case 4:
                    System.out.println("4. Write all Pet records sorted by name to the file");
                    // addRecord ALLOWS THE USER TO ENTER RECORDS UPTO RECORD LIMIT
                    addRecord(pets);
                    // WRITES RECORDS AFTER SORTING THEM BY NAME USING compare() FROM Comparator INTEFACE
                    writeNameSortedRecords(pets);
                    System.out.println("Name Sorted records writing completed");
                    break;
                case 5:
                    // EXIT USER INTERFACE
                    System.out.println("5. Exit Program");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while (option != 5);



    }
    // DISPLAY ALL RECORDS STORED IN "pets.dat" FILE
    public static void displayRecords(ArrayList<Pet> pets){
        ObjectInputStream input = null;
        String inFile = "E:\\Desktop\\Java Programs\\Assignment-3\\src\\pets.dat";

        try{
            input = new ObjectInputStream(new FileInputStream(inFile));
            try{
                pets.clear(); // CLEARS ARRAY LIST SO THAT ONLY RECORDS STORED IN "pets.dat" FILE ARE DISPLAYED
                while (true) {
                        pets.add((Pet) input.readObject()); // ADDING RECORD TO ARRAY LIST AFTER DOWNCASTING
                }
            }
            catch (EOFException e){ // USING EOFException TO CHECK FOR END OF FILE
                input.close();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            int i = 1;
            for(Pet pet : pets){
                System.out.println(i + ". " + pet.toString());
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // writeAllRecords WRITES ALL THE RECORDS STORED IN PETS ARRAY LIST TO "pets.dat" FILE
    public static void writeAllRecords(ArrayList<Pet> pets){
            ObjectOutputStream output = null;
            String outFile = "E:\\Desktop\\Java Programs\\Assignment-3\\src\\pets.dat";
            try{
                output = new ObjectOutputStream(new FileOutputStream(outFile));
                for(Pet pet : pets){
                    output.writeObject(pet);
                }
                output.close();
            }
            catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
    }
    // WRITES RECORDS AFTER SORTING THEM BY AGE USING compareTo() FROM Comparable INTEFACE
    public static void writeAgeSortedRecords(ArrayList<Pet> pets){
        Collections.sort(pets);
        writeAllRecords(pets);
    }

    // WRITES RECORDS AFTER SORTING THEM BY NAME USING compare() FROM Comparator INTEFACE
    public static  void writeNameSortedRecords(ArrayList<Pet> pets){
        Collections.sort(pets, new NameComparator());
        writeAllRecords(pets);
    }

    // addRecord ALLOWS THE USER TO ENTER RECORDS UPTO RECORD LIMIT
    public static void addRecord(ArrayList<Pet> pets){
        Scanner input = new Scanner(System.in);
        System.out.print("How many records do you wish to enter: ");
        int entries = input.nextInt();
        if(entries > recordLimit){ // CHECKING IF THE USER CAN MAKE VALID NUMBER OF ENTRIES
            System.out.println("You cannot make more than " + recordLimit + " entries");
            return;
        }
        int i = 0;

        while (i < entries){
        if(pets.size() < recordLimit){
        String whiteSpace = input.nextLine();
        System.out.println("Enter pet name: ");
        String name = input.nextLine();
        System.out.println("Enter pet age: ");
        int age = input.nextInt();
        System.out.println("Enter pet weight: ");
        double weight = input.nextDouble();
        pets.add(new Pet(name, age, weight));
        }
        else{
            System.out.println("Maximum record limit reached");
            break;
        }
        i++;
        }
    }
    static int recordLimit = 5; // RECORD LIMIT CAN BE CHANGED HERE

}
