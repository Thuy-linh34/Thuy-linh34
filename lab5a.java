
public class lab5a {
	// BÀI 3: 
	// Câu a. Thiết kế hàm tichDaThuc để trả về giá trị của đa thức tích tại x0
	public static int tichDaThuc(int[] mangHeSo1, int[] mangHeSo2, int x0) {
	    // Tính giá trị của hai đa thức tại x0
	    int giaTri1 = tinhGiaTriDaThuc(mangHeSo1, x0);
	    int giaTri2 = tinhGiaTriDaThuc(mangHeSo2, x0);

	    // Trả về tích của hai giá trị đó
	    return giaTri1 * giaTri2;
	}

	private static int tinhGiaTriDaThuc(int[] mangHeSo1, int x0) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Câu c. Hiển thị từng đa thức
	public static String hienThiDaThuc2(int[] mangHeSo) {
	    int n = mangHeSo.length - 1;
	    StringBuilder daThuc = new StringBuilder();
	    for (int i = 0; i <= n; i++) {
	        if (i == n) {
	            daThuc.append(mangHeSo[i]);
	        } else {
	            daThuc.append(mangHeSo[i]).append("x^").append(n - i).append(" + ");
	        }
	    }
	    return daThuc.toString();
	}
    
   // Câu d. Hiển thị đa thức tích:
	public static String hienThiTichDaThuc(int[] mangHeSo1, int[] mangHeSo2) {
	    // Đa thức tích là kết quả của việc nhân hai đa thức
	    // Tạo mảng kết quả để lưu hệ số của đa thức tích
	    int[] mangHeSoTich = new int[mangHeSo1.length + mangHeSo2.length - 1];

	    // Tính toán hệ số cho đa thức tích
	    for (int i = 0; i < mangHeSo1.length; i++) {
	        for (int j = 0; j < mangHeSo2.length; j++) {
	            mangHeSoTich[i + j] += mangHeSo1[i] * mangHeSo2[j];
	        }
	    }

	    // Hiển thị đa thức tích
	    return hienThiDaThuc2(mangHeSoTich);
	}
	public static void main(String[] args) {
	    // Câu b: Khởi tạo hệ số cho hai đa thức
	    int[] mangHeSo1 = {1, 2, 3};  // f(x) = x^2 + 2x + 3
	    int[] mangHeSo2 = {4, 0, 5};  // g(x) = 4x^2 + 5

	    // Câu c: Hiển thị từng đa thức
	    System.out.println("Đa thức f(x): " + hienThiDaThuc2(mangHeSo1));
	    System.out.println("Đa thức g(x): " + hienThiDaThuc2(mangHeSo2));

	    // Câu d: Hiển thị đa thức tích
	    System.out.println("Đa thức tích f(x) * g(x): " + hienThiTichDaThuc(mangHeSo1, mangHeSo2));

	    // Câu e: Hiển thị giá trị của đa thức tích tại x0 = 2
	    int x0 = 2;
	    System.out.println("Giá trị của đa thức tích tại x0 = " + x0 + " là: " + tichDaThuc(mangHeSo1, mangHeSo2, x0));
	}
}

