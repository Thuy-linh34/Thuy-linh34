package baitap;

public class lab4 {

    // Doanh thu trong 12 tháng
    static int[] doanhThu = {
        10000000, 12000000, 15000000, 11000000, 16000000, 17000000, 14000000, 11000000, 12500000, 16500000, 13000000, 10000000
    };

    // Tên các tháng
    static String[] months = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static void main(String[] args) {
        // Khởi tạo biến cho doanh thu cao nhất, thấp nhất và tổng doanh thu
        int minDoanhThu = doanhThu[0];
        int maxDoanhThu = doanhThu[0];
        int minMonthIndex = 0;  // Vị trí của tháng có doanh thu thấp nhất
        int maxMonthIndex = 0;  // Vị trí của tháng có doanh thu cao nhất
        int totalDoanhThu = 0;

        // Tìm doanh thu thấp nhất, cao nhất và tính tổng doanh thu
        for (int i = 0; i < doanhThu.length; i++) {
            totalDoanhThu += doanhThu[i];  // Cộng dồn doanh thu để tính trung bình

            if (doanhThu[i] < minDoanhThu) {
                minDoanhThu = doanhThu[i];
                minMonthIndex = i;  // Lưu chỉ số của tháng có doanh thu thấp nhất
            }

            if (doanhThu[i] > maxDoanhThu) {
                maxDoanhThu = doanhThu[i];
                maxMonthIndex = i;  // Lưu chỉ số của tháng có doanh thu cao nhất
            }
        }

        // Tính doanh thu trung bình
        double averageDoanhThu = (double) totalDoanhThu / doanhThu.length;

        // Hiển thị kết quả
        System.out.println("Doanh thu thấp nhất: " + minDoanhThu + " (tháng: " + (minMonthIndex + 1) + ")");
        System.out.println("Doanh thu cao nhất: " + maxDoanhThu + " (tháng: " + (maxMonthIndex + 1) + ")");
        System.out.println("Doanh thu trung bình: " + averageDoanhThu);

        // Phần b: Hiển thị tên tháng có doanh thu thấp nhất và cao nhất
        System.out.println("Tháng có doanh thu thấp nhất: " + months[minMonthIndex]);
        System.out.println("Tháng có doanh thu cao nhất: " + months[maxMonthIndex]);
    }

    //Bài 2: Hàm tìm doanh thu thấp nhất (a)
    //public static int doanhThuThapNhat() {
        //int minDoanhThu = doanhThu[0];
        //for (int i = 1; i < doanhThu.length; i++) {
            //if (doanhThu[i] < minDoanhThu) {
                //minDoanhThu = doanhThu[i];
            //}
        //}
        //return minDoanhThu;
    //}

    // Hàm tìm doanh thu cao nhất (a)
    //public static int doanhThuCaoNhat() {
        //int maxDoanhThu = doanhThu[0];
        //for (int i = 1; i < doanhThu.length; i++) {
            //if (doanhThu[i] > maxDoanhThu) {
                //maxDoanhThu = doanhThu[i];
            //}
        //}
        //return maxDoanhThu;
    //}

    // Hàm tính doanh thu trung bình (a)
    public static double doanhThuTrungBinh() {
        int totalDoanhThu = 0;
        for (int i = 0; i < doanhThu.length; i++) {
            totalDoanhThu += doanhThu[i];
        }
        return (double) totalDoanhThu / doanhThu.length;
    }

    // Hàm tìm tên tháng có doanh thu thấp nhất (b)
    public static String tenThangDoanhThuThapNhat() {
        int minDoanhThu = doanhThu[0];
        int minIndex = 0;
        for (int i = 1; i < doanhThu.length; i++) {
            if (doanhThu[i] < minDoanhThu) {
                minDoanhThu = doanhThu[i];
                minIndex = i;
            }
        }
        return months[minIndex];
    }

    // Hàm tìm tên tháng có doanh thu cao nhất (b)
    public static String tenThangDoanhThuCaoNhat() {
        int maxDoanhThu = doanhThu[0];
        int maxIndex = 0;
        for (int i = 1; i < doanhThu.length; i++) {
            if (doanhThu[i] > maxDoanhThu) {
                maxDoanhThu = doanhThu[i];
                maxIndex = i;
            }
        }
        return months[maxIndex];
    }
}