/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.banjo.mathutil.core;

/**
 *
 * @author tuan3
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //class này chứa hàm static, chấm xài luôn
    //tính n giai thừa n!= 1,2,3,4,......
    // quy ước thiết kế hàm này như sau
    //0! = 1! = 1
    // không có giai thừa số âm. Nếu đưa số âm, CHỬI
    // giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    //do đó 21! ko dùng kiểu long được. Nếu đưa > 21. CHỬI
    //CHỬI: ko trả về giá trị gì cả mà NÉM RA NGOẠI LỆ EXCEPTION
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; // tích nhân dồn khởi động từ 1
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
    
    public static long getFactorial1(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial1(n - 1);
        //công thức đệ quy - recursion
}
}
// 5! = 1.2.3.4.5 = 4! x 5 = 5 x 4!
// 4! = 4 x 3!
// 3! = 3 x 2!
// 2! = 2 x 1!
// 1! = 1 DỪNG LẠI HỎI NGƯỢC LÊN TRÊN

// TDD: Test Driven Development phát triển phần mềm theo phong cách code đến đâu kiểm thử đến đó,
// viết code và viết test case/ test run diễn ra song song, đan xen
// cứ có hàm là có test case
// viết ra các test case đủ bao quát các tình huống xài hàm
// test case: là bộ dữ liệu dùng để đưa vào app/ hàm để mô phỏng lại
// 1 tình huống xài app/hàm. Nó có input data, giải thích cách dùng hàm/ app
// và có giá trị trả về expected
// lát hồi run (test run/ test execution) để luận đúng sai
//DÂN DEV GIỐNG DÂN QC Ở CHỖ NÀY:
//ĐỀU PHẢI VIẾT/ TẠO RA TEST CASE, ĐỀU PHẢI TIẾN HÀNH RUN/ CHẠY TEST
//VÀ NẾU PHẢI ĐỌC KẾT QUẢ ĐÚNG SAI
// DEV KHÁC TESTER LÀ PHẢI VIẾT CODE LÀM APP!!!!
// Test case ko viết tự do mà viết theo template
// Viết tự do: 0! ==> 1; 1! ==> 1; 2! ==> 2; 3! ==> 6; 5! ==> 120
// Viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI PE, KHÓA LUẬN T/N VÀ ĐI LÀM
//Test case #1: (mục tiêu test) check getF() with n = 0
//Steps-Procedures ( cách tiến hành test - input/output...)
//              1. Given n = 0
//              2. Call the getF(n) (getF(0))
// Expected 
