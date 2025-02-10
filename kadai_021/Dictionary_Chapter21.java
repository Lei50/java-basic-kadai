package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> library;

	public Dictionary_Chapter21() {
		library = new HashMap<>();
		library.put("apple", "りんご");
		library.put("peach", "もも");
		library.put("banana", "バナナ");
		library.put("lemon", "レモン");
		library.put("pear", "梨");
		library.put("kiwi", "キウイ");
		library.put("strawberry", "いちご");
		library.put("grape", "ぶどう");
		library.put("muscat", "マスカット");
		library.put("cherry", "さくらんぼ");
	}

	public void translateAndPrint(String[] words) {
		for (String word : words) {
			if (library.containsKey(word)) {
				System.out.println(word + "の意味は" + library.get(word) + "です");
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}