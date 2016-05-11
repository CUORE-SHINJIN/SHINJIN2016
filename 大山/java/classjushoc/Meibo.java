//フォルダ名、関連あるもので統一
package classjushoc;

//classをMeiboとして宣言
public class Meibo{
	//メンバー変数は0で初期化、登録項目の決定
	//文字列型の変数として宣言
	String name;			
	//整数型の変数として宣言
	int age;				
	//文字列型の変数として宣言
	String tel;				
	//文字列型の変数として宣言
	String add;				
	//戻り値を持たない引数line(標準入力)を持ったinListメソッドでlineの中を項目ごとに分割
	public void inList(String line){
		//変数lineの中身をスペースごとに分割し、文字列型配列の変数tesに格納
		String[] tes=line.split(" ",0);			
		//このクラス自身の変数に配列tes[0](最初の文字からスペースまで)を格納
		this.name=tes[0];						
		//このクラス自身の変数に配列tes[1](次の文字からスペースまで)を文字列型から整数型にキャスト変換して格納
		this.age=Integer.parseInt(tes[1]);		
		//このクラス自身の変数に配列tes[2](次の文字からスペースまで)を格納
		this.tel=tes[2];						
		//このクラス自身の変数に配列tes[3](次の文字からスペースまで)を格納
		this.add=tes[3];						
	}
}