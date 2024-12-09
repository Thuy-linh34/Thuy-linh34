public class Lab6b1 {

    // Các thuộc tính với từ khóa truy cập private
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private double diemTrungBinh;

    // Constructor mặc định
    public Lab6b1() {}

    // Constructor với tham số
    public Lab6b1(String maSV, String hoTen, String ngaySinh, double diemTrungBinh) {
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

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Tạo đối tượng Sinh viên và thiết lập các thuộc tính
        Lab6b1 sv = new Lab6b1("SV22S1020034", "Nguyễn Thị Thùy Linh", "18/12/2004", 7.0);

        // In thông tin sinh viên
        System.out.println("Ma SV: " + sv.getMaSV()); 
        System.out.println("Ho Ten: " + sv.getHoTen());
        
        System.out.println("Ngay Sinh: " + sv.getNgaySinh());
        System.out.println("Diem Trung Binh: " + sv.getDiemTrungBinh());
    }
}
