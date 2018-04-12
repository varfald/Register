package register;

/**
 * register.Person register.
 */
public class Register {
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
	public Register(int size) {
		persons = new Person[size];
		count = 0;
	}

	/**
	 * Returns the number of persons in this register.
	 * 
	 * @return the number of persons in this register
	 */
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

	/**
	 * Returns the person at the specified position in this register.
	 * 
	 * @param index
	 *            index of the person to return
	 * @return person the person at the specified position in this register
	 */
	public Person getPerson(int index) {
		return persons[index];
	}

	/**
	 * Appends the specified person to the end of this register.
	 * 
	 * @param person
	 *            person to append to this register
	 */
	public void addPerson(Person person) {
		persons[count] = person;
		count++;
	}

	// TODO: Implement the method findPersonByName
	/**
	 * Returns the person with specified name in this register or <code>null</code>,
	 * if match can not be found.
	 * 
	 * @param name
	 *            name of a person to search for
	 * @return person with specified phone number
	 */
	public Person findPersonByName(String name) {
		for (int i = 0; i < count; i++) {
			if (persons[i].getName().equals(name)) {
				return persons[i];
			}
			
		}
		return null;
	}

	// TODO: Implement the method findPersonByPhoneNumber
	/**
	 * Returns the person with specified phone number in this register or
	 * <code>null</code>, if match can not be found.
	 * 
	 * @param phoneNumber
	 *            phone number of a person to search for
	 * @return person with specified phone number
	 */
	public Person findPersonByPhoneNumber(String phoneNumber) {
		for (int i = 0; i < count; i++) {
			if (persons[i].getPhoneNumber().equals(phoneNumber)) {
				return persons[i];
			}
			
		}
		return null;
		
		
		
		
	}

	// TODO: Implement the method removePerson
	/**
	 * Removes the specified person from the register.
	 * 
	 * @param person
	 *            person to remove
	 */
	public void removePerson(Person person) {
		for (int index = 0; index < count; index++) {
			if (person.equals(persons[index])) {
				System.arraycopy(persons, index + 1, persons, index, persons.length - index - 1);
				count--;

			}

		}

	}
}
