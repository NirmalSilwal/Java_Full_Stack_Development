package section12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {

	private String name;

	Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length())
			return 0;
		else if (name.length() < obj.name.length()) {
			return -1;
		} else
			return 1;
	}

	@Override
	public String toString() {
		return this.name;
	}
}

public class App {

	void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {

		List<Names> names = new LinkedList<>();
		
		names.add(new Names("Nirmala"));
		names.add(new Names("Dinesh"));
		names.add(new Names("Kamalesh"));
		names.add(new Names("Anand"));

		App app = new App();

		app.printList(names);

		// now sorting the list, as we override compareTo method, it will sort on the
		// basis of our logic there as per the length of the string

		Collections.sort(names); // this will invoke compareTo()

		app.printList(names);
	}

}
