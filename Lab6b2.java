public class Lab6b2 {
    // Các thuộc tính
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private double diemTrungBinh;

    // Constructor không có tham số
    public Lab6b2() {
        this.maSV = "";
        this.hoTen = "";
        this.ngaySinh = "";
        this.diemTrungBinh = 0.0;
    }

    // Constructor 4 tham số
    public Lab6b2(String maSV, String hoTen, String ngaySinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Constructor 1 tham số
    public Lab6b2(String maSV) {
        this.maSV = maSV;
    }

    // Constructor 2 tham số
    public Lab6b2(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    // Constructor 3 tham số
    public Lab6b2(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
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

    public static void main(String[] args) {
    	//Câu a
        // Sử dụng constructor không có tham số
        Lab6b2 sv1 = new Lab6b2();
        System.out.println("SinhVien 1 - MaSV: " + sv1.getMaSV() + ", HoTen: " + sv1.getHoTen() + ", NgaySinh: " + sv1.getNgaySinh() + ", DiemTrungBinh: " + sv1.getDiemTrungBinh());

        // Sử dụng constructor có 4 tham số
        Lab6b2 sv5 = new Lab6b2("SV22S10200..", "Nguyễn Thị Thùy Linh", "18/12/2004", 7.0);
        System.out.println("SinhVien 5 - MaSV: " + sv5.getMaSV() + ", HoTen: " + sv5.getHoTen() + ", NgaySinh: " + sv5.getNgaySinh() + ", DiemTrungBinh: " + sv5.getDiemTrungBinh());

        //Câu b
        // Sử dụng constructor có 1 tham số
        Lab6b2 sv2 = new Lab6b2("SV22S10200..");
        System.out.println("SinhVien 2 - MaSV: " + sv2.getMaSV() + ", HoTen: " + sv2.getHoTen() + ", NgaySinh: " + sv2.getNgaySinh() + ", DiemTrungBinh: " + sv2.getDiemTrungBinh());

        // Sử dụng constructor có 2 tham số
        Lab6b2 sv3 = new Lab6b2("SV22S10200..", "Nguyễn Thị Thùy Linh");
        System.out.println("SinhVien 3 - MaSV: " + sv3.getMaSV() + ", HoTen: " + sv3.getHoTen() + ", NgaySinh: " + sv3.getNgaySinh() + ", DiemTrungBinh: " + sv3.getDiemTrungBinh());

        // Sử dụng constructor có 3 tham số
        Lab6b2 sv4 = new Lab6b2("SV22S10200..", "Nguyễn Thị Thùy Linh", "18/12/2004");
        System.out.println("SinhVien 4 - MaSV: " + sv4.getMaSV() + ", HoTen: " + sv4.getHoTen() + ", NgaySinh: " + sv4.getNgaySinh() + ", DiemTrungBinh: " + sv4.getDiemTrungBinh());

    }
}
