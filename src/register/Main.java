package register;

/**
 * Created by jaro on 3.2.2014.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Register register = new Register(20);

        register.addPerson(new Person("Janko Hrasko", "0900123456"));
        register.addPerson(new Person("Jozko Mrkvicka", "0905235312"));

        ConsoleUI ui = new ConsoleUI(register);
        ui.run();
        
    }
}
