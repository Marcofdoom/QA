package hashmapexercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

	private HashMap<String, String> morseCode;

	private String testMorse = ". .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

	public static void main(String args[]) {
		new Main();
	}

	public Main() {
		createMorseCodeList();
		translateMorseToString(testMorse);
	}

	public void translateMorseToString(String morse) {
		List<String> morseString = Arrays.asList(morse.split(" "));

		StringBuilder stringBuilder = new StringBuilder();

		morseString.stream().forEach(x -> stringBuilder.append(morseCode.get(x)));

		System.out.println(stringBuilder.toString());
	}

	private void createMorseCodeList() {
		morseCode = new HashMap<String, String>();
		morseCode.put(".-", "a");
		morseCode.put("-...", "b");
		morseCode.put("-.-.", "c");
		morseCode.put("-..", "d");
		morseCode.put(".", "e");
		morseCode.put("..-.", "f");
		morseCode.put("--.", "g");
		morseCode.put("....", "h");
		morseCode.put("..", "i");
		morseCode.put(".---", "j");
		morseCode.put("-.-", "k");
		morseCode.put(".-..", "l");
		morseCode.put("--", "m");
		morseCode.put("-.", "n");
		morseCode.put("---", "o");
		morseCode.put(".--.", "p");
		morseCode.put("--.-", "q");
		morseCode.put(".-.", "r");
		morseCode.put("...", "s");
		morseCode.put("-", "t");
		morseCode.put("..-", "u");
		morseCode.put("...-", "v");
		morseCode.put(".--", "w");
		morseCode.put("-..-", "x");
		morseCode.put("-.--", "y");
		morseCode.put("--..", "z");
		morseCode.put("/", " ");
	}
}