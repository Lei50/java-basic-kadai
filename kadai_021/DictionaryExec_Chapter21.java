package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 例として単語の配列を使います。ユーザー入力などで変更することも可能です。
		String[] words = { "peach", "apple", "orange" };
		dictionary.translateAndPrint(words);
	}
}