import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map.Entry;

class Employee{
    String name;
    int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

}
public class day13_HashmapConcept {
    public static void main(String arg[]){

        //HashMap is a class that implements MapInterface
        //extends AbstractMap
        //It contains only unique element
        //It stores the key-value pair
        //It may have one null key and multiple null values
        //It maintains no order
        //Not synchronized that is it not thread safe

        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "Sazid");
        hash.put(2, "Shalsa");
        hash.put(3, "ali");
        System.out.println(hash.get(1));

        for(Entry en : hash.entrySet()){
             System.out.println(en.getKey()+ " "+ en.getValue());
        }
        HashMap<Integer, Employee> hash2 = new HashMap<Integer, Employee>();
        Employee e1 = new Employee("sazid", 21);
        Employee e2 = new Employee("shalsa", 21);
        hash2.put(1,e1);
        hash2.put(2,e2);
        for(Entry<Integer, Employee> en2: hash2.entrySet()){
             int key = en2.getKey();
             Employee emp = en2.getValue();
             System.out.println(key);
             System.out.println(emp.name+ " " + emp.age );
        }
    }
}
