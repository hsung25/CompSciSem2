package pkg;

public class Gizmo
{ 
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
   public String getMaker(){
      return maker;
   }
   public boolean isElectronic(){
      if(this.Gizmo == other.Gizmo){
         return true;
         System.out.println("sony");
      }
      else{
         return false;
      }
   }
   public boolean equals(Object other){
      if(!other instanceof Gizmo){
         return false;
      }
      else{
         return this.Gizmo==other.Gizmo;
      }
   }
}
