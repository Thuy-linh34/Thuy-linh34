
import java.util.Arrays;
import java.util.Comparator;

class SinhVien {
    private String ten;
    private String maSV;
    private double diemTB;

    // Constructor
    public SinhVien(String ten, String maSV, double diemTB) {
        this.ten = ten;
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    // Getters
    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    // Phương thức hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("Tên: " + ten + ", Mã SV: " + maSV + ", Điểm TB: " + diemTB);
    }
}

public class Lab6b4 {

    public static void main(String[] args) {
        // b. Tạo 3 đối tượng SinhVien và hiển thị thông tin
        SinhVien sv1 = new SinhVien("Nguyen Van A", "SV001", 8.5);
        SinhVien sv2 = new SinhVien("Le Thi B", "SV002", 7.9);
        SinhVien sv3 = new SinhVien("Tran Van C", "SV003", 9.2);

        SinhVien[] sinhViens = {sv1, sv2, sv3};

        System.out.println("Thông tin sinh viên:");
        for (SinhVien sv : sinhViens) {
            sv.hienThiThongTin();
        }

        // c. Hiển thị thông tin của sinh viên có điểm trung bình cao nhất
        SinhVien svMaxDiem = Arrays.stream(sinhViens)
                .max(Comparator.comparingDouble(SinhVien::getDiemTB))
                .orElse(null);

        System.out.println("\nSinh viên có điểm trung bình cao nhất:");
        if (svMaxDiem != null) {
            svMaxDiem.hienThiThongTin();
        }

        // d. Hiển thị thông tin của 3 sinh viên theo thứ tự tăng dần của điểm trung bình
        System.out.println("\nSinh viên theo thứ tự tăng dần của điểm trung bình:");
        Arrays.sort(sinhViens, Comparator.comparingDouble(SinhVien::getDiemTB));
        for (SinhVien sv : sinhViens) {
            sv.hienThiThongTin();
        }

        // e. Hiển thị thông tin của 3 sinh viên theo thứ tự tăng dần của tên (ABC)
        System.out.println("\nSinh viên theo thứ tự tăng dần của tên (ABC):");
        Arrays.sort(sinhViens, Comparator.comparing(SinhVien::getTen));
        for (SinhVien sv : sinhViens) {
            sv.hienThiThongTin();
        }
    }
}
