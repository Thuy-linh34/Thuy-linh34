package Lab8;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private double diemTB;

    public SinhVien(String maSV, String hoTen, String ngaySinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    // Getter và setter cho các thuộc tính
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public String getNgaySinh() { return ngaySinh; }
    public double getDiemTB() { return diemTB; }
}
