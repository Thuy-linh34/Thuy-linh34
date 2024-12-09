import java.util.Random;

public class Lab7b3 {
	    public static void main(String[] args) {
	        // Khởi tạo mảng mangSo với 15 phần tử số nguyên ngẫu nhiên
	        int[] mangSo = new int[15];
	        Random rand = new Random();
	        
	        for (int i = 0; i < mangSo.length; i++) {
	            mangSo[i] = rand.nextInt(16); // Sinh các số ngẫu nhiên từ 0 đến 15
	        }
	        
	        // Hiển thị mảng trước khi sắp xếp
	        System.out.println("Mảng ban đầu:");
	        for (int i : mangSo) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        // Gọi hàm sort để sắp xếp mảng
	        sort(mangSo);
	        
	        // Hiển thị mảng sau khi sắp xếp
	        System.out.println("Mảng sau khi sắp xếp tăng dần:");
	        for (int i : mangSo) {
	            System.out.print(i + " ");
	        }
	    }
	    
	    // Hàm sort sử dụng thuật toán nổi bọt (Bubble Sort)
	    public static void sort(int[] mang) {
	        int n = mang.length;
	        boolean swapped;
	        // Lặp qua mảng
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            // Lặp qua các phần tử chưa được sắp xếp
	            for (int j = 0; j < n - i - 1; j++) {
	                // Đổi chỗ nếu phần tử trước lớn hơn phần tử sau
	                if (mang[j] > mang[j + 1]) {
	                    // Gọi hàm swap để đổi chỗ
	                    int temp = mang[j];
	                    mang[j] = mang[j + 1];
	                    mang[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // Nếu không có sự hoán đổi nào xảy ra, nghĩa là mảng đã sắp xếp xong
	            if (!swapped) break;
	        }
	    }
	}

