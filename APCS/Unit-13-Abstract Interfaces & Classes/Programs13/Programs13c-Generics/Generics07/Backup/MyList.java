// Generics07
// The <MyList> class implements the <List> subinterface
// Compare the <add> method with the <MySet> code of <add>.


public class MyList<E> implements List<E>
{
   private int size;
   private Object[] objects;
   
   public MyList(int n)
   {
      objects = new Object[n];
      size = 0;
   }
   
   public boolean add (E obj)          
   {
      objects[size] = obj;
      size++;
      return true;
   }
   
   public boolean isEmpty()         
   { 
      return size == 0; 
   }
   
   public E get(int index)          
   { 
      return (E) objects[index]; 
   }
   
   public String toString()
   {
      String temp = "";
      for (int k = 0; k < size; k++)
         temp = temp + objects[k] + "\n";
      return temp;
   }   
}


   




