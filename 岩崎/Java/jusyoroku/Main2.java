//パッケージ名　jusyoroku　クラスを分類して整理するための仕組み
package jusyoroku;
	
//import文。ここで記述しておくことでプログラム中でパッケージ名を省略できる。
/*java.ioパッケージに含まれるBufferedReaderクラス。ここに含まれるメソッドを使用せず
	Scannerクラスのメソッドを使用していますので、ここでは必要ありませんでした*/
import java.io.BufferedReader;

/*java.ioパッケージに含まれるInputStreamReaderクラス。指定された所（System.in）から
	1文字分のデータを読みとる処理。BufferedReaderクラスを経由して使用（ラップ）して
	いましたので、ここでは必要ありませんでした*/
import java.io.InputStreamReader;

//java.utilパッケージに含まれるScannerクラス。テキスト入力を扱う。
import java.util.Scanner;


/*クラス名Main2　データと手続きをひとまとまりにしたもの。publicは「すべてのクラスからの
	参照を許可」という意味のアクセス修飾子。アクセス修飾子については、まだよく理解しておりません*/
public class Main2 {		
							
							
/*引数がString型の配列でstatic修飾子が付与されているmainというメソッドが、javaコマンド
	実行時に呼び出される。static修飾子が付与されていることでインスタンス化しなくても
	メソッドにアクセスできる。
	throwsは発生した例外を呼び出し元に任せる時に用いる。ここの場合は標準エラー出力に
	例外を表示する。Exceptionはjava.langパッケージに含まれる例外クラス（他にもExceptionを
	含むパッケージが複数あり、それぞれで役割が異なる？）。
	java.langパッケージはimportしなくてもコンパイラがimportしてくれるので、
	importせずにStringクラス、Systemクラス、Exceptionクラスが使用できる*/							
	public static void main (String[] args) throws Exception {		
		
/*InputStreamReaderクラスの引数にSystem.inを指定してインスタンス化したものをBufferedReader
	クラスの引数に指定してインスタンス化し、それをBufferedReaderクラスの変数 br に代入。
	ここでは必要ありませんでした*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
/*Scannerクラスの引数にSystem.inを指定してインスタンス化したものを、Scannerクラスの変数 in に代入。
	System.inは標準入力（System.inはjava.langパッケージに含まれるSystemクラスのstaticメンバ変数 in ）。
	staticメンバ変数については、まだよく理解しておりません*/
		Scanner in = new Scanner(System.in);
				
	// int型の変数 i の宣言と初期化。ループ時に配列と連動させるため。
		int i = 0;		
		
	/*String型の配列変数 n の宣言と、要素数の確保。
		「:list」「:exit」の判別を住所録に必要な情報を格納する変数とは別で行うため*/
		String n[] = new String[21];
					
	//String型の配列変数 name の宣言と、要素数の確保。情報「名前」の格納用。
		String name[] = new String[21];
			
	/*int型の配列変数 age の宣言と、要素数の確保。情報「年齢」の格納用。
		String型の配列変数 age2 から値を受け取る*/
		int age[] = new int[21];
		
	/*String型の配列変数 age2 の宣言と、要素数の確保。情報「年齢」の格納用。
		int型の配列変数 age へ値を受け渡す。入力待ちの際に age[i] = in.nextInt() とすれば、
		ここでは必要ありませんでした。*/
		String age2[] = new String[21];	
			
	//String型の配列変数 telno の宣言と、要素数の確保。情報「電話番号」の格納用。
		String telno[] = new String[21];
		
	//String型の配列変数 address の宣言と、要素数の確保。情報「住所」の格納用。
		String address[] = new String[21];
		

	//無限ループ開始
		while(true){						
	/*「:list」「:exit」判別のため、String型の変数 n への入力を独立。
		Scannerクラスのnext()メソッド（空白までの文字列を取得）を使用*/
			n[i] = in.next();					
			
	/*変数 n に入力された文字列が「:list」「:exit」でなかった場合下記の処理。
		equalsはStringクラスに含まれるメソッド*/
			if(!(n[i].equals(":list")) && !(n[i].equals(":exit"))){	
				
	/*変数 n に入力された情報を変数 name へコピー。substringはStringクラスに
		含まれるメソッド。*/
				name[i] = n[i].substring(0);					
			
	//変数をageとage2の2つ作成して変換しなくとも、age[i] = in.nextInt() とすれば数値で入力可能でした。
	//String型の変数 age2 に入力
				age2[i] = in.next();	
	/*String型の変数 age2 に入力された文字列を、int型の変数 age に数値に変換して代入。
		IntegerクラスのparseIntメソッドを使用*/
				age[i] = Integer.parseInt(age2[i]);	
		
	//String型の変数 telno に入力
				telno[i] = in.next();
	
	//String型の変数 address に入力
				address[i] = in.next();	
	
	//ループするごとに変数 i が1ずつ増える（各変数の配列と連動）
				i++;		
	
	//変数 n に入力された文字列が「:list」「:exit」でなかった場合の処理終了
			}		
		
		
	//変数 n に入力された文字列が「:list」だった場合下記の処理
			else if(n[i].equals(":list")){	
				
	//whileでループした回数分出力するためのint型の変数 s の宣言
				int s;	
							
	//whileでループした回数分まで下記の処理
				for(s = 0;s < i;s++){		
	//入力された情報を先頭に1から20までの番号を付けて出力。System.outは標準出力
					System.out.println(s+1 + " Name=" + name[s] + " Age=" + age[s] + " TelNo=" + telno[s] + " Address=" + address[s]);
										
	//whileでループした回数分の処理終了
				}			
	//変数 n に入力された文字列が「:list」だった場合の処理終了
			}					
					
	//変数 n に入力された文字列が「:exit」だった場合下記の処理
			else if(n[i].equals(":exit")){		
	//プログラム正常終了
				System.exit(0);				
	//変数 n に入力された文字列が「:exit」だった場合の処理終了
			}					
					
	//whileで20回より多くループした場合（20回より多く情報が入力された場合）下記の処理
			if(i > 20){				
	//「Error」を出力。System.errは標準エラー出力
				System.err.print("Error");	
	//プログラム異常終了
				System.exit(1);	
	//whileで20回より多くループした場合（20回より多く情報が入力された場合）の処理終了
			}	
						
	//無限ループ終了
		}		
	//mainメソッド終了
	}			
	//Mainクラス終了
}			
		