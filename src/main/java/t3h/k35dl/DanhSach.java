package t3h.k35dl;

interface DanhSach<T> {
    void Thêm(T t);

    void Sửa(T t, int chỉ_số);

    void Xóa(int chỉ_số);

    void Xếp();

    void Nhóm();

    void MMA();

    void Cột();

    void Dòng(T dt, int stt);

    void Bảng();

    void GhiFile();

    void ĐọcFile();
}
