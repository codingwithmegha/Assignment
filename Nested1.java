class Nested1
{
public static void main(String args[])
{
int a=90,b=60,c=40,d=50,e;
int avg=(a+b+c+d)/4;
System.out.print(avg);
if(avg<100 && avg>80)
{
if(avg<80 && avg>55)
{
System.out.println("first grade ");
}
else
{
System.out.println("second grade");
}}
else
{
if(avg<50 && avg<40)
{
System.out.println("third grade");
}
else
{
System.out.println("fail");
}}}}