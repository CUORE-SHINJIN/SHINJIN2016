package D035;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
		try{
			int lastd;
			int days[]={31,28,31,30,31,30,31,31,30,31,30,31};

			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			String ymd=input.readLine();
			StringTokenizer y_m_d=new StringTokenizer(ymd," ");
			int y=Integer.parseInt(y_m_d.nextToken());
			int m=Integer.parseInt(y_m_d.nextToken());
			int d=Integer.parseInt(y_m_d.nextToken());
			if( m<1 && m>12){
				System.out.println("error");
				return ;
			}
			lastd = days[m-1];
			
			if(m==2){
				if(y%4==0 && y%100!=0 || y%400==0){
					lastd=29;
				}
			}
			if(d<1 || d>lastd){
				System.out.println("error");
				return ;
			}
			if(y<2000 || y>2016){
				System.out.println("error");
				return ;
			}
			System.out.print(y+"/"+m+"/"+d);
		}catch(Exception e){
			System.out.println("error");
		}
	}
}
