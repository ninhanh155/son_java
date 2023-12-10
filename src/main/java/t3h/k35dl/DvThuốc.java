package t3h.k35dl;

import java.util.Scanner;
import static java.lang.System.out;

class DvThuốc implements DichVu {

    // DanhSach<Thuốc> ds = new DsThuốc();
    DanhSach<Thuốc> ds // khai báo hợp đồng ràng buộc chức năng,
            = new DsThuốc(); // chỉ định ai thực hiện hợp đồng

    @Override
    public void ThêmThuốc() {

        var thuốc = new Thuốc();
        // Tạo sinh viên mới

        thuốc.Nhập();
        // yêu cầu sinh viên cầm bút lên, điền thông tin của mình vào form

        // kiểm duyệt dữ liệu: validate
        if// nếu
        (!thuốc.HợpLệ()) {
            out.print("\n Dữ liệu thuốc không hợp lệ.");
            out.print(thuốc.Lỗi());
        }

        // thêm vào danh sách
        ds.Thêm(thuốc);
    }

    @Override
    public void SửaThuốc() {
        int chỉ_số = 0;
        // vị trí của phần tử cần sửa trong danh sách

        ds.Bảng();
        var scan = new Scanner(System.in);

        out.print("\n Nhập số thứ tự để sửa: ");
        int stt = scan.nextInt();// Nếu lỗi thì dùng cách 2 bên dưới:
        // NămSinh = Int.ParseInt(scan.next());
        // scan.close();

        chỉ_số = stt - 1;

        var thuốc = new Thuốc();
        // Tạo sinh viên mới

        thuốc.Nhập();
        // yêu cầu sinh viên cầm bút lên, điền thông tin của mình vào form

        // kiểm duyệt dữ liệu: validate

        // update vào bản ghi cũ
        ds.Sửa(thuốc, chỉ_số);
    }

    @Override
    public void XóaThuốc() {
        int chỉ_số = 0;
        // vị trí của phần tử cần sửa trong danh sách
        // Kiểm tra chỉ số để xóa xem có hợp lệ

        ds.Bảng();
        var scan = new Scanner(System.in);

        out.print("\n Nhập số thứ tự để xóa: ");
        int stt = scan.nextInt();// Nếu lỗi thì dùng cách 2 bên dưới:
        // NămSinh = Int.ParseInt(scan.next());
        // scan.close();

        chỉ_số = stt - 1;

        // Tiến hành xóa khỏi danh sách
        ds.Xóa(chỉ_số);
    }

    @Override
    public void SắpXếpThuốc() {
        // TODO Auto-generated method stub
        ds.Xếp();
        // throw new UnsupportedOperationException("Unimplemented method 'Xếp'");
        // Gọi hàm Xếp() của lớp DsSinhVien

        ds.Bảng();
    }

    @Override

    public void PhânLoạiThuốc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Nhóm'");
        ds.Nhóm();
    }

    @Override
    public void TìmKiếmThuốc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Nhóm'");
        System.out.println("\n Đang làm....");
    }

    @Override
    public void ĐiểmTrungBình() {
        // TODO Auto-generated method stub
        // // Gọi hàm DsSinhVien.MMA()
    }

    @Override
    // public void LưuFile()
    public void LưuDanhSáchVàoFile() {
        // Gọi hàm DsSinhVien.GhiFile()
        ds.GhiFile();
    }

    @Override
    // public void MởFile()
    public void MởDanhSáchTừFile() {
        // Gọi hàm DsSinhVien.ĐọcFile()
        ds.ĐọcFile();
    }

    @Override
    public void MinMax() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'MinMax'");
        ds.MMA();
    }
}
