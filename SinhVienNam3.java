package Lab8;
//File SinhVienNam3.java
public class SinhVienNam3 extends SinhVien {
   private String noiKienTap;     // Nơi kiến tập
   private double ketQuaKienTap;  // Kết quả kiến tập

 // Constructor có tham số để khởi tạo đầy đủ thông tin
   public SinhVienNam3(String maSV, String hoTen, String ngaySinh, double diemTB, String noiKienTap, double ketQuaKienTap) {
     super(maSV, hoTen, ngaySinh, diemTB);
     this.noiKienTap = noiKienTap;
     this.ketQuaKienTap = ketQuaKienTap;
 }


 // Getter và Setter cho noiKienTap
   public String getNoiKienTap() {
     return noiKienTap;
 }

   public void setNoiKienTap(String noiKienTap) {
     this.noiKienTap = noiKienTap;
 }

 // Getter và Setter cho ketQuaKienTap
   public double getKetQuaKienTap() {
	 return ketQuaKienTap;
 }

   public void setKetQuaKienTap(double ketQuaKienTap) {
	 this.ketQuaKienTap = ketQuaKienTap;
 }
 
  // Phương thức hienThi()
   public void hienThi() {
     System.out.println("Ma SV: " + getMaSV());
     System.out.println("Ho ten: " + getHoTen());
     System.out.println("Ngay sinh: " + getNgaySinh());
     System.out.println("Diem TB: " + getDiemTB());
     System.out.println("Noi kien tap: " + noiKienTap);
     System.out.println("Ket qua kien tap: " + ketQuaKienTap);
     System.out.println("Xep loai kien tap: " + xepLoaiKienTap());
   }

     // Phương thức xepLoaiKienTap()
   public String xepLoaiKienTap() {
      if (ketQuaKienTap >= 8.5) return "A";
      else if (ketQuaKienTap >= 7.0) return "B";
      else if (ketQuaKienTap >= 5.0) return "C";
      else if (ketQuaKienTap >= 4.0) return "D";
      else return "E";
     }
}
