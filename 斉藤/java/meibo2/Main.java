package meibo2;/*�p�b�P�[�W��*/

import java. io. BufferedReader;
import java. io. InputStreamReader;
	//�W�����o�͂Ŏg�p
class Syain{
	public String name,tel,ado;
	public int age;
	public Syain(String name, int age, String tel, String ado){
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.ado = ado;
	}
}
//���_�F�N���X�𕪂��Ă݂����̂̎��ے����Ă���������Main�����œ����Ă����ԂɁc?(�U��o���ɖ߂��Ă���)

/**
*�l���邱��
*�@���̏������N���X�����������̂�(�����̍\�z�ł͍\���̂ɂ�������̂���̃N���X�ɂ�����)
*�A���̂��߂ɂ͈����͉��ɂȂ邩
*�B�Ăяo���Ƃ��̃C���X�^���X��(?)�͂ǂ�����΂����̂�
*(�ߑO�͂��ꁪ�ɔY��ł���)
*�C�ustatic�v�upublic�v���ĉ��H
*�Dthis.�`���s���B
*�C��t���邱��
*�E�蒼��������͂��߂����蒼�������������������Ȃ�
*�EC����ō�����\�[�X���悭������
*�Q�l�ɂ����\�[�X��(���͕ʂ̂��̂�������������Ȃ�)
*http://homepage3.nifty.com/teranet/jac/JavaAndC.html
*�����Fjava�Ń|�C���^�֐��ɂ�������̂𒲂ׂ�(�|�C���^�֐����N���X�����������������̂ł́c�H)
**/

public class Main {
	static String name[] = new String[20];
	static String tel[] = new String[20];
	static String ado[] = new String[20];
	static int age[] = new int[20];
	//�z��̘g���̊m�ۂƏ�����
	static int count = 0;/*�J�E���g�Ɏg�p*/
	static int i;/*�z��̘g�̔ԍ��Ɏg�p*/
	public static void main (String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
	//�W�����o�͗p�̐錾
		for(;;){/*�������[�v*/
			String input = br. readLine();/*1�s�ǂݍ���*/
			if(input.startsWith(":")){/*���͂��ꂽ�擪�������u:�v�����f*/
				if(input.equals(":list")){/*���͂��ꂽ�������u;list�v�����f*/
					for(i=0;i<count;i++){
						System. out. println((i+1) + " " + name[i] +" "+ age[i] + " " + tel[i] + " " + ado[i]);
					}
					//���͂��ꂽ���܂ł̃��X�g��\��
				}else if(input.equals(":exit")){/*���͂��ꂽ�������u:exit�v�����f*/
					return;/*�I���R�}���h*/
				}
			}else{
				String[] meibo = input.split(" ",4);
					//���͂��ꂽ1�����X�y�[�X�̕�����4�ɕ���
				name[i] = meibo[0];
				age[i] = Integer.parseInt(meibo[1]);
				tel[i] = meibo[2];
				ado[i] = meibo[3];
				//��������4�𖼑O�N��d�b�ԍ��Z���̔z��̔��ɂɓ����
				i++;/*���̔z��̔��ֈړ�*/
				count++;/*���͂����s�̐��𐔂���*/
			}
		}
	}
}