package pack1;
import java.util.Random;
public class que1 {
    static Random rand = new Random();
    public static void main(String[] args) {
    String [] name={"美国队长","钢铁侠","绿巨人","蜘蛛侠","黑寡妇","鹰眼","蝙蝠侠","金刚狼","泰迦奥特曼","假面骑士zero one"};
   int i;
    for(  i=0;i<10;i++)
    {System.out.println(name[i]+"\n");}
    int n=rand.nextInt(10);
    System.out.println("恭喜"+name[n]+"中奖了");
    }
}