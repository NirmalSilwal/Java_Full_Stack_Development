package section17;

import java.io.File;
import java.io.IOException;

public class FileCreationOnDisk {

	public static void main(String[] args) throws IOException {

		File file = new File("src/section17/testFile8.txt");

		file.createNewFile();
		
		System.out.println("File created");
	}

}
