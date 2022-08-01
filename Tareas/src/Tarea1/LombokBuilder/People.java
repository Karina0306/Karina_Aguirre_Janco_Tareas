package Tarea1.LombokBuilder;

/**
 * This class get the information of the people.
 * show the greeting of the people.
 */
public class People {
    public int age;
    private String name;
    private String lastName;
    private String GREET="hello";

    /**
     * This method is the constructor of the class.
     *
     * @param age is the age of the people.
     * @param name is the name of the people.
     * @param lastName is the lastNme of the people.
     */
    public People(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * This method show the greeting of the people.
     *
     * @return the greeting.
     */
    public String greet(){
        return GREET+" my name is "+name;
    }
}
