package Lab_2;
class parent11{  
void show1()
{
	System.out.println("hello");}  
}  
class child11 extends parent11{  
void show2()
{
	System.out.println("Welcome");}  
}  
class child13 extends child11{  
void show3()
{
	System.out.println("java");}  
}  
public class Multilevel_inheritance3 {  
public static void main(String args[]){  
child13 c=new child13();  
c.show1();  
c.show2();  
c.show3();  
}}  


