package jusyoroku2;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Main3 {
	public static void main (String[] args) throws Exception {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int i = 0;
				
	/*Memb�^�̔z��ϐ� me �̐錾�ƁA�v�f���̊m�ہB
		Memb�N���X�̓����o�ϐ���錾����N���X*/
		Memb me[] =  new Memb[21];
		
		//���̂ƂȂ���Memb�^�̔z��ɁAMemb�N���X���C���X�^���X�����đ��
		for(int n = 0;n < 21;n++){
			me[n] = new Memb();
		}
		
		
	//���͎�t�̂��߂̖������[�v������
		while(true){
	//�����o�ȊO�̕ϐ��ɏ�����́B�����ɂ͖��O�������́u:list�v�u:exit�v�����͂����
			me[i].n= in.next();
		
	//�u:list�v�u:exit�v�łȂ���΃����o�Ƀf�[�^���R�s�[
			if(!(me[i].n.equals(":list")) && !(me[i].n.equals(":exit"))){
				me[i].name = me[i].n.substring(0);
			
	
	//���O�ȉ��̏����X�y�[�X��؂�œ���
			//age2[i] = in.next();
			//age[i] = Integer.parseInt(age2[i]);
			me[i].age = in.nextInt();
			me[i].telno = in.next();
			me[i].address = in.next();
			
			i++;
			}
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:list�v�Ȃ���̏o��
			else if(me[i].n.equals(":list")){
				int s;
				for(s = 0;s < i;s++){
					System.out.println(s+1 + " Name=" + me[s].name + " Age=" + me[s].age + " TelNo=" + me[s].telno + " Address=" + me[s].address);
				}
			}
			
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:exit�v�Ȃ�v���O�����I��
			else if(me[i].n.equals(":exit")){
				System.exit(0);
			}
	//20��ȏニ�[�v������i�����͂��ꂽ��j�G���[
			if(i > 20){
				System.err.print("Error");
				System.exit(1);
			}
		}
	}
}
		