public class KillCilantro {
   public static void main(String[] args){
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
   
   public static String killCilantro(String text){
      // remove all of 'cilantro' from text
      // replace with 'parsley'
      String Text = text;
      
      String target = "cilantro";
      String replace = "parsley";
      int targetIndex = 0;
      for (int i = 0; i < Text.length(); i++){
         if (Text.substring(i, i + 1).equals(target.substring(targetIndex, targetIndex + 1))){
            targetIndex++;
            if (targetIndex == target.length()){
               // remove cilantro and add parsley
               Text = Text.substring(0, i - (targetIndex - 1)) + replace + Text.substring(i + 1);
               targetIndex = 0;
               // System.out.println("Found CILANTRO"); TEST CONTROL
               i -= (target.length() - replace.length());
            }

         } else {
            targetIndex = 0;
         }
      }
      return Text;
      
      
   }
}