package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        String searchResult = "PETITE Navy Paisley Midi Dress";
        List<String> results = List.of("abc","xyz");

        //results.add(1);
        List<Integer> numbers = List.of(1,2,3);
        long salaryLimit = 40000;
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Sai",30000));
        employees.add(new Employee(20,"Susan",50000));
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getSalary()>salaryLimit){
                System.out.println(employees.get(i));
            }
        }

        for(Employee e: employees){
            if(e.getSalary()>salaryLimit){
                System.out.println(e);
            }
        }

        employees.stream().filter(e->e.getSalary()>salaryLimit).forEach(emp-> System.out.println(emp));

      /*  String searchWord = "DRESS";
        System.out.println(searchResult.toLowerCase());
        if(searchResult.toUpperCase().contains(searchWord.toUpperCase())){
            System.out.println("inside");
        }*/
    }
}
