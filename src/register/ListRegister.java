package register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRegister implements Register {
	
	private List<Person> persons = new ArrayList<> ();

	@Override
	public int getCount() {
		return persons.size();
	}

	@Override
	public Person getPerson(int index) {
		return persons.get(index);
	}

	@Override
	public void addPerson(Person person) {
		persons.add(person);
		
	}

	@Override
	public Person findPersonByName(String name) {
		
		for (Person p : persons) {
		if (p.getName().equals(name)) {
			return p;
		}
		
		}
		
		return null;
	}

	@Override
	public Person findPersonByPhoneNumber(String phoneNumber) {
		for (Person person : persons) {
			if (person.getPhoneNumber().equals(phoneNumber)) {
				return person;
			}
		}
		return null;
	}

	@Override
	public void removePerson(Person person) {
		persons.remove(person);
		
		
	}
	public void deleteAllBy (char firstLetter) {
		Iterator<Person> iterator = persons.iterator();
		Person p;
		String firstLet = Character.toString(firstLetter);
		while (iterator.hasNext()) {
			 p = iterator.next();
			if (p.getName().startsWith(firstLet)) {
				iterator.remove();
				
				
				
				
			}
			
		}
	}
	
	public List<Person> findAllPersonByNameContains (String nameContains) {
		List<Person> nameByContain = new ArrayList<> ();
		Iterator<Person> iterator = persons.iterator();
		Person p;
		while (iterator.hasNext()) {
			p = iterator.next();
			if (p.getName().contains(nameContains)) {
			nameByContain.add(p);	
			return nameByContain;	
			}
		}
		return null;
	}


}
