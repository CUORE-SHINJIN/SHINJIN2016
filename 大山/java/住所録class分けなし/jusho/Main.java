//フォルダ名、関連あるクラスで統一
package jusho;
//java.ioからクラスを呼び出す
import java.io.*;			

//java.utilからクラスを呼び出す
import java.util.*;			

//classをMain名で宣言、ファイル名と一致
public class Main{
	//最初に扱うString型配列を引数にもつメソッド、例外処理の場合エラーを返す
	public static void main(String[] args)throws Exception{
		//整数型の変数と宣言
		int i=0;						
		//整数型の変数と宣言
		int n=0;						
		//整数型の変数と宣言
		int age[];						
		//文字列型の変数と宣言
		String name[];					
		//文字列型の変数と宣言
		String tel[];					
		//文字列型の変数と宣言
		String add[];					
		//配列領域の確保、最大入力20件のため余裕をみて
		name=new String[30];			
		//配列領域の確保、最大入力20件のため余裕をみて
		age=new int[30];				
		//配列領域の確保、最大入力20件のため余裕をみて
		tel=new String[30];				
		//配列領域の確保、最大入力20件のため余裕をみて
		add=new String[30];				
		//例外処理時catchの処理を実行
		try{
			//for{}まで無限ループ
			for(;;){
				//標準入力を引数としたInputStreamReaderのインスタンスをさらにそれを引数としたBufferedReaderのインスタンスを変数に代入
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				//readLine関数で入力されたものを変数に格納
				String line=br.readLine();					
				//入力が:listと等しいか判定
				if(line.equals(":list")){
					//変数aが0からa<nとなるまでaを1ずつ増減して繰り返す
					for(int a=0;a<n;a++){
						//標準出力を行う
						System.out.print(a+1+" ");			
						//標準出力を行う
						System.out.print(name[a]+" ");		
						//標準出力を行う
						System.out.print(age[a]+" ");		
						//標準出力を行う
						System.out.print(tel[a]+" ");		
						//標準出力を行う
						System.out.println(add[a]);			
					}
				//ifが偽のとき、入力が:exitと等しいか判定
				}else if(line.equals(":exit")){
					//無限ループを抜ける
					break;									
				//if,else if以外のとき処理
				}else{
					//入力をスペースごとに分割
					StringTokenizer x=new StringTokenizer(line," ");	
					//入力の最初の文字からスペースまでを変数に格納
					name[i]=x.nextToken();								
					//次の文字からスペースまでを変数に格納
					age[i]=Integer.parseInt(x.nextToken());				
					//次の文字からスペースまでを変数に格納
					tel[i]=x.nextToken();								
					//次の文字からスペースまでを変数に格納
					add[i]=x.nextToken();								
					//i>=20かを判定
					if(i>=20){
						//標準出力を行う
						System.out.println("error 20over");				
						//以降の処理をせずに繰り返し地に戻る
						continue;										
					}
					//i=i+1
					i++;												
					//n=n+1
					n++;												
				}
			}
		//try内での例外処理時に実行
		}catch(Exception e){
			//標準出力を行う
			System.out.println("error");					
		}
	}
}

