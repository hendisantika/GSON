/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hendi.gson.ui;

import java.util.Arrays;

/**
 *
 * @author Uchiha Itachi
 */
public class AppLauncher {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Hendi Santika");
        person.setAge(26);
        person.setMessage(Arrays.asList("Uzumaki Naruto", "Uchiha Sasuke", "Hatake Kakashi", "Jackson Michael"));

        String jsonCompact = JsonUtil.convertPersonToJson(person, false);
        System.out.println("Json compact:");
        System.out.println(jsonCompact);


        String jsonPretty = JsonUtil.convertPersonToJson(person, true);
        System.out.println("\nJson prettyprint:");
        System.out.println(jsonPretty);

        Person fromJson = JsonUtil.getPersonFromJson(jsonPretty);
        System.out.println(fromJson);
    }
    
}
