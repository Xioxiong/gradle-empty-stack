
public class Mobile {
	private String name;
	private String color;
	private String brand;
	
	public Mobile(String name, String color, String brand) {
		this.name = name;
		this.color = color;
		this.brand = brand;
	}
	
	public void call(String title,String message) {
		System.out.println("<"+title+">"+"��Ϣ��"+message);
	}
}
