package day05.javase;

public class TestArea {
	private String name = "陈晨";
	private String address = "上海";

	public TestArea() {
		String n = name;
		System.out.println("默认构造：" + n);
	}

	public void work() {
		System.out.println(this.name + "在" + this.address + "工作");
	}

	public void work(String name) {
		String address = "北京";
		System.out.println(name + " 在" + address + "工作");
	}

	public static void main(String[] args) {
		// 创建一个对象实例
		TestArea ta = new TestArea();
		ta.work();
		ta.work("汪汪");
	}
}
