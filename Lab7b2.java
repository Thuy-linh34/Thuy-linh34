
	import java.util.Random;
	import java.util.Scanner;
	public class Lab7b2 {
		
	    public static void main(String[] args) {
	        // Khởi tạo mảng 100 phần tử số nguyên ngẫu nhiên
	        int[] mangSo = new int[100];
	        Random rand = new Random();
	        
	        // Sinh các số ngẫu nhiên trong khoảng từ 0 đến 100
	        for (int i = 0; i < mangSo.length; i++) {
	            mangSo[i] = rand.nextInt(101); // Số ngẫu nhiên từ 0 đến 100
	        }
	        
	        // Hiển thị mảng ban đầu
	        System.out.println("Mảng ban đầu:");
	        for (int i : mangSo) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        try (// Nhập vào 2 giá trị vt1 và vt2 từ bàn phím
			Scanner scanner = new Scanner(System.in)) {
				System.out.print("Nhập vị trí thứ nhất (vt1): ");
				int vt1 = scanner.nextInt();
				System.out.print("Nhập vị trí thứ hai (vt2): ");
				int vt2 = scanner.nextInt();
				
				// Gọi hàm swap để đổi chỗ 2 phần tử
				swap(mangSo, vt1, vt2);
			}
	        // Hiển thị mảng sau khi đổi chỗ
	        System.out.println("Mảng sau khi đổi chỗ:");
	        for (int i : mangSo) {
	            System.out.print(i + " ");
	        }
	    }
	    
	    // Hàm swap để đổi chỗ 2 phần tử trong mảng
	    public static void swap(int[] mang, int i1, int i2) {
	        if (i1 >= 0 && i1 < mang.length && i2 >= 0 && i2 < mang.length) {
	            int temp = mang[i1];
	            mang[i1] = mang[i2];
	            mang[i2] = temp;
	        } else {
	            System.out.println("Chỉ số không hợp lệ");
	        }
	    }
	}

