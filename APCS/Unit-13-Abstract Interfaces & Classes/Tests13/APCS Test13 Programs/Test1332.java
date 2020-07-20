public class Test1332
{
   public static void main(String[] args)
   {
   }
}

interface Qwerty
{
  	public void qwertyA();
   public void qwertyB();  	
   public void qwertyC();  	
   public void qwertyD();  	
   public void qwertyE();  	
   public void qwertyF();  	
   public void qwertyG();  	
   public void qwertyH();  
}

abstract class Qwerty2 implements Qwerty
{
   public void qwertyA() { } 
   public void qwertyB() { }  	
   public void qwertyC() { }
   public void qwertyD() { }
   public void qwertyE() { }
   public void qwertyF() { }
   public void qwertyG() { }
   public void qwertyH() { }
}


class Q32 extends Qwerty2
{
   public void qwertyA()
   { 
      /* assume method qwertyA is implemented */
   }
 }