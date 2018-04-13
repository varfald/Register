package register;

/**
 * Created by jaro on 3.2.2014.
 */
public class Main {

    public static void main(String[] args) throws Exception {
    	ArrayRegister register = new ArrayRegister(20);
        ListRegister register1 = new ListRegister ();

        register.addPerson(new Person("Janko Hrasko", "0900123456"));
        register.addPerson(new Person("Jozko Mrkvicka", "0905235312"));
        register.addPerson(new Person ("Dusan Novy", "0917567324"));
        
        register1.addPerson(new Person("Janko Fazula", "0900123456"));
        register1.addPerson(new Person("Jozko Tekvica", "0905235312"));
        register1.addPerson(new Person ("Dusan Stary", "0917567324"));
        
        
        
        ConsoleUI ui = new ConsoleUI(register1);
      //  register1.deleteAllBy('J');
        ui.run();
        
    }
}
