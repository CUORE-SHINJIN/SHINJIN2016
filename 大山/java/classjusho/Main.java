package classjusho;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
		int i=0;
		Meibo[] mei=new Meibo[20];
		Out out=new Out();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			for(;;){
				String line=br.readLine();
				if(line.equals(":list")){
					out.outList(mei,i);
				}else if(line.equals(":exit")){
					break;
				}else{
					if(i>=20){
						System.out.println("error 20over");
						continue;
					}
					mei[i]=new Meibo();
					mei[i].inList(line);
					i++;
				}
			}
		}catch(Exception e){
			System.out.println("error");
		}
	}
}
