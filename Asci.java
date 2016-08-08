# priyav
import java.io.*;
public class Asci
{
public void getChars()
{
int x=0;
String str="";
//boolean contain=false;
try
{
System.out.print("Enter a Char:  ");
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
str=in.readLine();
System.out.println("Str is: "+str);
x=Integer.valueOf(str).intValue();
System.out.println("int value is: "+x);
int i = (int) x; 
System.out.println("Ascii value is :"+i);
System.out.println(i);
}catch(Exception e)
         {System.out.println(e);}
}
public static void main(String[] args)
{
Asci as=new Asci();
as.getChars();
}
}

