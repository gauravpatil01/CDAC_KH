// package RajaSoft;

public class SpaceAtLocation {
    
    public static String insertSpace(String str,int [] indexs){
        
        StringBuilder sb = new StringBuilder(str);
        for(int i=indexs.length-1;i>=0;i--){
            sb.insert(indexs[i]," ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
      String str="MyNameIsSahil";
      int index[]={2,6,8};
      String result=insertSpace(str,index);
      System.out.println(result);  
    }
}
