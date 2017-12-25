//複数のクラスをまとめる
package study;

//クラス宣言 publicはどのクラスからも使用できる
public class AppMain {
	//外に公開している静的な、戻り値のない、String配列を引数にもつmainという名前のメソッド
	public static void main(String[] args){
	//文字列を扱うためのクラス
	String word = "hello java";
	String jisan = "パスワード";
	String jisan_kuchiguse1 = "業務中";
	String jisan_kuchiguse2 = "やめ";
	String jisan_kuchiguse3 = "ましょう";
	String jisan_return_def = "gggggg";
	String jisan_return_plus = "aaaa";

	//実体を作る（インスタンス化）
	WordDecorated deco = new WordDecorated();
	//
	//deco.decorated(word);
	//String addword = deco.addword(word);
	//System.out.println(addword);
	//System.out.println(jisan);
	//deco.wasureta(jisan);
	//deco.hyouji(jisan_kuchiguse1,jisan_kuchiguse2,jisan_kuchiguse3);
	jisan_return_plus += jisan_return_def + jisan_kuchiguse1;

	//jisan_return += deco.Jreturn();

	//System.out.println(jisan_return_def);
	System.out.println(jisan_return_plus);

	}

}