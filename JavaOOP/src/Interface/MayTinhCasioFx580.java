package Interface;

// Sử dụng "implement" thay vì extends như kế thừa
public class MayTinhCasioFx580 implements MayTinhBoTuiInterface{
	
	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		if (b == 0) {
			return 0;
		} 
		return a/b;
	}
}
