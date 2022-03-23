package addressBookSystem_CSV_JSON;

/**
 * Import all java FileIO Packages
 */
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import addressBookSystem_CSV_JSON.AddressBookMain.IOService;

/**
 * 
 * @author Rachoti Create class AddressBookFileIO
 *
 */

public class AddressBookFileIO {

	/**
	 * Create map Key and value separately
	 */

	private Map<String, Person> contactMap = new HashMap<>();
	private static final String FILE_NAME = "addressbookfile.txt";

	public AddressBookFileIO(Map<String, Person> contactMap) {
		this.contactMap = contactMap;
	}

	/**
	 * 
	 * @param ioService writeAddressBookFile
	 */

	public void writeAddressBookFile(IOService ioService) {
		Path filePath = Paths.get(FILE_NAME);
		if (ioService.equals(IOService.FILE_IO)) {
			StringBuffer addrsBuffer = new StringBuffer();
			contactMap.values().forEach(address -> {
				String addressDataString = address.toString();
				addrsBuffer.append(addressDataString);
			});

			/**
			 * try block through the Exception
			 */

			try {
				Path write1 = Files.write(filePath, addrsBuffer.toString().getBytes(), StandardOpenOption.WRITE);
				System.out.println(write1.toUri().getPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @param ioService countEntries catch block through the IOException e
	 */

	public void countEntries(IOService ioService) {
		Path filePath = Paths.get(FILE_NAME);
		if (ioService.equals(IOService.FILE_IO)) {
			try {
				System.out.println("Total Entries in File: " + Files.lines(filePath).count());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}