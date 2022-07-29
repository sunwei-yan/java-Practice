class Student{
int courseNO=3;
String name;
int []a;
String courseGrade;
String type;
String courseGrand;
Student(String name,int[]a){
this.name=name;
this.a=a;
}
void caculateGrade(int[]a){
    int i;
    int sum=0;
    for(i=0;i<3;i++){
sum=sum+a[i];
    }
    
    if(sum/3>90){
        System.out.println("优秀");
    }
    else{System.out.println("良好");}
}
public String toString(){
    String s="Student{courseNo="+this.courseNO+",name='"+this.name+"',type='"+type+"'course=["+a[0]+","+a[1]+","+a[2]+"],courseGrand='"+courseGrand+"'}";  
     return s; 
}
}
class PostGraduate extends Student{
PostGraduate(String name, int[] a) {
        super(name, a);
         type="研究生";
    }
    

}
class UnderGraduate extends Student{

    UnderGraduate(String name, int[] a) {
        super(name, a);
        type="本科生"; 
    }
    void caculateGrade(int[]a){
        int i;
        int sum=0;
        for(i=0;i<3;i++){
    sum=sum+a[i];
        }
        if(sum/3>=80){
            System.out.println("优秀");
        }
        else{System.out.println("良好");}
    } 
}
public class Test{
  public static void main(String[] args) {
    Student[] st=new Student[5];

    int[]a={70,80,90};
    st[0]=new UnderGraduate("张三",a);
    st[1]=new PostGraduate("李四",a);
    st[2]=new UnderGraduate("王五",a);
    st[3]=new PostGraduate( "陈六",a);
    st[4]=new UnderGraduate("赵七",a);
    for(int i =0;i<st.length;i++){
        System.out.println(st[i].toString());
        st[i].caculateGrade(a);}
  } 
}
//运行结果
// Student{courseNo=3,name='张三',type='本科生'course=[70,80,90],courseGrand='null'}
// 优秀
// Student{courseNo=3,name='李四',type='研究生'course=[70,80,90],courseGrand='null'}
// 良好
// Student{courseNo=3,name='王五',type='本科生'course=[70,80,90],courseGrand='null'}
// 优秀
// Student{courseNo=3,name='陈六',type='研究生'course=[70,80,90],courseGrand='null'}
// 良好
// Student{courseNo=3,name='赵七',type='本科生'course=[70,80,90],courseGrand='null'}
// 优秀
