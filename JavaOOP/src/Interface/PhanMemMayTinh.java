package Interface;
// Tương tự kiểu đa kế thừa trong c++, 1 class PMMT kế thừa nhiều interface MTBT, SX
// Việc của chúng ta là cần cụ thể lại các phương thức vừa được kế thừa từ các lớp cha
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		int i, j, min_idx;
		for (i = 0; i < n - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		int i, j, min_idx;
		for (i = 0; i < n - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] > arr[min_idx])
					min_idx = j;
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

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
		if(b == 0) {
			return 0;
		}
		return a/b;
	}

}
