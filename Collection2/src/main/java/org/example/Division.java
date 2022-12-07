package org.example;

/**
 * Division class with fields: ID, name of division.
 */
public class Division {
    int ID;
    String name;

    /**
     * Constructor, where we generate ID randomly.
     * @param _name parameter of constructor - name of division.
     */
    public Division(String _name){
        int max = 100000;
        int min = 10;
        ID = (int)Math.floor(Math.random()*(max-min+1)+min);
        name = _name;
    }

    /**
     * Function to get the division's ID.
     * @return division's ID.
     */
    public int getID(){
        return ID;
    }
    /**
     * Function to get the division's name.
     * @return division's name.
     */
    public String getName(){
        return name;
    }
}
