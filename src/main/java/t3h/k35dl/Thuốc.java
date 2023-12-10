package t3h.k35dl;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.Date;
import java.text.SimpleDateFormat;

class// lớp
Thuốc
        extends // mở rộng
        ĐốiTượng {
    // Điểm: số thực
    String hsd;

    // Nhóm Máu: kí tự
    Float Giá;

    Float thanhtien;

    // Giới: logic
    // Boolean Giới;

    // Quick Fix lớp con
    // để VsCode sổ mã tự động của
    // các hàm trừu tượng
    @Override
    void Nhập() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Nhập'");

        var scan = new Scanner(System.in);

        out.print("\n Nhập tên thuốc: ");
        this.Tên = scan.nextLine();

        out.print("\n Nhập nhà sản xuất: ");
        this.nsx = scan.next();// Nếu lỗi thì dùng cách 2 bên dưới:

        // 3.5
        out.print("\n Nhập số lượng: ");
        this.số_lượng = scan.nextInt();


        out.print("\n Nhập hạn sử dụng: ");
        this.hsd = scan.next();
        // scan.close();

        out.print("\n Nhập giá: ");
        this.Giá = scan.nextFloat();


    }

    @Override
    void Xuất() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Xuất'");
    }

    /**
     * Kiểm tra tính hợp lệ về mặt dữ liệu
     * của một đối tượng: Sinh Viên
     * 
     */
    Boolean HợpLệ() {
        var hợp_lệ = true;
        var không_hợp_lệ = false;

        // if(tên ngắn quá)
        // return không_hợp_lệ;

        // if(email sai)
        // {
        // this.ThôngBáoLỗi += "\n Email không hợp lệ";
        // }
        // return không_hợp_lệ;

        return hợp_lệ;
    }

}
