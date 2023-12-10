package t3h.k35dl;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.SimpleDateFormat;

// Các thư viện phục vụ việc đọc ghi File JSON
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class// lớp
// DsSinhVien implements Ds<Thuốc> {
DsThuốc implements DanhSach<Thuốc> {

    List<Thuốc> ds;

    public DsThuốc() {
        ds = new ArrayList<Thuốc>();
    }

    @Override
    public void Thêm(Thuốc t) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Thêm'");
        ds.add(t);
    }

    @Override
    public void Sửa(Thuốc t, int chỉ_số) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Sửa'");
        ds.set(chỉ_số, t);
    }

    @Override
    public void Xóa(int chỉ_số) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Xóa'");
        ds.remove(chỉ_số);
    }

    @Override
    public void Xếp() {

        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Xếp'");

        out.print("\n  Sắp Xếp Danh Sách Giảm Dần Theo Giá: ");
        for// với mỗi
        (int i = 0; i < ds.size(); i++)// chỉ số
        {
            for// xem xét j đứng sau i
            (int j = i + 1; j < ds.size(); j++) {
                var giảm_dần = (ds.get(i).Giá > ds.get(j).Giá);

                if// nếu
                (!giảm_dần)// logic sai, không thỏa mãn
                {
                    Thuốc tạm = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, tạm);
                }
            }
        }
    }

    @Override
    public void Nhóm() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Nhóm'");
        // Mảng chứa dữ liệu thống kê

        // List<int> sl = new ArrayList<>(); // mối phần tử = 0

        // List<Integer> sl = new ArrayList<Integer>(ds.size());
        List<Integer> sl = new ArrayList<>(ds.size());

        for (Thuốc t : ds) {
            sl.add(1);
        }
        // for (int i = 0; i < sl.size(); i++) {
        // sl.set(i, 1);
        // }

        // Tinh chỉnh dữ liệu thống kê
        for (int i = 0; i < ds.size(); i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                var i_j_cùng_loại = ds.get(i).nsx == ds.get(j).nsx;

                if// nếu
                (i_j_cùng_loại && sl.get(j) != 0) {
                    sl.set(i, sl.get(i) + 1);
                    sl.set(j, sl.get(j) - 1);
                }
            }
        }

        // In dữ liệu thống kê, phân loại ra màn hình
        for (int i = 0; i < sl.size(); i++) {
            if (sl.get(i) != 0) {
                // out.printf("Nhóm máu A có 3 bạn.");
                out.printf("\n Nhóm máu %c có %d bạn.", ds.get(i).nsx, sl.get(i));
            }
        }
    }

    @Override
    public void MMA() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'MMA'");
        float min;
        float max;
        float sum; // tổng
        float avg; // trung_bình;

        min = ds.get(0).Giá;
        max = ds.get(0).Giá;
        sum = 0.0f;
        avg = 0.0f;

        for// với mỗi
        (Thuốc t : ds) {
            if (min > t.Giá)
                min = t.Giá;
            if (max < t.Giá)
                max = t.Giá;

            sum += t.Giá;
        }
        avg = sum / ds.size();

        out.printf("\n Giá min: %.2f", min);
        out.printf("\n Giá max: %.2f", max);
        out.printf("\n Giá trung bình: %.2f", avg);
    }

    @Override
    public void Cột() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Cột'");
        // mã Java hiện 7 cột trên màn hình Console/Terminal
        out.print("\n+---------------------------------------------------------------+");
        out.print("\n| STT | TÊN THUỐC | HẠN SỬ DỤNG | GÍA | NHÀ SẢN XUẤT | SỐ LƯỢNG |");
        out.print("\n+---------------------------------------------------------------+");

    }

    @Override
    // public void Dòng(Object dt, int stt) {
    public void Dòng(Thuốc dt, int stt) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Dòng'");
        // mã Java hiện dòng (7 cột) trên màn hình Console/Terminal
        // Biến phái sinh
        // SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        // String NgàyNhậpTrường_Text = df.format(dt.NgàyNhậpTrường);

        out.printf("\n| %3d | %-9s | %11s | %3.2f | %12s | %8s |",
                stt, dt.Tên, dt.hsd, dt.Giá, dt.nsx, dt.số_lượng);
        out.print("\n+---------------------------------------------------------------+");
    }

    @Override
    public void Bảng() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'Bảng'");
        out.print("\n Bảng Dữ Liệu Thuốc:");

        // in cột
        Cột();

        // in các dòng
        // @todo Nếu dữ liệu dòng NULL thì sao ?
        for (int i = 0; i < ds.size(); i++) {
            int stt = i + 1;
            Thuốc dữ_liệu = ds.get(i);
            Dòng(dữ_liệu, stt);
        }
    }

    /**
     * @abstract Lưu dữ liệu mảng vào tệp, với định dạng JSON
     *           Các dị thường có thể xảy ra:
     *           -UnsupportedEncodingException: Chuỗi kí tự sử dụng lược đồ mã hóa
     *           không hỗ trợ
     *           -FileNotFoundException: Không tìm thấy tệp trên ổ cứng
     *           Khi nhập đường dẫn tệp file từ Terminal/Console thì nên
     *           dùng dấu suộc trái '/' để biểu diễn. Đỡ bị lỗi
     *           FileNotFoundException
     */
    @Override
    public void GhiFile() {
        // @Todo
        // throw new UnsupportedOperationException("Unimplemented method 'Bảng'");
        // Chuyển đổi mảng Java Array sang chuỗi Java String JSON
        Gson gson = new Gson();
        String jsonContent = gson.toJson(ds);
        // out.println(jsonContent);

        // Đối tượng chịu trách nhiệm viết/ghi
        // nội dung JSON tiếng Việt vào tệp/file trên ổ cứng
        Writer writer;
        try {
            // Đường dẫn tĩnh để test nhanh
            String filePath = "C:\\Users\\Public\\mang.json";

            // Đường dẫn động nhập từ bàn phím:
            var scan = new Scanner(System.in);
            out.print("\n Nhập đường dẫn tệp file cần ghi dữ liệu: ");
            filePath = scan.next();
            // ví dụ: c:/users/public/mang-sinhvien.json

            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(filePath),
                            "UTF-8"));
            writer.write(jsonContent);
            writer.flush();
            writer.close(); // Viết xong phải đóng nó lại nếu không là công cốc !
                            // Đến lúc mở tệp ra lại chẳng thấy có dữ liệu nào được viết vào

        } catch (Exception ex) {
            out.print("\n Lỗi tệp file hoặc mã hóa bộ kí tự UTF8: ");
            ex.printStackTrace();
        }
        // finally {
        // writer.close();
        // }

        System.out.println("\n Đã ghi file JSON");
    }// kết thúc hàm

    /**
     * @abstract Đọc dữ liệu tệp JSON và chuyển đổi nó thành mảng
     *           Các dị thường có thể xảy ra:
     *           -UnsupportedEncodingException: Chuỗi kí tự sử dụng lược đồ mã hóa
     *           không hỗ trợ
     *           -FileNotFoundException: Không tìm thấy tệp trên ổ cứng
     * 
     *           Khi nhập đường dẫn tệp file từ Terminal/Console thì nên
     *           dùng dấu suộc trái '/' để biểu diễn. Đỡ bị lỗi
     *           FileNotFoundException
     */
    @Override
    public void ĐọcFile() {
        // @Todo
        // throw new UnsupportedOperationException("Unimplemented method 'Bảng'");
        Gson gson = new Gson();

        try {
            // Đường dẫn tĩnh để test nhanh
            String filePath = "C:\\Users\\Public\\mang-sinhvien.json";

            // Đường dẫn động nhập từ bàn phím:
            var scan = new Scanner(System.in);
            out.print("\n Nhập đường dẫn tệp file cần đọc dữ liệu: ");
            filePath = scan.next();
            // ví dụ: c:/users/public/mang-sinhvien.json

            JsonReader reader = new JsonReader(new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(filePath),
                            "UTF-8")));

            // ds = gson.fromJson(reader, ArrayList.class);
            // cách làm trên sai, làm vậy với mảng thì được: SinhVien[].class

            // Cách làm đúng khi đọc dữ liệu json ra và đổ vào List
            ds = gson.fromJson(
                    reader,
                    new TypeToken<List<Thuốc>>() {
                    }.getType());

            Bảng();
        } catch (Exception e) {
            out.print("\n Lỗi tệp file hoặc mã hóa bộ kí tự UTF8: ");
            e.printStackTrace();
        }
    }// kết thúc hàm

}
