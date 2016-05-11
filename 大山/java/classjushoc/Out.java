//フォルダ名、関連のあるもので統一
package classjushoc;

//class Outを宣言
public class Out{
	//戻り値を持たないで配列の変数と整数型の変数を引数にもつoutListメソッドで今までの入力を出力
	public void outList(Meibo[] mei,int n){
		//i<nのとき、{}の中の処理を行い、i=i+1をするという処理を繰り返す。配列の中身を順次出力するため
		for(int i=0;i<n;i++){
			//配列meiに格納されているi番目のメンバー変数を出力
			System.out.println(i+1+" "+mei[i].name+" "+mei[i].age+" "+mei[i].tel+" "+mei[i].add);
		}
	}
}

	