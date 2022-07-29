package pack1;
import java.util.Random;
import java.util.Scanner;
public class que2 {
    static Random rand = new Random();
    static Scanner get = new Scanner(System.in);
    static int[] randnum(int x){
        int s=1;
        int [] flag=new int[11];
        while(s==1){
        
            s=0;
        
            for(int i=0;i<=x;i++){
                flag[i]=rand.nextInt(10);
            }
            for(int i=0;i<=x;i++){
                for(int j=i+1;j<=x;j++){
                   if(flag[i]==flag[j])
                   {s=1;}
                }
            }
        }
        return flag;   
           }
    public static void main(String[] args) {
        int [] flag=new int[11];
        String [] name={"美国队长","钢铁侠","绿巨人","蜘蛛侠","黑寡妇","鹰眼","蝙蝠侠","金刚狼","泰迦奥特曼","假面骑士zero one"};
   int i;
   System.out.print("请输入抽奖人数：") ; 
   int s=get.nextInt();
   for(i=0;i<10;i++){
    System.out.println(name[i]) ;  
   }
    flag=randnum(s);
    System.out.println("以下"+s+"中奖") ; 
    for(int x=0;x<s;x++){
     System.out.println(name[flag[x]]) ;  
    }
    }
    
}
