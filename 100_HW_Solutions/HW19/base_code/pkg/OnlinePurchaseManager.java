package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   

   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
   
   public int countElectronicsByMaker(String maker){
      int count = 0;
      for(int i =0; i<purchases.size(); i++){
         Gizmo one = purchases.get(i);
         if(one.isElectronic() && one.getMaker().equals(maker)){
            count++;
         }
         return count;
      }
   }
   
   public boolean hasAdjacentEqualPair(){
      Gizmo one = purchases.get(0);
      for(int j =1; j<purchases.size(); j++){
         Gizmo two = purchases.get(j);
         if(one.equals(two)){
            return true;
         }
         else{
            one = two;
         }
      }
       return false;
      }
      
}
