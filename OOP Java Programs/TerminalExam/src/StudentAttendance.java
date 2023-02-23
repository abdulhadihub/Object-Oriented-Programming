public class StudentAttendance implements Comparable<StudentAttendance>{

    // PART B TASK 1
    private String roll;
    private String name;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public StudentAttendance(){
        this("BBBB-PPP-RRR", "Student Name", "dd-mm-yyyy");
    }

    public StudentAttendance(String roll, String name, String date){
        this.roll = roll;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString(){
        return (roll + " " + name + " " + date);
    }

    // COMPARE TO METHOD FOR PART B TASK 3
    @Override
    public int compareTo(StudentAttendance s) {
        return this.getName().compareTo(s.getName());
    }

}
