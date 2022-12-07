package org.example;

import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.io.FileReader;

/**
 * Main class, where we generate the list from the source csv file.
 */
public class Main {
    /**
     * Function to print our list.
     * @param list - list that we first generate from a csv file, then print.
     */
    public static void printFullInfo(ArrayList<Person> list){
        for(Person elem : list){
            System.out.print(elem.getID() + ", " + elem.getName() + ", " + elem.getGender() + ", " +
                    elem.getBirthday() + ", [" + elem.getDiv().getName() + ", " + elem.getDiv().getID() +
                    "], " + elem.getSalary() + "\n");
        }
    }

    /**
     * Function to check if there is already such a division, so as not to create copies.
     * @param div - Division to check if there is one.
     * @param list - List of existing divisions.
     * @return An already existing division, if one was found, or null, if not found.
     */
    public static Division isDivisionIn(Division div, ArrayList<Division> list){
        for(Division element : list){
            if(element.getName().equals(div.getName())){
                return element;
            }
        }
        return null;
    }

    /**
     * Main function where we read from a csv file into a list.
     * @param args - Default.
     */
    public static void main(String[] args){
        ArrayList<Division> divs = new ArrayList<Division>();
        ArrayList<Person> list = new ArrayList<Person>();

        String path = "E:/Java Labs/Collection2/src/main/resources/foreign_names.csv";
        try{
            CSVReader reader = new CSVReader(new FileReader(path));
            String[] nextLine;
            String str;
            while((nextLine = reader.readNext()) != null){
                str = nextLine[0];
                nextLine = str.split(";");
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthday = nextLine[3];
                Division div = new Division(nextLine[4]);
                if(isDivisionIn(div, divs) == null){
                    divs.add(div);
                }
                else{
                    div = isDivisionIn(div, divs);
                }
                int salary = Integer.parseInt(nextLine[5]);
                Person person = new Person(id, name, gender, birthday, div, salary);
                list.add(person);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        printFullInfo(list);
        System.out.println("CSV Read Complete");
    }

}