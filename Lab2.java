
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] soNguyen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Câu a Hiển thị các phần tử của mảng
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + soNguyen[i]);
        }

        //Câu b Gán giá trị cho 5 phần tử đầu tiên là số dương
        for (int i = 0; i < 5; i++) {
            soNguyen[i] = i + 1;  // Các giá trị dương từ 1 đến 5
        }

        // Gán giá trị cho 5 phần tử cuối cùng là số âm
        for (int i = 5; i < 10; i++) {
            soNguyen[i] = -(i - 4);  // Các giá trị âm từ -1 đến -5
        }

        // Hiển thị các phần tử của mảng
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + soNguyen[i]);
        }
        //Câu c Hiển thị toàn bộ giá trị mảng soNguyen
        System.out.println("Giá trị của mảng soNguyen:");
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + soNguyen[i]);
        }
        //Câu d,e Hiển thị giá trị sau khi đảo
        System.out.println("\nGiá trị của mảng soNguyen sau khi đảo:");
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + soNguyen[i]);
        }
        //Câu f  Tạo mảng mới với các phần tử xen kẽ giữa số dương và số âm
        int[] mangXenKe = new int[10];  // Mảng mới có 10 phần tử
        int indexDuong = 0;  // Vị trí của phần tử dương
        int indexAm = 5;     // Vị trí của phần tử âm

        // Xen kẽ các phần tử vào mảng mới
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                mangXenKe[i] = soNguyen[indexDuong++];  // Lấy số dương
            } else {
                mangXenKe[i] = soNguyen[indexAm++];     // Lấy số âm
            }
        }

        // Hiển thị toàn bộ phần tử của mảng xen kẽ
        System.out.println("\nGiá trị của mảng mangXenKe:");
        for (int i = 0; i < mangXenKe.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + mangXenKe[i]);
        }
		    }
		}

