
public class Lab5 {
    public static void main(String[] args) {

      // BÀI 1: Lưu hệ số vào mảng
        int[] mangHeSo = {5, 8, 4, 12, 6, 9, 2, 7, 3, 11, 25};

      // Cau a Phương thức hiển thị đa thức
        int n = mangHeSo.length - 1;
        StringBuilder daThuc = new StringBuilder();

      // Lặp qua các hệ số để tạo đa thức
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                daThuc.append(mangHeSo[i]);
            } else {
                daThuc.append(mangHeSo[i]).append("x^").append(n - i).append(" + ");
            }
        }

      // BÀI 1: Câu a In ra đa thức sau khi hoàn thành
        System.out.println("Da thuc f(x) = " + daThuc);

      // Câu b Gọi hàm mu và in kết quả
        System.out.println("mu(2, 3) = " + mu(2, 3));  // Kết quả là 8
        
      // Câu c Tính giá trị của đa thức tại x = 2
        int x = 1;
        System.out.println("Gia tri cua da thuc tai x = " + x + " la: " + tinhGiaTriDaThuc(mangHeSo, x));
        
     // Câu d Kiểm tra với đa thức được cho và giá trị tại x = 2
        int[] mangHeSoMoi = {5, 8, 4, 12, 6, 9, 2, 7, 3, 11, 25};
        int x0 = 2;
        System.out.println("Gia tri cua da thuc voi he so moi tai x = " + x0 + " la: " + giaTriDaThuc(mangHeSoMoi, x0));
    
     // Câu e Khởi tạo mảng hệ số cho đa thức có bậc lớn hơn 100
        int[] mangHeSoLon = new int[101]; // Mảng hệ số có bậc 100
        for (int i = 0; i < mangHeSoLon.length; i++) {
            mangHeSoLon[i] = (int) (Math.random() * 10); // Gán giá trị ngẫu nhiên từ 0 đến 9
        }
     // Kiểm tra hiển thị và tính toán với đa thức có bậc lớn hơn 100
        hienThiDaThuc(mangHeSoLon);
        System.out.println("Gia tri cua da thuc co bac > 100 tai x = 2 la: " + tinhGiaTriDaThuc(mangHeSoLon, 2));
     
     // Câu g Ví dụ tính tổng hai đa thức tại x = 2
        int[] mangHeSo1 = {5, 8, 4, 12, 6, 9, 2, 7, 3, 11, 25};
        int[] mangHeSo2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        x = 2;
        System.out.println("Tong hai da thuc tai x = " + x + " la: " + tongDaThuc(mangHeSo1, mangHeSo2, x));
        
        
     // BÀI 2: Câu a,b - Tính tổng giá trị của hai đa thức 
        int[] mangHeSo1_bai2 = {1, 2, 3}; 
        int[] mangHeSo2_bai2 = {2, 0, 1}; 
        x0 = 2;
        int tong = tongDaThucBatKy(mangHeSo1_bai2, mangHeSo2_bai2, x0);
        
      // c. Hiển thị từng đa thức
        System.out.println("Đa thức f(x): " + hienThiDaThuc2(mangHeSo1_bai2));
        System.out.println("Đa thức g(x): " + hienThiDaThuc2(mangHeSo2_bai2));

      // d. Hiển thị đa thức tổng
        System.out.println("Đa thức tổng f(x) + g(x): " + hienThiTongDaThuc(mangHeSo1_bai2, mangHeSo2_bai2));
        
      // e. Tổng giá trị của hai đa thức tại x0
        System.out.println("Tổng giá trị của hai đa thức tại x0 = " + x0 + " là: " + tong);
 
    }
    
    // BÀI 1: Cau b Hàm tính lũy thừa
        public static int mu(int x, int k) {
            return (int) Math.pow(x, k);
    }
        
    // Cau c Hàm tính giá trị đa thức tại x
        public static int tinhGiaTriDaThuc(int[] mangHeSo, int x) {
            int n = mangHeSo.length - 1;
            int ketQua = 0;
          for (int i = 0; i <= n; i++) {
                ketQua += mangHeSo[i] * Math.pow(x, n - i);
        }
        return ketQua;
    }
        
     //Cau d Hàm tính giá trị đa thức tại x0
        public static int giaTriDaThuc(int[] mangHeSo, int x0) {
            int n = mangHeSo.length - 1;
            int ketQua = 0;
            for (int i = 0; i <= n; i++) {
                ketQua += mangHeSo[i] * Math.pow(x0, n - i);
            }
            return ketQua;
        }
        
        
      // Cau e Ví dụ với đa thức có bậc 100
        public static void hienThiDaThuc(int[] mangHeSo) {
            int n = mangHeSo.length - 1;
            StringBuilder daThuc = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                if (i == n) {
                    daThuc.append(mangHeSo[i]);
                } else {
                    daThuc.append(mangHeSo[i]).append("x^").append(n - i).append(" + ");
                }
            }
            System.out.println("Da thuc f(x) = " + daThuc);
        }
      // Cau g Tinh tong hai da thuc tại x = 2 
        public static int tongDaThuc(int[] mangHeSo1, int[] mangHeSo2, int x) {
            int n = mangHeSo1.length;
            int[] mangTong = new int[n];
            for (int i = 0; i < n; i++) {
                mangTong[i] = mangHeSo1[i] + mangHeSo2[i];
            }
            return tinhGiaTriDaThuc(mangTong, x);
        }
        
      // BÀI 2: Hàm tính tổng giá trị của hai đa thức bất kỳ tại x0
        public static int tongDaThucBatKy(int[] mangHeSo1, int[] mangHeSo2, int x0) {
            int giaTri1 = tinhGiaTriDaThuc(mangHeSo1, x0);
            int giaTri2 = tinhGiaTriDaThuc(mangHeSo2, x0);
            return giaTri1 + giaTri2;
        }
        
      // c. Hàm hiển thị một đa thức
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
        
      // d. Hàm hiển thị tổng của hai đa thức
        public static String hienThiTongDaThuc(int[] mangHeSo1, int[] mangHeSo2) {
            int n = Math.max(mangHeSo1.length, mangHeSo2.length); // Độ dài lớn nhất giữa hai mảng
            int[] mangHeSoTong = new int[n];

           // Cộng từng hệ số của hai đa thức
            for (int i = 0; i < n; i++) {
                int heSo1 = i < mangHeSo1.length ? mangHeSo1[mangHeSo1.length - 1 - i] : 0;
                int heSo2 = i < mangHeSo2.length ? mangHeSo2[mangHeSo2.length - 1 - i] : 0;
                mangHeSoTong[n - 1 - i] = heSo1 + heSo2;
            }
            
           // Hiển thị đa thức tổng
            return hienThiDaThuc2(mangHeSoTong);  
        }
        
}
