package BaiThucHanh2;


public class Diem {
	 float x;
	 float y;
	 
	 public Diem() {}
	 
	public Diem(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public float kc(Diem d) {
		float kc = (float) Math.sqrt((x-d.x)*(x-d.x) +  (y-d.y)*(y-d.y));
		return kc;
	}
	 
	public void inDiem() {
		System.out.println(toString());
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Diem [x=" + x + ", y=" + y + "]";
	}
	 
	 
}
