
public class Lab6b3 {

	    // Các thuộc tính
	    private String maSV;
	    private String hoTen;
	    private String ngaySinh;
	    private double diemTrungBinh;

	    // Constructor không có tham số
	    public Lab6b3() {
	        this.maSV = "";
	        this.hoTen = "";
	        this.ngaySinh = "";
	        this.diemTrungBinh = 0.0;
	    }

	    // Constructor có tham số
	    public Lab6b3(String maSV, String hoTen, String ngaySinh, double diemTrungBinh) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.ngaySinh = ngaySinh;
	        this.diemTrungBinh = diemTrungBinh;
	    }

	    // Getter và Setter cho các thuộc tính
	    public String getMaSV() {
	        return maSV;
	    }

	    public void setMaSV(String maSV) {
	        this.maSV = maSV;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public String getNgaySinh() {
	        return ngaySinh;
	    }

	    public void setNgaySinh(String ngaySinh) {
	        this.ngaySinh = ngaySinh;
	    }

	    public double getDiemTrungBinh() {
	        return diemTrungBinh;
	    }

	    public void setDiemTrungBinh(double diemTrungBinh) {
	        this.diemTrungBinh = diemTrungBinh;
	    }

	    // Phương thức hienThi để hiển thị tất cả thông tin sinh viên
	    public void hienThi() {
	        System.out.println("MaSV: " + maSV);
	        System.out.println("HoTen: " + hoTen);
	        System.out.println("NgaySinh: " + ngaySinh);
	        System.out.println("DiemTrungBinh: " + diemTrungBinh);
	    }

	    // Phương thức namSinh để lấy năm sinh từ chuỗi ngày sinh
	    public String namSinh() {
	        // Giả định định dạng ngày sinh là dd-MM-yyyy hoặc dd/MM/yyyy
	        if (ngaySinh != null && !ngaySinh.isEmpty()) {
	            // Lấy 4 ký tự cuối cùng là năm sinh
	            return ngaySinh.substring(ngaySinh.length() - 4);
	        }
	        return "N/A";  // Trả về "N/A" nếu ngày sinh chưa được thiết lập
	    }

	    public static void main(String[] args) {
	        // Tạo đối tượng sinh viên và hiển thị thông tin
	        Lab6b3 sv = new Lab6b3("SV001", "Nguyen Van A", "10-04-2004", 8.0);
	        
	        // Gọi phương thức hienThi để hiển thị thông tin sinh viên
	        sv.hienThi();
	        
	        // Gọi phương thức namSinh để hiển thị năm sinh
	        System.out.println("NamSinh: " + sv.namSinh());
	    }
	}
