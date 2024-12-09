
public class Lab7 {
	    public static void main(String[] args) {
	        int[] mang = {1, 2, 3, 4, 5};
	        
	        // Đổi chỗ phần tử tại vị trí 1 và 3
	        swap(mang, 0, 1);
	        
	        // In mảng sau khi đổi chỗ
	        for (int i : mang) {
	            System.out.print(i + " ");
	        }
	    }
	    
	    // Hàm swap để đổi chỗ 2 phần tử trong mảng
	    public static void swap(int[] mang, int i1, int i2) {
	        if (i1 >= 0 && i1 < mang.length && i2 >= 0 && i2 < mang.length) {
	            int temp = mang[i1];   // Lưu giá trị của phần tử thứ i1
	            mang[i1] = mang[i2];   // Gán giá trị của phần tử thứ i2 vào i1
	            mang[i2] = temp;       // Gán giá trị đã lưu vào i2
	        } else {
	            System.out.println("Chỉ số không hợp lệ");
	        }
	    }
	}
