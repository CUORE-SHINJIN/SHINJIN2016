package jusyoroku;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
	public static void main (String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
				
		int i = 0;
		String n[] = new String[21];
		String name[] = new String[21];
		int age[] = new int[21];
		String age2[] = new String[21];
		String telno[] = new String[21];
		String address[] = new String[21];
		
		
		/*�������[�v������*/
		while(true){
		/*�����o�ȊO�̕ϐ��ɖ��O�����*/
			n[i] = in.next();
		
		/*�u:list�v�u:exit�v�łȂ���΃����o�Ƀf�[�^���R�s�[*/
			if(!(n[i].equals(":list")) && !(n[i].equals(":exit"))){
				name[i] = n[i].substring(0);
			
	
		/*���O�ȉ��̏����X�y�[�X��؂�œ���*/
			age2[i] = in.next();
			age[i] = Integer.parseInt(age2[i]);
			telno[i] = in.next();
			address[i] = in.next();
			
			i++;
			}
		/*�u:list�v�Ȃ���̏o��*/
			else if(n[i].equals(":list")){
				int s;
				for(s = 0;s < i;s++){
					System.out.println(s+1 + " Name=" + name[s] + " Age=" + age[s] + " TelNo=" + telno[s] + " Address=" + address[s]);
				}
			}
			
		/*�u:exit�v�Ȃ�v���O�����I��*/
			else if(n[i].equals(":exit")){
				System.exit(0);
			}
		/*20��ȏニ�[�v������i�����͂��ꂽ��j�G���[*/
			if(i > 20){
				System.out.print("Error");
				System.exit(1);
			}
		}
	}
}
		