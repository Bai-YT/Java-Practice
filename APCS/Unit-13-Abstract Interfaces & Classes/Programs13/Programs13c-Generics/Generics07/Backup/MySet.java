// Generics07
// The <MySet> class implements the <Set> subinterface
// Compare the <add> method with the <MyList> code of <add>.


class MySet<E> implements Set<E>
{
   private int size;
   private Object[] objects;
   
   public MySet(int n)
   {
      objects = new Object[n];
      size = 0;
   }
   
   public boolean add (E obj)          
   {
      if (contain(obj))
      {
         return false;
      }
      else
      {
         objects[size] = obj;
         size++;
         return true;
      }
   }
   
   public boolean isEmpty()         
   { 
      return size == 0; 
   }
   
   public boolean contain(E obj)    
   { 
      boolean noMatch = true;
      int index = 0;
      while (index < size && noMatch)
      {
         if (objects[index].equals(obj))
            noMatch = false;
         else
            index++;
      }
      return noMatch == false;
   }
      
   public String toString()
   {
      String temp = "";
      for (int k = 0; k < size; k++)
         temp = temp + objects[k] + "\n";
      return temp;
   }   
}




