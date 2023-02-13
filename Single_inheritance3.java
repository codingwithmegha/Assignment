package Lab_2;
class parent19{  
void show1()
{
	System.out.println("Hello");}  
}  
class child19 extends parent19{  
void show2()
{
	System.out.println("Welcome");}  
}  
public class Single_inheritance3{  
public static void main(String args[]){  
child19 d=new child19();  
d.show1();  
d.show2();  
}}  