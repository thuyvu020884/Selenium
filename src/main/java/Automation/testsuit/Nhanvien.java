package Automation.testsuit;

import java.util.Scanner;

public class Nhanvien {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng nhân viên
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
       scanner.nextLine(); // Đọc dòng mới 
        
        // Khởi tạo mảng tên nhân viên
        String[] tennv = new String[n];
        
        // Nhập tên nhân viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên nhân viên thứ " + (i + 1) + ": ");
            tennv[i] = scanner.nextLine();
        }
        
        // In ra danh sách tên nhân viên
        System.out.println("\nDanh sách tên nhân viên:");
        for (String name : tennv) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}


