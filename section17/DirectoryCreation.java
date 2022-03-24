package section17;

import java.io.File;

public class DirectoryCreation {

	public static void main(String[] args) {

		File directory = new File("udemy lesson");

		directory.mkdir();

		System.out.println("Directory created");

		File directory2 = new File("nirmal/silwal/udemy/java");

		directory2.mkdirs();

		System.out.println("multiple directory created");
	}
}
