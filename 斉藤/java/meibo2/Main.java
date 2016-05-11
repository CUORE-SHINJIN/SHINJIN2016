package meibo2;/*パッケージ名*/

import java. io. BufferedReader;
import java. io. InputStreamReader;
	//標準入出力で使用
class Syain{
	public String name,tel,ado;
	public int age;
	public Syain(String name, int age, String tel, String ado){
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.ado = ado;
	}
}
//問題点：クラスを分けてみたものの実際直していくうちにMainだけで動いている状態に…?(振り出しに戻っている)

/**
*考えること
*①何の処理をクラス分けしたいのか(初期の構想では構造体にあたるものが上のクラスにあった)
*②そのためには引数は何になるか
*③呼び出すときのインスタンス化(?)はどうすればいいのか
*(午前はこれ↑に悩んでいた)
*④「static」「public」って何？
*⑤this.～も不明。
*気を付けること
*・手直しするよりはじめから作り直した方が多分混乱しない
*・C言語で作ったソースをよく見直す
*参考にしたソース↓(次は別のものがいいかもしれない)
*http://homepage3.nifty.com/teranet/jac/JavaAndC.html
*メモ：javaでポインタ関数にあたるものを調べる(ポインタ関数をクラス分けした方がいいのでは…？)
**/

public class Main {
	static String name[] = new String[20];
	static String tel[] = new String[20];
	static String ado[] = new String[20];
	static int age[] = new int[20];
	//配列の枠数の確保と初期化
	static int count = 0;/*カウントに使用*/
	static int i;/*配列の枠の番号に使用*/
	public static void main (String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
	//標準入出力用の宣言
		for(;;){/*無限ループ*/
			String input = br. readLine();/*1行読み込み*/
			if(input.startsWith(":")){/*入力された先頭文字が「:」か判断*/
				if(input.equals(":list")){/*入力された文字が「;list」か判断*/
					for(i=0;i<count;i++){
						System. out. println((i+1) + " " + name[i] +" "+ age[i] + " " + tel[i] + " " + ado[i]);
					}
					//入力された分までのリストを表示
				}else if(input.equals(":exit")){/*入力された文字が「:exit」か判断*/
					return;/*終了コマンド*/
				}
			}else{
				String[] meibo = input.split(" ",4);
					//入力された1文をスペースの部分で4つに分割
				name[i] = meibo[0];
				age[i] = Integer.parseInt(meibo[1]);
				tel[i] = meibo[2];
				ado[i] = meibo[3];
				//分割した4つを名前年齢電話番号住所の配列の箱にに入れる
				i++;/*次の配列の箱へ移動*/
				count++;/*入力した行の数を数える*/
			}
		}
	}
}