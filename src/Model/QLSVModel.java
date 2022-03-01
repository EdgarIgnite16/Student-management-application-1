package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class QLSVModel implements Serializable {
    private ArrayList<ThiSinh> DSThiSinh;
    private String fileName;

    public QLSVModel() {
        this.DSThiSinh = new ArrayList<ThiSinh>();
        this.fileName = "";
    }

    public QLSVModel(ArrayList<ThiSinh> DSThiSinh) {
        this.DSThiSinh = DSThiSinh;
    }

    public ArrayList<ThiSinh> getDSThiSinh() {
        return DSThiSinh;
    }

    public void setDSThiSinh(ArrayList<ThiSinh> DSThiSinh) {
        this.DSThiSinh = DSThiSinh;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void printDSSV() {
        System.out.println(DSThiSinh.size());
        for(ThiSinh item : DSThiSinh) {
            System.out.println(item.toString());
        }
    }

    //===================================================//

    public void insert(ThiSinh thiSinh) {
        this.DSThiSinh.add(thiSinh);
    }

    public void delete(ThiSinh thiSinh) {
        this.DSThiSinh.remove(thiSinh);
    }

    public void update(int index, ThiSinh thiSinh) {
        this.DSThiSinh.set(index, thiSinh);
    }

    public boolean checkExist(ThiSinh thiSinh) {
        for(ThiSinh ts : DSThiSinh) {
            if(thiSinh.getMaThiSinh() == ts.getMaThiSinh()) {
                return true;
            }
        }
        return false;
    }
}
