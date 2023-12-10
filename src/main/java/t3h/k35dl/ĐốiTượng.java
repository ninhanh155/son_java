package t3h.k35dl;

import java.util.Date;

abstract// trừu tượng
class// lớp
ĐốiTượng 
{
    // String Tên;

    // // Hạn sử dụng: chuỗi
    // String hsd;

    // // Đơn giá
    // float Giá;

    // // Nguồn gốc 
    // String nsx;

    // // số lượng 
    // int số_lượng;

    // double thanhtien;
    String Tên;
    String nsx;
    int số_lượng;

    Date NgàyTạo;
    // Date NgàyXóa;

    String ThôngBáoLỗi;

    abstract void Nhập();

    abstract void Xuất();

    String Lỗi() 
    {
        return this.ThôngBáoLỗi;
    }
}
