/* ����-�������. 
��������� ���������� 5 (���������������) ����� � ��������� �� 1 �� 42, �� �� ���������� �� �� �����.
������������ �������� �� ������� � ������ �����-�� 5 ����� � ����������. 
��������� ����� �� ������ ����������.*/
package qwer;
public class Lotereya {
static void meth(int a, int b,int c,int d, int e){
		int similarity=0;
		int array[]=new int [5];
		System.out.println("���� �����:"+a+" "+b+" "+c+" "+d+" "+e);
		for (int i=0;i<array.length;i++){
			int n=(int)(Math.random()*43+1);
			boolean yes=true;
			for(int j=0;j<=i;j++){
			if (array[j]==n)
				yes=false;
		}
			if(yes)
				array[i]=n;
			else i--;
		}
	for(int i=0;i<array.length;i++){
		if(array[i]==a || array[i]==b || array[i]==c || array[i]==d || array[i]==e){
			similarity++;
		System.out.print("������� ����� "+array[i]+" ");
		}
	}
	System.out.println();
	if(similarity<=2)
		System.out.println("� ��� "+similarity+" ����������. ����� ���� � �����!");
	else
		if(similarity>2 && similarity<=4)
			System.out.println("� ��� "+similarity+" ����������. �������� �� ������ ���������!");
		else
			System.out.println("�� �� ��!! � ��� "+similarity+" ����������.");
	}
	

public static void main(String[] args) {
	meth(5,14,32,12,8);
}
}
