
public class PhanMemMayTinh implements MayTinhBoTuiInterface,SapXepInterface  {

	@Override
	public void SapXepTang(double[] arr) {
		int n = arr.length;
		int i,j,min;
		for(i = 0; i<n-1;i++)
		{
			min = i;
			for ( j = i+1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;

					double temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	@Override
	public void SapXepGiam(double[] arr) {
		int n = arr.length;
		int i,j,min;
		for(i = 0; i<n-1;i++)
		{
			min = i;
			for ( j = i+1; j < n; j++) {
				if (arr[j] > arr[min]) {
					min = j;

					double temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	@Override
	public double Cong(double a, double b) {
		return a+b;
	}

	@Override
	public double Tru(double a, double b) {
		return a-b;
	}

	@Override
	public double Nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double Chia(double a, double b) {
		return a/b;
	}

}
