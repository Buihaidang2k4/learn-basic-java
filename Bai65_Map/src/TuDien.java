import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> duLieu = new TreeMap<String,String>();
	
	
	public String themTu(String tuKhoa,String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}

	
	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa)
	{
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}
	
	// In ra từ khóa
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	
}
