//�t�H���_���A�֘A������̂œ���
package classjushoc;

//class��Meibo�Ƃ��Đ錾
public class Meibo{
	//�����o�[�ϐ���0�ŏ������A�o�^���ڂ̌���
	//������^�̕ϐ��Ƃ��Đ錾
	String name;			
	//�����^�̕ϐ��Ƃ��Đ錾
	int age;				
	//������^�̕ϐ��Ƃ��Đ錾
	String tel;				
	//������^�̕ϐ��Ƃ��Đ錾
	String add;				
	//�߂�l�������Ȃ�����line(�W������)��������inList���\�b�h��line�̒������ڂ��Ƃɕ���
	public void inList(String line){
		//�ϐ�line�̒��g���X�y�[�X���Ƃɕ������A������^�z��̕ϐ�tes�Ɋi�[
		String[] tes=line.split(" ",0);			
		//���̃N���X���g�̕ϐ��ɔz��tes[0](�ŏ��̕�������X�y�[�X�܂�)���i�[
		this.name=tes[0];						
		//���̃N���X���g�̕ϐ��ɔz��tes[1](���̕�������X�y�[�X�܂�)�𕶎���^���琮���^�ɃL���X�g�ϊ����Ċi�[
		this.age=Integer.parseInt(tes[1]);		
		//���̃N���X���g�̕ϐ��ɔz��tes[2](���̕�������X�y�[�X�܂�)���i�[
		this.tel=tes[2];						
		//���̃N���X���g�̕ϐ��ɔz��tes[3](���̕�������X�y�[�X�܂�)���i�[
		this.add=tes[3];						
	}
}