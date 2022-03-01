package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class TinhThanh implements Serializable {
    private int maTinhThanh;
    private String tenTinhThanh;

    public TinhThanh(int maTinhThanh, String tenTinhThanh) {
        this.maTinhThanh = maTinhThanh;
        this.tenTinhThanh = tenTinhThanh;
    }

    public int getMaTinhThanh() {
        return maTinhThanh;
    }

    public void setMaTinhThanh(int maTinhThanh) {
        this.maTinhThanh = maTinhThanh;
    }

    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    @Override
    public String toString() {
        return "TinhThanh{" +
                "maTinhThanh=" + maTinhThanh +
                ", tenTinhThanh=" + tenTinhThanh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TinhThanh tinhThanh = (TinhThanh) o;
        return maTinhThanh == tinhThanh.maTinhThanh &&
                Objects.equals(tenTinhThanh, tinhThanh.tenTinhThanh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTinhThanh, tenTinhThanh);
    }

    public static ArrayList<TinhThanh> getDSTinhThanh() {
        String[] arr_TinhThanh = {
                "An Giang",
                "Bà Rịa – Vũng Tàu",
                "Bạc Liêu",
                "Bắc Giang",
                "Bắc Kạn",
                "Bắc Ninh",
                "Bến Tre",
                "Bình Dương",
                "Bình Định",
                "Bình Phước",
                "Bình Thuận",
                "Cà Mau",
                "Cao Bằng",
                "Cần Thơ",
                "Đà Nẵng",
                "Đắk Lắk",
                "Đắk Nông",
                "Điện Biên",
                "Đồng Nai",
                "Đồng Tháp",
                "Gia Lai",
                "Hà Giang",
                "Hà Nam",
                "Hà Nội",
                "Hà Tĩnh",
                "Hải Dương",
                "Hải Phòng",
                "Hậu Giang",
                "Hòa Bình",
                "Thành phố Hồ Chí Minh",
                "Hưng Yên",
                "Khánh Hòa",
                "Kiên Giang",
                "Kon Tum",
                "Lai Châu",
                "Lạng Sơn",
                "Lào Cai",
                "Lâm Đồng",
                "Long An",
                "Nam Định",
                "Nghệ An",
                "Ninh Bình",
                "Ninh Thuận",
                "Phú Thọ",
                "Phú Yên",
                "Quảng Bình",
                "Quảng Nam",
                "Quảng Ngãi",
                "Quảng Ninh",
                "Quảng Trị",
                "Sóc Trăng",
                "Sơn La",
                "Tây Ninh",
                "Thái Bình",
                "Thái Nguyên",
                "Thanh Hóa",
                "Thừa Thiên Huế",
                "Tiền Giang",
                "Trà Vinh",
                "Tuyên Quang",
                "Vĩnh Long",
                "Vĩnh Phúc",
                "Yên Bái",
        };

        int i = 0;
        ArrayList<TinhThanh>  listTinhThanh = new ArrayList<TinhThanh>();
        for(String tentinh : arr_TinhThanh) {
            TinhThanh temp = new TinhThanh(i, tentinh);
            listTinhThanh.add(temp);
        }

        return listTinhThanh;
    }

    public static TinhThanh getTinhThanhById(int index) {
        return TinhThanh.getDSTinhThanh().get(index);
    }

    public static TinhThanh getTinhThanhByName(String indexName) {
        ArrayList<TinhThanh> listTT = TinhThanh.getDSTinhThanh();
        for(TinhThanh item : listTT) {
            if(item.tenTinhThanh.equals(indexName)) {
                return item;
            }
        }
        return null;
    }
}
