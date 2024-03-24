package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewSanPham { //đối tượng chứa thông tin mới về sản phẩm (ngoại trừ id) để update
    private String newMaSanPham;
    private String newTenSanPham;
    private float newGia;
    private String newMauSac;
    private String newKichThuoc;
    private int newSoLuong;
}
