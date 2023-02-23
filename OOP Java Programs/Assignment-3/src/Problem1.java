import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// SP21-BCS(A)-045-ABDUL HADI

public class Problem1 {
    public static void main(String[] args){

        // USER PROMPT TO ENTER INPUT FILE NAME
        Scanner userInput = new Scanner(System.in);
        String inputFile = "E:\\Desktop\\Java Programs\\Assignment-3\\src\\";
        System.out.print("Please enter input file name: ");
        inputFile += userInput.nextLine();

        // DECLARATIONS
        Scanner input = null;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> numList2 = new ArrayList<Integer>();

        try {
            input = new Scanner(new File(inputFile));

            while (input.hasNextInt()){ // ADDING ALL NUMBERS FROM INPUT FILE TO ARRAYLIST
                int num1 = input.nextInt();
//                    System.out.println(num1);
                numList.add(num1);
            }
            System.out.println("File input complete");
            input.close();

            // FOR LOOP TO REMOVE DUPLICATES AND STORE UNIQUE VALUES IN numList2
            for(int i = 0; i < numList.size(); i++){
                if (i == numList.size()-1){ // ADD LAST ELEMENT TO numList2
                    numList2.add(numList.get(i));
//                System.out.println(numList.get(i));
                    continue;
                }
                if(numList.get(i) != numList.get(i+1)){ // ONLY ADDS UNIQUE VALUES TO numList2
                    numList2.add(numList.get(i));
//                System.out.println(numList.get(i));
                }
            }
            System.out.println("Removed Duplicates");

            // REVERSE ORDER OF ELEMENTS USING COLLECTIONS.SORT()
            Collections.sort(numList2, Collections.reverseOrder());
            System.out.println("Reversed List Order");
//        for(int i = 0; i < numList2.size(); i++){
//            System.out.println(numList2.get(i));
//        }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        // USER PROMPT TO ENTER OUTPUT FILE NAME
        String outputFile = "E:\\Desktop\\Java Programs\\Assignment-3\\src\\";
        System.out.print("Please enter output file name: ");
        outputFile += userInput.nextLine();
        PrintWriter output = null;
        try {
            output = new PrintWriter(outputFile);
            for(int i = 0; i < numList2.size(); i++){
                output.println(numList2.get(i)); // WRITE ALL ELEMENTS OF numList2 TO OUTPUT FILE
            }
            System.out.println("File Writing Complete");
            output.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
