package org.example;

/**
 * Person class with fields: id, name, gender, division, salary, date of birth.
 */
public class Person {
    int ID;
    String name;
    String gender;
    String birthday;
    Division div;
    int salary;

    /**
     * Constructor with required parameters.
     */
    public Person(int _ID, String _name, String _gender, String _birthday, Division _div, int _salary){
        ID = _ID;
        name = _name;
        gender = _gender;
        birthday = _birthday;
        div = _div;
        salary = _salary;
    }

    /**
     * Function to get the person's ID.
     * @return person's ID.
     */
    public int getID(){
        return ID;
    }
    /**
     * Function to get the person's name.
     * @return person's name.
     */
    public String getName(){
        return name;
    }
    /**
     * Function to get the person's gender.
     * @return person's gender.
     */
    public String getGender(){
        return gender;
    }
    /**
     * Function to get the person's birthday.
     * @return person's birthday.
     */
    public String getBirthday(){
        return birthday;
    }
    /**
     * Function to get the person's division.
     * @return person's division.
     */
    public Division getDiv(){
        return div;
    }
    /**
     * Function to get the person's salary.
     * @return person's salary.
     */
    public int getSalary(){
        return salary;
    }
}
