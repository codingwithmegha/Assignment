package Lab_2;
class demo11
{
	int i=20;
}
class demo12 extends demo11
{
	int j=10;
}
class demo22 extends demo12
{
	int k=40;
void sum()
{
	System.out.println(i+j+k);
}}
public class Multilevel_inheritance6 {
public static void main(String[] args) {
	demo22 ob=new demo22();
	ob.sum();
}
}
