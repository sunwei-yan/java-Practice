package pack;
public class GoodsGroup {
	//新建一个数组管理商品
	Goods [] list =new Goods[100];
	
	//初始化索引
	int index=0;
	
	//商品添加功能
	public void add(Goods s) {
		list[index]=s;
		index++;
		
	}
	
	//显示所有商品的信息
	public void show() {
		for(int i=0;i<list.length;i++) {
			Goods s=list[i];
			if(s!=null) {
			System.out.println(s.getName());
		}
	}
   
}
public void serach(String ne) {
    int flag=0;
    for(int i=0;i<list.length;i++) {
        Goods s=list[i];
        if(s!=null&&s.getName()==ne) {
        System.out.println(i);
        flag=1;
    }
   
}
if(flag==0){
    System.out.println("error");
}
}
public void delete(String ne) {
    for(int i=0;i<list.length;i++) {
        Goods s=list[i];
        if(s!=null&&s.getName()==ne) {
        for(int j=i;j<list.length-1;j++){
            list[j]=list[j+1];
        }
    }
}

}
}