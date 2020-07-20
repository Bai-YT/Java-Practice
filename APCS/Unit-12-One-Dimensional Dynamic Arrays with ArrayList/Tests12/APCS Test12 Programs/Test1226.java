import java.util.ArrayList;

public class Test1226
{
 	public static void main(String[] args)
 	{
		int[] list1 = {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int k = 0; k < list1.length; k++)
			list2.add(list1[k]);
        
      //for (int number : list2)
		//	list1.add(number);
         
      for (int number : list1)
         list2.add(number);


		System.out.println(list2);
    }
}







