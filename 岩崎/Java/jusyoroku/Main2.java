//�p�b�P�[�W���@jusyoroku�@�N���X�𕪗ނ��Đ������邽�߂̎d�g��
package jusyoroku;
	
//import���B�����ŋL�q���Ă������ƂŃv���O�������Ńp�b�P�[�W�����ȗ��ł���B
/*java.io�p�b�P�[�W�Ɋ܂܂��BufferedReader�N���X�B�����Ɋ܂܂�郁�\�b�h���g�p����
	Scanner�N���X�̃��\�b�h���g�p���Ă��܂��̂ŁA�����ł͕K�v����܂���ł���*/
import java.io.BufferedReader;

/*java.io�p�b�P�[�W�Ɋ܂܂��InputStreamReader�N���X�B�w�肳�ꂽ���iSystem.in�j����
	1�������̃f�[�^��ǂ݂Ƃ鏈���BBufferedReader�N���X���o�R���Ďg�p�i���b�v�j����
	���܂����̂ŁA�����ł͕K�v����܂���ł���*/
import java.io.InputStreamReader;

//java.util�p�b�P�[�W�Ɋ܂܂��Scanner�N���X�B�e�L�X�g���͂������B
import java.util.Scanner;


/*�N���X��Main2�@�f�[�^�Ǝ葱�����ЂƂ܂Ƃ܂�ɂ������́Bpublic�́u���ׂẴN���X�����
	�Q�Ƃ����v�Ƃ����Ӗ��̃A�N�Z�X�C���q�B�A�N�Z�X�C���q�ɂ��ẮA�܂��悭�������Ă���܂���*/
