//�p�b�P�[�W��
package meibo3;
//�W�����o�͂Ɏg�p
import java. io. BufferedReader;
import java. io. InputStreamReader;

//���o�͂Ȃǂ��s�����C���N���X
public class Main {
	public static void main(String args[]) throws Exception {
		//�L�[�{�[�h����̓��͂��\�ɂ��邽�߂̎��s��
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		//Status�N���X���g�����z��̐錾��(�g��20)
		Status[] member =new Status[20];
		//�z��20�g���̎��s��
		int i =0;
		for(i=0;i<20;i++){
			member[i] = new Status();
		}
		//
		int n=0;
		//�������[�v�œ��͎�t
		for(;;){
			//���͂��ꂽ��s���̓ǂݍ���
			String input =br. readLine();
			//���͂��ꂽ���������u�F�v�łȂ������f(�u�F�`�v���R�}���h�Ƃ��Ďg�p���邽��)
			if(!input.startsWith(":")){
				//���͂��ꂽ��s���X�y�[�X�̕�����4�ɕ���
				String[] meibo =input.split(" ",4);
				//��������4���ڂ����ꂼ�ꖼ�O�A�N��A�d�b�ԍ��A�Z���̔z��̔��ɓ����
				member[n].name = meibo[0];
				//�N��͐����Ȃ̂�int�^�ɕϊ�
				member[n].age = Integer.parseInt(meibo[1]);
				member[n].tel = meibo[2];
				member[n].ado = meibo[3];
				//���̔z��̔��ֈړ�
				n++;
			//���͂��ꂽ���������u�F�v(�R�}���h����͂��ꂽ)�ꍇ�̎��s���e
			}else{
				//�u:list�v�����͂��ꂽ���̎��s���e
				if(input.equals(":list")){
					//���͂��ꂽ���܂ł̔z�����͏��ɕ\��
					for(i=0; i<n; i++){
						//�i���o�����O�������A�X�y�[�X�󂯂Ă��ꂼ��̍��ڂ��o��
						System.out.println(
						(i+1) +" "+ member[i].name +" "+ 
						member[i].age +" "+ 
						member[i].tel +" "+member[i].ado);
					}
				//�u:exit�v�����͂��ꂽ���̎��s���e
				}else if(input.equals(":exit")){
					//�V�X�e���I��
					System.exit(0);
				}
			}
		}
	}
}