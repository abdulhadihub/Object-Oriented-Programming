import java.io.Serializable;
import java.util.Comparator;

// SP21-BCS(A)-045-ABDUL HADI
public class Pet implements Serializable, Comparable<Pet> {
    // INSTANCE VARIABLES
    String name;
    int age;
    double weight;

    // GETTER AND SETTER METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // THREE PARAMETER CONSTRUCTOR
    public Pet(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // NO-PARAMETER CONSTRUCTOR
    public Pet(){
        this(null, 0, 0);
    }

    // toString METHOD TO DISPLAY EACH OBJECT DETAILS
    @Override
    public String toString(){
        return("Name: " + this.getName() + " Age: " + this.getAge() + " Weight: " + this.getWeight() + "Kg");
    }

    // USING COMPARABLE INTERFACE TO SORT BY AGE
    @Override
    public int compareTo(Pet p){
        return (this.age - p.age);
    }

}

// USING COMPARATOR INTERFACE TO SORT BY NAME AS WELL AS AGE
class NameComparator implements Comparator<Pet>{
    @Override
    public int compare(Pet p1, Pet p2){
        return(p1.getName().compareTo(p2.getName()));
    }
}

