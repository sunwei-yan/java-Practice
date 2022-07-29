import java.util.Scanner;



public class BMI{
public static void main(String[] args) {
    int xbx=0;
   System.out.println("请输入你的姓名："); 
Scanner sc =new Scanner(System.in);
String xm =sc.next();
System.out.println("请输入您的性别(true代表男性，false代表女性)：");
String xb =sc.next();
System.out.println("请输入你的身高,精确到小数点后2位，单位为米："); 
double sg =sc.nextDouble();
System.out.println("请输入您的体重，单位公斤："); 
int tz =sc.nextInt();
if(xb.equals("flase"))
{
     xbx=-1;
}
double bmi=tz/(sg*sg)+xbx;
if(bmi<20)
{
    System.out.printf("%s先生,您体重过轻",xm);    
}
else if(bmi<25)
{
    System.out.printf("%s先生,您体重适中",xm);    
}
else if(bmi<30)
{
    System.out.printf("%s先生,您体重过重",xm);    
}
else if(bmi<35)
{
    System.out.printf("%s先生,您体重肥胖",xm);    
}
else if(bmi>35)
{
    System.out.printf("%s先生,您体重非常肥胖",xm);    
}










}




}