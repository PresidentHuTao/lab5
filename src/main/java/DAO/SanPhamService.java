package DAO;

import Model.NewSanPham;
import Model.SanPham;

import java.util.ArrayList;

public class SanPhamService {
    private ArrayList<SanPham> listSP = new ArrayList<>();
    public SanPhamService(){
        listSP.add(new SanPham("1", "SP002", "Áo thun mới", 120000, "Trắng", "M", 30));
        listSP.add(new SanPham("2", "SP001", "Áo thun mới", 120000, "Trắng", "M", 30));
        listSP.add(new SanPham("3", "SP003", "Áo thun mới", 120000, "Trắng", "M", 30));
    }
    
    private void addSP(SanPham sp) {
        listSP.add(sp);
    }

    public void updateSP(SanPham sp) {
        int index = -1;
        for (SanPham sp1 : listSP)  {
            if (sp1.getId().equals(sp.getId())) {
                index = listSP.indexOf(sp1);
                break;
            }
        }
        if (index != -1) {
            listSP.set(index,sp);
        }
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void deleteSP(String id) {
        listSP.removeIf(sp -> sp.getId().equals(id));
    }
}
