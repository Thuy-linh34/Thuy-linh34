package baitap;
import java.util.HashMap;  
import java.util.Map; 
public class bai3 {
	    // Bài 1: Hàm gioiThieu để hiển thị thông tin cá nhân
	    public static void gioiThieu() {
	        // Thông tin cá nhân
	        String hoTen = "Nguyen Thi Thuy Linh";
	        int tuoi = 19;
	        String diaChi = "131, Tran Phu, Thua Thien Hue";
	        String ngheNghiep = "Sinh Vien";

	        // Hiển thị thông tin ra màn hình
	        System.out.println("Thông tin cá nhân:");
	        System.out.println("Họ và tên: " + hoTen);
	        System.out.println("Tuổi: " + tuoi);
	        System.out.println("Địa chỉ: " + diaChi);
	        System.out.println("Nghề nghiệp: " + ngheNghiep);
	    }

	    // Bài 2 a): Hàm max2 để tìm số lớn nhất trong 2 số
	    public static int max2(int so1, int so2) {
	        return (so1 > so2) ? so1 : so2;
	    }

	    // Bài 2 b): Hàm max3 để tìm số lớn nhất trong 3 số
	    public static int max3(int so1, int so2, int so3) {
	        // Gọi hàm max2 để so sánh
	        return max2(max2(so1, so2), so3);
	    }

	    // Bài 3: Hàm maxArray để tìm số lớn nhất trong mảng
	    public static int maxArray(int[] myArray) {
	        // Kiểm tra nếu mảng rỗng
	        if (myArray == null || myArray.length == 0) {
	            throw new IllegalArgumentException("Mảng rỗng hoặc không hợp lệ");
	        }

	        // Giả sử phần tử đầu tiên là lớn nhất
	        int max = myArray[0];

	        // Duyệt qua mảng để tìm số lớn nhất
	        for (int i = 1; i < myArray.length; i++) {
	            if (myArray[i] > max) {
	                max = myArray[i];
	            }
	        }

	        return max;
	    }
	    
	    // Bài 4: Hàm frequency để tìm tần suất xuất hiện lớn nhất của ký tự
	    public static int frequency(String str) {
	        // Tạo một HashMap để lưu tần suất xuất hiện của mỗi ký tự
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        // Duyệt qua từng ký tự trong chuỗi
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            // Nếu ký tự đã tồn tại trong map, tăng tần suất của nó lên
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // Nếu không, thêm ký tự mới vào map với tần suất ban đầu là 1
	                charCountMap.put(c, 1);
	            }
	        }
	        
	        // Biến để lưu tần suất lớn nhất
	        int maxFrequency = 0;

	        // Duyệt qua các giá trị trong map để tìm tần suất lớn nhất
	        for (int frequency : charCountMap.values()) {
	            if (frequency > maxFrequency) {
	                maxFrequency = frequency;
	            }
	        }
	        // Trả về tần suất lớn nhất
	        return maxFrequency;
	    }
	    
	    // Hàm main để chạy chương trình và kiểm tra các hàm
	    public static void main(String[] args) {
	        // Gọi hàm gioiThieu
	        gioiThieu();

	        // Kiểm tra hàm max2
	        int so1 = 10;
	        int so2 = 20;
	        System.out.println("Số lớn nhất trong 2 số là: " + max2(so1, so2));

	        // Kiểm tra hàm max3
	        int so3 = 50;
	        System.out.println("Số lớn nhất trong 3 số là: " + max3(so1, so2, so3));

	        // Kiểm tra hàm maxArray
	        int[] myArray = {3, 5, 7, 2, 8};
	        System.out.println("Số lớn nhất trong mảng là: " + maxArray(myArray));
	        
	        // Kiểm tra hàm frequency
	        String str = "hello";
	        System.out.println("Tần suất xuất hiện lớn nhất của ký tự là: " + frequency(str));  // Kết quả: 2
	    }
	}