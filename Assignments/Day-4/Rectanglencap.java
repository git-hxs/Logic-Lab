package capgtraining;

public class Rectanglencap {
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		if(width>0)
		this.width=width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if(height>0)
		this.height=height;
	}
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return 2*(this.width + this.height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectanglencap r = new Rectanglencap();
		r.setWidth(10);
		r.setHeight(5);
		System.out.println(r.area());      // 50.0
		System.out.println(r.perimeter()); // 30.0
		r.setWidth(0); // silently rejected (bonus)
		System.out.println(r.getWidth());
	}

}