public class Main2 {		
							
							
/*������String�^�̔z���static�C���q���t�^����Ă���main�Ƃ������\�b�h���Ajava�R�}���h
	���s���ɌĂяo�����Bstatic�C���q���t�^����Ă��邱�ƂŃC���X�^���X�����Ȃ��Ă�
	���\�b�h�ɃA�N�Z�X�ł���B
	throws�͔���������O���Ăяo�����ɔC���鎞�ɗp����B�����̏ꍇ�͕W���G���[�o�͂�
	��O��\������BException��java.lang�p�b�P�[�W�Ɋ܂܂���O�N���X�i���ɂ�Exception��
	�܂ރp�b�P�[�W����������A���ꂼ��Ŗ������قȂ�H�j�B
	java.lang�p�b�P�[�W��import���Ȃ��Ă��R���p�C����import���Ă����̂ŁA
	import������String�N���X�ASystem�N���X�AException�N���X���g�p�ł���*/							
	public static void main (String[] args) throws Exception {		
		
/*InputStreamReader�N���X�̈�����System.in���w�肵�ăC���X�^���X���������̂�BufferedReader
	�N���X�̈����Ɏw�肵�ăC���X�^���X�����A�����BufferedReader�N���X�̕ϐ� br �ɑ���B
	�����ł͕K�v����܂���ł���*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
/*Scanner�N���X�̈�����System.in���w�肵�ăC���X�^���X���������̂��AScanner�N���X�̕ϐ� in �ɑ���B
	System.in�͕W�����́iSystem.in��java.lang�p�b�P�[�W�Ɋ܂܂��System�N���X��static�����o�ϐ� in �j�B
	static�����o�ϐ��ɂ��ẮA�܂��悭�������Ă���܂���*/
		Scanner in = new Scanner(System.in);
				
	// int�^�̕ϐ� i �̐錾�Ə������B���[�v���ɔz��ƘA�������邽�߁B
		int i = 0;		
		
	/*String�^�̔z��ϐ� n �̐錾�ƁA�v�f���̊m�ہB
		�u:list�v�u:exit�v�̔��ʂ��Z���^�ɕK�v�ȏ����i�[����ϐ��Ƃ͕ʂōs������*/
		String n[] = new String[21];
					
	//String�^�̔z��ϐ� name �̐錾�ƁA�v�f���̊m�ہB���u���O�v�̊i�[�p�B
		String name[] = new String[21];
			
	/*int�^�̔z��ϐ� age �̐錾�ƁA�v�f���̊m�ہB���u�N��v�̊i�[�p�B
		String�^�̔z��ϐ� age2 ����l���󂯎��*/
		int age[] = new int[21];
		
	/*String�^�̔z��ϐ� age2 �̐錾�ƁA�v�f���̊m�ہB���u�N��v�̊i�[�p�B
		int�^�̔z��ϐ� age �֒l���󂯓n���B���͑҂��̍ۂ� age[i] = in.nextInt() �Ƃ���΁A
		�����ł͕K�v����܂���ł����B*/
		String age2[] = new String[21];	
			
	//String�^�̔z��ϐ� telno �̐錾�ƁA�v�f���̊m�ہB���u�d�b�ԍ��v�̊i�[�p�B
		String telno[] = new String[21];
		
	//String�^�̔z��ϐ� address �̐錾�ƁA�v�f���̊m�ہB���u�Z���v�̊i�[�p�B
		String address[] = new String[21];
		

	//�������[�v�J�n
		while(true){						
	/*�u:list�v�u:exit�v���ʂ̂��߁AString�^�̕ϐ� n �ւ̓��͂�Ɨ��B
		Scanner�N���X��next()���\�b�h�i�󔒂܂ł̕�������擾�j���g�p*/
			n[i] = in.next();					
			
	/*�ϐ� n �ɓ��͂��ꂽ�����񂪁u:list�v�u:exit�v�łȂ������ꍇ���L�̏����B
		equals��String�N���X�Ɋ܂܂�郁�\�b�h*/
			if(!(n[i].equals(":list")) && !(n[i].equals(":exit"))){	
				
	/*�ϐ� n �ɓ��͂��ꂽ����ϐ� name �փR�s�[�Bsubstring��String�N���X��
		�܂܂�郁�\�b�h�B*/
				name[i] = n[i].substring(0);					
			
	//�ϐ���age��age2��2�쐬���ĕϊ����Ȃ��Ƃ��Aage[i] = in.nextInt() �Ƃ���ΐ��l�œ��͉\�ł����B
	//String�^�̕ϐ� age2 �ɓ���
				age2[i] = in.next();	
	/*String�^�̕ϐ� age2 �ɓ��͂��ꂽ��������Aint�^�̕ϐ� age �ɐ��l�ɕϊ����đ���B
		Integer�N���X��parseInt���\�b�h���g�p*/
				age[i] = Integer.parseInt(age2[i]);	
		
	//String�^�̕ϐ� telno �ɓ���
				telno[i] = in.next();
	
	//String�^�̕ϐ� address �ɓ���
				address[i] = in.next();	
	
	//���[�v���邲�Ƃɕϐ� i ��1��������i�e�ϐ��̔z��ƘA���j
				i++;		
	
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:list�v�u:exit�v�łȂ������ꍇ�̏����I��
			}		
		
		
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:list�v�������ꍇ���L�̏���
			else if(n[i].equals(":list")){	
				
	//while�Ń��[�v�����񐔕��o�͂��邽�߂�int�^�̕ϐ� s �̐錾
				int s;	
							
	//while�Ń��[�v�����񐔕��܂ŉ��L�̏���
				for(s = 0;s < i;s++){		
	//���͂��ꂽ����擪��1����20�܂ł̔ԍ���t���ďo�́BSystem.out�͕W���o��
					System.out.println(s+1 + " Name=" + name[s] + " Age=" + age[s] + " TelNo=" + telno[s] + " Address=" + address[s]);
										
	//while�Ń��[�v�����񐔕��̏����I��
				}			
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:list�v�������ꍇ�̏����I��
			}					
					
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:exit�v�������ꍇ���L�̏���
			else if(n[i].equals(":exit")){		
	//�v���O��������I��
				System.exit(0);				
	//�ϐ� n �ɓ��͂��ꂽ�����񂪁u:exit�v�������ꍇ�̏����I��
			}					
					
	//while��20���葽�����[�v�����ꍇ�i20���葽����񂪓��͂��ꂽ�ꍇ�j���L�̏���
			if(i > 20){				
	//�uError�v���o�́BSystem.err�͕W���G���[�o��
				System.err.print("Error");	
	//�v���O�����ُ�I��
				System.exit(1);	
	//while��20���葽�����[�v�����ꍇ�i20���葽����񂪓��͂��ꂽ�ꍇ�j�̏����I��
			}	
						
	//�������[�v�I��
		}		
	//main���\�b�h�I��
	}			
	//Main�N���X�I��
}			
		