//フォルダ名、関連のあるもので統一
package classjushoc;

//java.ioからクラスを呼び出す、BufferdReaderとInputStreamReaderを使用するため
import java.io.*;			
//java.utilからクラスを呼び出す、equlsを使用するため
import java.util.*;			

//classをMainと宣言、ファイル名と一致
public class Main{
	//最初に行われるString型のmainメソッド、例外処理時エラーを返す
	public static void main(String[] args)throws Exception{
		//整数型の変数と宣言
		int i=0;							
		//class Meiboを配列領域20(最大入力20件のため)としてインスタンス化
		Meibo[] mei=new Meibo[20];			
		//class Outをインスタンス化
		Out out=new Out();					
		//標準入力を引数としたInputStreamReaderをさらにそれを引数としたBufferedReaderでインスタンス化し、変数に格納
		//入力をできるようにするための準備
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//例外処理時catchに飛ぶ
		try{
			//無限ループ
			for(;;){
				//標準入力を変数に格納
				String line=br.readLine();	
				//入力が:listと等しいか判定
				if(line.equals(":list")){
					//mei配列とカウンタiを引数にoutListメソッドを呼び出し、今までの入力を出力
					out.outList(mei,i);		
				//ifが偽のとき入力と:exitが等しいか判定
				}else if(line.equals(":exit")){
					//無限ループを抜ける
					break;					
				//if,else if以外のとき処理を実行
				}else{
					//i>=20のとき処理を実行
					if(i>=20){
						//標準出力を行う
						System.out.println("error 20over");		
						//以降の処理を行わず繰り返し地点に戻る
						continue;								
					}
					//mei配列のi番目にMibo classをインスタンス化
					mei[i]=new Meibo();			
					//mei配列のi番目に引数lineのinListメソッドを呼び出し、登録項目ごとに分割したものを格納
					mei[i].inList(line);		
					//i=i+1の処理を実行
					i++;						
				}
			}
		//try内で例外処理時処理を実行
		}catch(Exception e){
			//標準出力を行う
			System.out.println("error");		
		}
	}
}
//プログラム終了

