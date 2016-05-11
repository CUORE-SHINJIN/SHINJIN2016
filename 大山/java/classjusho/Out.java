package classjusho;

public class Out{
	public void outList(Meibo[] mei,int n){
		for(int i=0;i<n;i++){
			System.out.println(i+1+" "+mei[i].name+" "+mei[i].age+" "+mei[i].tel+" "+mei[i].add);
		}
	}
}

	