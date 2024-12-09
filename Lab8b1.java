
package Lab8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab8b1 {
    public static void main(String[] args) {
        // Khởi tạo danh sách sinh viên
        ArrayList<SinhVienNam3> danhSachSV = new ArrayList<>();
        
        // Thêm các đối tượng SinhVienNam3 vào danh sách
        danhSachSV.add(new SinhVienNam3("22S1020034", "Nguyễn Thị Thùy Linh", "18/12/2004", 9.5 , "Trường THPT Phú Bài", 10.0));
        danhSachSV.add(new SinhVienNam3("22S1020001", "Nguyễn Văn A", "01/01/2004", 6.5 , "Trường THPT Phú Bài", 7.0));
        danhSachSV.add(new SinhVienNam3("22S1020002", "Nguyễn Thị B", "02/02/2004", 7.5 , "Trường THPT Phú Bài", 8.0));
        danhSachSV.add(new SinhVienNam3("22S1020003", "Trần Hà C", "03/03/2004", 9 , "Trường THPT Phú Bài", 9));
        danhSachSV.add(new SinhVienNam3("22S1020004", "Lê Cẩm D", "04/04/2004", 7.0 , "Trường THPT Phú Bài", 7.5));

        // Hiển thị thông tin của các sinh viên
        for (SinhVienNam3 sv : danhSachSV) {
            sv.hienThi();
            System.out.println();
        }

        // Sắp xếp danh sách sinh viên theo ketQuaKienTap từ thấp đến cao
        Collections.sort(danhSachSV, Comparator.comparingDouble(SinhVienNam3::getKetQuaKienTap));

        // Hiển thị danh sách sinh viên sau khi sắp xếp
        System.out.println("Danh sach sinh vien theo thu tu ket qua kien tap:");
        for (SinhVienNam3 sv : danhSachSV) {
            sv.hienThi();
            System.out.println();
        }
    }
}
