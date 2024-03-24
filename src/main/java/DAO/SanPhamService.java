package DAO;

import Model.NewSanPham;
import Model.SanPham;

import java.util.ArrayList;

public class SanPhamService {
    private ArrayList<SanPham> listSP = new ArrayList<>();

    private void addSP(SanPham sp) {
        listSP.add(sp);
    }

    private void updateSP(String id, NewSanPham nsp) { //truyền dữ liệu cho đối tượng nsp trước khi update
        for (SanPham sp : listSP) {
            if (sp.getId().equals(id)) { //kiểu dữ liệu của id đang là string nên cần dùng equals thay vì ==
                sp.setMaSanPham(nsp.getNewMaSanPham());
                sp.setTenSanPham(nsp.getNewTenSanPham());
                sp.setGia(nsp.getNewGia());
                sp.setMauSac(nsp.getNewMauSac());
                sp.setKichThuoc(nsp.getNewKichThuoc());
                sp.setSoLuong(nsp.getNewSoLuong());
                break;
            }
        }
    }

    public void deleteSP(String id) {
        listSP.removeIf(sp -> sp.getId().equals(id));
    }
}
