public class Driver {
	public static void main(String[] args) {
		PhoneBook patriots = new PhoneBook();
		System.out.println("Test the add and printList methods:");
		patriots.add(new Person("White","James","28"));
		patriots.add(new Person("McCourty","Devin","32"));
		patriots.add(new Person("McCourty","Jason","30"));
    patriots.add(new Person("Hightower","Dont'a","54"));
    patriots.add(new Person("Edelman","Julian","11"));
		patriots.printList();
		System.out.println("Test the find method:");
		System.out.println(patriots.find("McCourty"));
		System.out.println("\nTest the add and remove methods: (remove David Andrews)");
		Person camN = new Person("Newton","Cam","1");
    Person steG = new Person("Gilmore","Stephon","24");
    Person davA= new Person("Andrews","David","60");
		patriots.add(camN);
    patriots.add(steG);
    patriots.add(davA);
		patriots.printList();
	  patriots.remove(davA);
		patriots.printList();

	} // end main
}// end class
