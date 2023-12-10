package t3h.k35dl;

public interface// hợp đồng ràng buộc chức năng
DichVu {
    void ThêmThuốc();

    void SửaThuốc();

    void XóaThuốc();

    void SắpXếpThuốc();

    // Phân loại theo nhóm máu, giới
    void PhânLoạiThuốc();

    void MinMax();
    // Điểm, Năm Sinh, Tuổi

    void ĐiểmTrungBình();

    // Hàm này không có trong ds
    void TìmKiếmThuốc();

    // void LưuFile();
    void LưuDanhSáchVàoFile();

    // void MởFile();
    void MởDanhSáchTừFile();
}
