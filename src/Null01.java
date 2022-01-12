
public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		//文字数も同時に出力(あいうを入れたので3文字)
		System.out.println(string1 + "の文字数" + string1.length());
		
		//(0文字)
		string1 = "";
		System.out.println(string1 + "の文字数" + string1.length());
		
		//(nullを入れたのでNullPointerExceptionのエラー)
		string1 = null;
		System.out.println(string1 + "の文字数" + string1.length());
		
	}

}
