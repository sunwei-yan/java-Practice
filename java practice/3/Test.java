package pack;
public class Test {

	public static void main(String[] args) {

		GoodsGroup st=new GoodsGroup();
		st.add(new Goods(1, "apple", "10086"));//增
		st.add(new Goods(2, "bana", "10086"));//增
		st.show();
    System.out.println();
		st.add(new Goods(2, "pear", "10086"));//增
    st.show();
    System.out.println();
    st.serach("orange");//查
    st.serach("bana");//查
    st.delete("pear");//删
    st.show();//显示
	}

}
// 输出结果
// apple
// /bana

// apple          //添加一个pear
// bana
// pear
// 1             //bana的下标为1
// error        //查不到orange
// apple        //删除了pear
// bana
