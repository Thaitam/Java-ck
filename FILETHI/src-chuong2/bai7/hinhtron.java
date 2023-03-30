package bai7;

public class hinhtron {
	protected float pi = 3.14f;
	private float bankinh;
	private float dientich;
	private float chuvi;
	
	public hinhtron(float bankinh) {
		this.bankinh = bankinh;
	}
	
	public void tinhdientich() {
		dientich = pi * bankinh * bankinh;
	}
	
	public void tinhchuvi() {
		chuvi = 2 * pi * bankinh;
	}
	
	public float getdientich() {
		return dientich;
	}
	
	public float getchuvi() {
		return chuvi;
	}
		
}
