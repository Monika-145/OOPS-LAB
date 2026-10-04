import java.util.*;
class even implements Runnable
{
public int x;
public even(int x)
{
this.x=x;
}
public void run()
{
System.out.println("New Thred"+x+"is EVEN and Square of:"+x+"is:"+x*x);
}
}
class odd implements Runnable{
public int x;
public odd(int x)
{
this.x=x;
}
public void run()
{
System.out.println("New Thread"+x+"is ODD and Cube of"+x+"is:"+x*x*x);
}
}
class A extends Thread
{
public void run()
{
int num=0;
Random r=new Random();
try{
for(int i=0;i<5;i++)
{
num=r.nextInt(100);
System.out.println("Main Thread and Generated Number is"+num);
if(num%2==0){
Thread t1=new Thread(new even(num));
t1.start();
}
else{
Thread t2=new Thread(new odd(num));
t2.start();
}
Thread.sleep(1000);
System.out.println(".....................");
}
}
catch(Exception ex){
System.out.println(ex.getMessage());
}
}
}
public class ThreadProgram{
public static void main(String[]args){
A a=new A();
a.start();
}
}

OUTPUT

  Main Thread and Generated Number is24
New Thred24is EVEN and Square of:24is:576
.....................
Main Thread and Generated Number is57
New Thread57is ODD and Cube of57is:185193
.....................
Main Thread and Generated Number is82
New Thred82is EVEN and Square of:82is:6724
.....................
Main Thread and Generated Number is13
New Thread13is ODD and Cube of13is:2197
.....................
Main Thread and Generated Number is45
New Thread45is ODD and Cube of45is:91125
.....................
