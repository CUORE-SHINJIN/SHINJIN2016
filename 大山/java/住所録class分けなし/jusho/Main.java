//�t�H���_���A�֘A����N���X�œ���
package jusho;
//java.io����N���X���Ăяo��
import java.io.*;			

//java.util����N���X���Ăяo��
import java.util.*;			

//class��Main���Ő錾�A�t�@�C�����ƈ�v
public class Main{
	//�ŏ��Ɉ���String�^�z��������ɂ����\�b�h�A��O�����̏ꍇ�G���[��Ԃ�
	public static void main(String[] args)throws Exception{
		//�����^�̕ϐ��Ɛ錾
		int i=0;						
		//�����^�̕ϐ��Ɛ錾
		int n=0;						
		//�����^�̕ϐ��Ɛ錾
		int age[];						
		//������^�̕ϐ��Ɛ錾
		String name[];					
		//������^�̕ϐ��Ɛ錾
		String tel[];					
		//������^�̕ϐ��Ɛ錾
		String add[];					
		//�z��̈�̊m�ہA�ő����20���̂��ߗ]�T���݂�
		name=new String[30];			
		//�z��̈�̊m�ہA�ő����20���̂��ߗ]�T���݂�
		age=new int[30];				
		//�z��̈�̊m�ہA�ő����20���̂��ߗ]�T���݂�
		tel=new String[30];				
		//�z��̈�̊m�ہA�ő����20���̂��ߗ]�T���݂�
		add=new String[30];				
		//��O������catch�̏��������s
		try{
			//for{}�܂Ŗ������[�v
			for(;;){
				//�W�����͂������Ƃ���InputStreamReader�̃C���X�^���X������ɂ���������Ƃ���BufferedReader�̃C���X�^���X��ϐ��ɑ��
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				//readLine�֐��œ��͂��ꂽ���̂�ϐ��Ɋi�[
				String line=br.readLine();					
				//���͂�:list�Ɠ�����������
				if(line.equals(":list")){
					//�ϐ�a��0����a<n�ƂȂ�܂�a��1���������ČJ��Ԃ�
					for(int a=0;a<n;a++){
						//�W���o�͂��s��
						System.out.print(a+1+" ");			
						//�W���o�͂��s��
						System.out.print(name[a]+" ");		
						//�W���o�͂��s��
						System.out.print(age[a]+" ");		
						//�W���o�͂��s��
						System.out.print(tel[a]+" ");		
						//�W���o�͂��s��
						System.out.println(add[a]);			
					}
				//if���U�̂Ƃ��A���͂�:exit�Ɠ�����������
				}else if(line.equals(":exit")){
					//�������[�v�𔲂���
					break;									
				//if,else if�ȊO�̂Ƃ�����
				}else{
					//���͂��X�y�[�X���Ƃɕ���
					StringTokenizer x=new StringTokenizer(line," ");	
					//���͂̍ŏ��̕�������X�y�[�X�܂ł�ϐ��Ɋi�[
					name[i]=x.nextToken();								
					//���̕�������X�y�[�X�܂ł�ϐ��Ɋi�[
					age[i]=Integer.parseInt(x.nextToken());				
					//���̕�������X�y�[�X�܂ł�ϐ��Ɋi�[
					tel[i]=x.nextToken();								
					//���̕�������X�y�[�X�܂ł�ϐ��Ɋi�[
					add[i]=x.nextToken();								
					//i>=20���𔻒�
					if(i>=20){
						//�W���o�͂��s��
						System.out.println("error 20over");				
						//�ȍ~�̏����������ɌJ��Ԃ��n�ɖ߂�
						continue;										
					}
					//i=i+1
					i++;												
					//n=n+1
					n++;												
				}
			}
		//try���ł̗�O�������Ɏ��s
		}catch(Exception e){
			//�W���o�͂��s��
			System.out.println("error");					
		}
	}
}

