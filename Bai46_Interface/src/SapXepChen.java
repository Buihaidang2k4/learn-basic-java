
public class SapXepChen implements SapXepInterface {

	@Override
	public void SapXepTang(double[] arr) {
		double key;
		int i,j;
		for ( i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i-1;
			
			while(j>= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	@Override
	public void SapXepGiam(double[] arr) {
		double key;
		int i,j;
		for ( i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i-1;
			
			while(j>= 0 && arr[j] < key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

}
