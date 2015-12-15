/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hendi.gson.ui;

import java.util.List;

/**
 *
 * @author Uchiha Itachi
 */
public class Person {
    private String name;
    private int age;
    private List<String> message;

    public Person() {
    }

    public Person(String name, int age, List<String> message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }

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

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("name: %s\n", name));
        buffer.append(String.format("age: %d\n", age));
        buffer.append("message:\n");
        if (null != message) {
            for (String msg : message) {
                buffer.append(String.format("\t%s\n", msg));
            }
        }
        return buffer.toString();
    }
    
}
