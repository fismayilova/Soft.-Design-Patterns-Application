package Lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoorsWithHook extends HouseConstructionWithHook {

	public void build() {
		System.out.println("Choosing best fitting doors");
	}

	public void useMaterial() {
		System.out.println("Adding Extra Wood Decorations");
	}

	public boolean customerWantsExtraMaterial() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like any extra details (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}