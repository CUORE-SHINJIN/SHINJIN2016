typedef struct_S{
	char c;
	short s[2];
	int i;
	
}S;

S globalS;
char globalChar;
char globalCharArray[6];
short globalShort;
int globalInt;
long globalLong;

void func1(int arg);
void func2(int arg1,char arg2,S arg3,char arg4);

void main(int argc,char** argv){
	char c;
	int i;
	char str1[]="noge";
	char str2="huga";
	char str3="hoge";
	S s;
	func1(1);
	func2(1,'a',s,'a');
}
void func1(int arg){
	int func1Int;
	static int func1Staticlnt;
	static char* func1StaticStr="foober";
	char* func1Str="yes";
}
void func2(int arg1,char arg2,S arg3,char arg4){
	int func2Int;
	S func2Struct;
	static int func2StaticInt;
	char* func2Str="no";
	func1(2);
}