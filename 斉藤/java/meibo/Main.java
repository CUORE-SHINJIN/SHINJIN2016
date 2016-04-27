package meibo;

import java. util. Scanner;

public class Main {
	static String name[], tel[], ado[];
	static int age[], count, i;
	public static void main (String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		name = new String[20];
		age = new int[20];
		tel = new String[20];
		ado = new String[20];
		count =0;
		
		for(;;){
			name[i] = scan.next();
			if(name[i].startsWith(":")){
				if(name[i].equals(":list")){
					for(i=1;i<count;i++){
						System. out. println(i+" " + name[i] +" "+ age[i] + " " + tel[i] + " " + ado[i]);
					}
					continue;
				}else if(name[i].equals(":exit")){
					return;
				}
			}else{
				age[i] = scan.nextInt();
				tel[i] = scan.next();
				ado[i] = scan.next();
				i++;
				count++;
			}
		}
	}
}