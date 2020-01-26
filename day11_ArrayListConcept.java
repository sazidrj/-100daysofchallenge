import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee{
    String name;
    int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

}
public class day11_ArrayListConcept {
    public static void main(String arg[]){
        //Dynamic array - ArrayList
        //can contain duplicate values
        //maintain insertion order
        //not synchronized - that is why slow
        //allow random access of element because it store element on the basis of indexes.

        ArrayList arr1 = new ArrayList();
        arr1.add(2);
        arr1.add("Sazid");
        arr1.add(3.4);

        System.out.println(arr1.size());//print size of the array list
        System.out.println(arr1.get(0)); // to get value at index 0

        //Non-generic vs generic
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<String> arr3 = new ArrayList<String>();

        Employee emp1 = new Employee("Sazid", 21);
        Employee emp2 = new Employee("Shalsa", 21);
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(emp1);
        emp.add(emp2);
        Iterator<Employee> it = emp.iterator();
        while(it.hasNext()){
            Employee ep = it.next();
            System.out.println(ep.name);
            System.out.println(ep.age);

        }
        System.out.println("*********");
        //addAll()
        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<String>();
        s1.add("Sazid");
        s1.add("Ali");
        s2.add("Shalsa");
        s2.addAll(s1);
        for(int i=0; i<s2.size(); i++){
            System.out.println(s2.get(i));
        }
        System.out.println("*********");
        //removeAll()
        s2.removeAll(s1);
        for(int i=0; i<s2.size(); i++){
            System.out.println(s2.get(i));
        }
        System.out.println("*********");

        //retailAll()
        ArrayList<String> s3 = new ArrayList<String>();
        s3.add("Sammy");
        s3.add("sazidALi");
        s3.add("test");

        ArrayList<String> s4 = new ArrayList<String>();
        s4.add("saxid");
        s4.add("test");

        s4.retainAll(s3);
        for(int i=0; i<s4.size(); i++){
            System.out.println(s4.get(i)); //Only commen string will print
        }
    }
}
