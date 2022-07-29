package pack;
public class Goods {
    //属性
	private int number;
	private String name;
	private String identifier;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getidentifier() {
		return identifier;
	}
	public void setidentifier(String identifier) {
		this.identifier = identifier;
	}
	
	
	//构造器
	public Goods(int number,String name,String identifier) {
		this.number=number;
		this.name=name;
		this.identifier=identifier;

		
	}
	//显示商品的信息
	
	
}

