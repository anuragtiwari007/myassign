package OptionalExample;

import java.util.Optional;

public class RemoveNullPointerException {

	public static void main(String args[]) {
		String names[] = new String[5];
		Optional<String> checkNull=Optional.ofNullable(names[4]);
		if(checkNull.isPresent()) {
			System.out.print(names[0].length());
		}
		else {
			System.out.println("String array is empty");
		}

	}
}