package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ThiSinh implements Serializable {
    private int maThiSinh;
    private String tenThiSinh;
    private TinhThanh queQuan;
    private Date ngaySinh;
    private Boolean gioiTinh;
    private double diemMon1, diemMon2, diemMon3;
    private double total;

    public ThiSinh() {
    }

    public ThiSinh(int maThiSinh, String tenThiSinh, TinhThanh queQuan, Date ngaySinh,
                   Boolean gioiTinh, double diemMon1, double diemMon2, double diemMon3) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.setTotalScore();
    }

    public int getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public TinhThanh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(TinhThanh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }

    public void setTotalScore() {
        this.total = (this.getDiemMon1() + this.getDiemMon2() + this.getDiemMon3()) / 3.0;
    }

    public double getTotalScore() {
        return total;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "maThiSinh=" + maThiSinh +
                ", tenThiSinh='" + tenThiSinh + '\'' +
                ", queQuan=" + queQuan +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", diemMon1=" + diemMon1 +
                ", diemMon2=" + diemMon2 +
                ", diemMon3=" + diemMon3 +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThiSinh thiSinh = (ThiSinh) o;
        return maThiSinh == thiSinh.maThiSinh && Double.compare(thiSinh.diemMon1, diemMon1) == 0 && Double.compare(thiSinh.diemMon2, diemMon2) == 0 && Double.compare(thiSinh.diemMon3, diemMon3) == 0 && Double.compare(thiSinh.total, total) == 0 && Objects.equals(tenThiSinh, thiSinh.tenThiSinh) && Objects.equals(queQuan, thiSinh.queQuan) && Objects.equals(ngaySinh, thiSinh.ngaySinh) && Objects.equals(gioiTinh, thiSinh.gioiTinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maThiSinh, tenThiSinh, queQuan, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3, total);
    }
}
