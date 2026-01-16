package capgtraining;

public class Vector2D {
	
	private double x,y;
	
	public static final Vector2D ZERO=new Vector2D(0, 0);
	public static final Vector2D UNIT_X=new Vector2D(1, 0);
	public static final Vector2D UNIT_Y=new Vector2D(0, 1);
	
	
	public Vector2D(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public static Vector2D fromPolar(double r, double theta) {
		return new Vector2D(r*Math.cos(theta), r*Math.sin(theta));
	}
	
	Vector2D add(Vector2D other) {
		return new Vector2D(other.x + this.x, other.y + this.y);
	}
	
	Vector2D scale(double s) {
		return new Vector2D(s*this.x, s*this.y);
	}
	
	double magnitude() {
		return Math.sqrt(x*x + y*y);
	}
	
	void print() {
		System.out.println("("+this.x+","+this.y+")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector2D v = Vector2D.fromPolar(2, Math.PI/2); // (0,2)
		v.print();
		Vector2D w = Vector2D.UNIT_X.add(v);           // (1,2)
		w.print();
	}

}
