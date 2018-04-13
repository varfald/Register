package register;

import java.util.Iterator;

/**
 * register.Person register.
 */
public class ArrayRegister implements Register {
	/** register.Person array. */
	private Person[] persons;

	/** Number of persons in this register. */
	private int count;

	/**
	 * Constructor creates an empty register with maximum size specified.
	 * 
	 * @param size
	 *            maximum size of the register
	 */
	public ArrayRegister(int size) {
		persons = new Person[size];
		count = 0;
	}

	/* (non-Javadoc)
	 * @see register.Register#getCount()
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * Returns the maximum number of persons in this register.
	 * 
	 * @return the maximum number of persons in this register.
	 */
	public int getSize() {
		return persons.length;
	}

	/* (non-Javadoc)
	 * @see register.Register#getPerson(int)
	 */
	@Override
	public Person getPerson(int index) {
		return persons[index];
	}

	/* (non-Javadoc)
	 * @see register.Register#addPerson(register.Person)
	 */
	@Override
	public void addPerson(Person person) {
		persons[count] = person;
		count++;
	}

	
	/* (non-Javadoc)
	 * @see register.Register#findPersonByName(java.lang.String)
	 */
	@Override
	public Person findPersonByName(String name) {
		for (int i = 0; i < count; i++) {
			if (persons[i].getName().equals(name)) {
				return persons[i];
			}
			
		}
		return null;
	}

	
	/* (non-Javadoc)
	 * @see register.Register#findPersonByPhoneNumber(java.lang.String)
	 */
	@Override
	public Person findPersonByPhoneNumber(String phoneNumber) {
		for (int i = 0; i < count; i++) {
			if (persons[i].getPhoneNumber().equals(phoneNumber)) {
				return persons[i];
			}
			
		}
		return null;
		
		
		
		
	}

	
	/* (non-Javadoc)
	 * @see register.Register#removePerson(register.Person)
	 */
	@Override
	public void removePerson(Person person) {
		for (int index = 0; index < count; index++) {
			if (person.equals(persons[index])) {
				System.arraycopy(persons, index + 1, persons, index, persons.length - index - 1);
				count--;

			}

		}

		
	}
	
	
	
}
