import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentAttendanceDriver {
    public static void main(String[] args){
        Scanner inFile = null;
        ArrayList<StudentAttendance> attendanceArr= new ArrayList<>();
        String studentRecord;

        // PART B TASK 2
        try{
            inFile = new Scanner(new File("E:\\Desktop\\Java Programs\\TerminalExam\\src\\attendance.txt"));
            while (inFile.hasNextLine()){
                studentRecord = "";
                studentRecord = inFile.nextLine();
                String[] studentRecordArr = studentRecord.split(" ");

                attendanceArr.add(new StudentAttendance(studentRecordArr[0], studentRecordArr[1] + " " + studentRecordArr[2], studentRecordArr[3] ));
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            inFile.close();
        }

        System.out.println("Before Sorting");
        for(StudentAttendance e : attendanceArr){
            System.out.println(e.toString());
        }

        // PART B TASK 3
        System.out.println("After Sorting");
        Collections.sort(attendanceArr);
        for(StudentAttendance e : attendanceArr){
            System.out.println(e.toString());
        }

    }
}
