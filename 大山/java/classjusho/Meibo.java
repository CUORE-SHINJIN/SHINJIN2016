package classjusho;

public class Meibo{
	String name;
	int age;
	String tel;
	String add;
	public void inList(String line){
		String[] tes=line.split(" ",0);
		this.name=tes[0];
		this.age=Integer.parseInt(tes[1]);
		this.tel=tes[2];
		this.add=tes[3];
	}
}