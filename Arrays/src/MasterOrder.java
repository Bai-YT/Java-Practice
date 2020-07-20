import java.util.*;
public class MasterOrder
   {
	private List<CookieOrder> orders;

	public MasterOrder()
	{ orders = new ArrayList<CookieOrder>(); }

    public void addOrder(CookieOrder theOrder)
     {  orders.add(theOrder);  }

    public int getTotalBoxes(){
    	 int total = 0;
    	 for (CookieOrder co : orders)
    		total +=  co.getNumBoxes();
    	 return total;
     }

     public int removeVariety(String cookieVar){
    	 int removed = 0; CookieOrder co;
    	 for (int i = 0; i < orders.size(); i++){
    		 if(orders.get(i).getVariety().equals(cookieVar))
    		 {
    			 co = orders.remove(i);
    			 removed += co.getNumBoxes();
    			 i--;
    		 }
    			 //removed += orders.remove(i).getNumBoxes();
    	 }
    	 return removed;
     }
     
   public String toString(){
	   String cookieString = "";
	   for (CookieOrder co : orders){
		   cookieString += co.getVariety() + " " ;
	   		cookieString += co.getNumBoxes() + " \n";
	   		}
	   return cookieString;
   }
}
