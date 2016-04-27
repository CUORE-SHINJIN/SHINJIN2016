package jusho;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
		int i=0,n=0,age[];
		String name[],tel[],add[];
		name=new String[30];
		age=new int[30];
		tel=new String[30];
		add=new String[30];
		
		try{
			for(;;){
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String line=br.readLine();
				if(line.equals(":list")){
					for(int a=0;a<n;a++){
						System.out.print(a+1+" ");
						System.out.print(name[a]+" ");
						System.out.print(age[a]+" ");
						System.out.print(tel[a]+" ");
						System.out.println(add[a]);
					}
				}else if(line.equals(":exit")){
					break;
				}else{
					StringTokenizer x=new StringTokenizer(line," ");
					name[i]=x.nextToken();
					age[i]=Integer.parseInt(x.nextToken());
					tel[i]=x.nextToken();
					add[i]=x.nextToken();
					if(i>=20){
						System.out.println("error 20over");
						continue;
					}
					i++;
					n++;
				}
			}
		}catch(Exception e){
			System.out.println("error");
		}
	}
}

