package t3h.k35dl;

import java.util.Scanner;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {

        // DichVu dv = new DvThuốc();
        DichVu dv = new DvThuốc(); // Chỉ định người thực hiện hợp đồng

        while (true) {
            out.print("\n+-------------------------------------------------------------------------------+");
            out.print("\n| CHƯƠNG TRÌNH QUẢN LÝ DANH SÁCH THUỐC. (c) 2023.12.04 15h26                |");
            out.print("\n+--------------------------------MENU-------------------------------------------+");
            out.print("\n| 1. Thêm | 2. Sửa | 3. Xoá | 4. Sắp Xếp | 5. Phân Loại | 6. Min Max | 0. Thoát |");
            out.print("\n| 7. Tìm Kiếm | 8. Lưu File | 9. Mở File |                                      |");
            out.print("\n+-------------------------------------------------------------------------------+");

            out.print("\n Chọn menu: ");
            var scan = new Scanner(System.in);
            var menu = scan.nextInt();
            // scan.close();

            switch (menu) {
                case 1:
                    // làm việc 1
                    dv.ThêmThuốc();
                    break;
                case 2:
                    // làm việc 2
                    dv.SửaThuốc();
                    break;
                case 3:
                    // làm việc
                    dv.XóaThuốc();
                    break;
                case 4:
                    // làm việc 4
                    dv.SắpXếpThuốc();
                    break;
                case 5:
                    // làm việc 5
                    dv.PhânLoạiThuốc();
                    break;
                case 6:
                    // làm việc 6
                    dv.MinMax();
                    break;
                case 7:
                    // làm việc 7
                    dv.TìmKiếmThuốc();
                case 8:
                    // làm việc 8
                    dv.LưuDanhSáchVàoFile();
                case 9:
                    // làm việc 9
                    dv.MởDanhSáchTừFile();
                case 0:
                    out.print("\n Đang thoát...");
                    // Thread.sleep(3000);
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    out.print("\n Hãy nhập menu hợp lệ !");
                    break;
            }

        } // kết thúc vòng lặp menu
    }// kết thúc main()
}// kết thúc lớp