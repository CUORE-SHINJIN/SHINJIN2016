//�t�H���_���A�֘A�̂�����̂œ���
package classjushoc;

//java.io����N���X���Ăяo���ABufferdReader��InputStreamReader���g�p���邽��
import java.io.*;			
//java.util����N���X���Ăяo���Aequls���g�p���邽��
import java.util.*;			

//class��Main�Ɛ錾�A�t�@�C�����ƈ�v
public class Main{
	//�ŏ��ɍs����String�^��main���\�b�h�A��O�������G���[��Ԃ�
	public static void main(String[] args)throws Exception{
		//�����^�̕ϐ��Ɛ錾
		int i=0;							
		//class Meibo��z��̈�20(�ő����20���̂���)�Ƃ��ăC���X�^���X��
		Meibo[] mei=new Meibo[20];			
		//class Out���C���X�^���X��
		Out out=new Out();					
		//�W�����͂������Ƃ���InputStreamReader������ɂ���������Ƃ���BufferedReader�ŃC���X�^���X�����A�ϐ��Ɋi�[
		//���͂��ł���悤�ɂ��邽�߂̏���
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//��O������catch�ɔ��
		try{
			//�������[�v
			for(;;){
				//�W�����͂�ϐ��Ɋi�[
				String line=br.readLine();	
				//���͂�:list�Ɠ�����������
				if(line.equals(":list")){
					//mei�z��ƃJ�E���^i��������outList���\�b�h���Ăяo���A���܂ł̓��͂��o��
					out.outList(mei,i);		
				//if���U�̂Ƃ����͂�:exit��������������
				}else if(line.equals(":exit")){
					//�������[�v�𔲂���
					break;					
				//if,else if�ȊO�̂Ƃ����������s
				}else{
					//i>=20�̂Ƃ����������s
					if(i>=20){
						//�W���o�͂��s��
						System.out.println("error 20over");		
						//�ȍ~�̏������s�킸�J��Ԃ��n�_�ɖ߂�
						continue;								
					}
					//mei�z���i�Ԗڂ�Mibo class���C���X�^���X��
					mei[i]=new Meibo();			
					//mei�z���i�ԖڂɈ���line��inList���\�b�h���Ăяo���A�o�^���ڂ��Ƃɕ����������̂��i�[
					mei[i].inList(line);		
					//i=i+1�̏��������s
					i++;						
				}
			}
		//try���ŗ�O���������������s
		}catch(Exception e){
			//�W���o�͂��s��
			System.out.println("error");		
		}
	}
}
//�v���O�����I��

