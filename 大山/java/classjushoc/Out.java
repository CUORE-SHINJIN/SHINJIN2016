//�t�H���_���A�֘A�̂�����̂œ���
package classjushoc;

//class Out��錾
public class Out{
	//�߂�l�������Ȃ��Ŕz��̕ϐ��Ɛ����^�̕ϐ��������ɂ���outList���\�b�h�ō��܂ł̓��͂��o��
	public void outList(Meibo[] mei,int n){
		//i<n�̂Ƃ��A{}�̒��̏������s���Ai=i+1������Ƃ����������J��Ԃ��B�z��̒��g�������o�͂��邽��
		for(int i=0;i<n;i++){
			//�z��mei�Ɋi�[����Ă���i�Ԗڂ̃����o�[�ϐ����o��
			System.out.println(i+1+" "+mei[i].name+" "+mei[i].age+" "+mei[i].tel+" "+mei[i].add);
		}
	}
}

	