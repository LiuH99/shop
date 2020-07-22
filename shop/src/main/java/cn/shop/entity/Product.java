package cn.shop.entity;

public class Product {
    private int pid;
    private String pname;
    private double pprice;
    private int pbid;
    private int pate;
    private String ppic;
    private String pcontent;
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public double getPprice() {
        return pprice;
    }
    public void setPprice(double pprice) {
        this.pprice = pprice;
    }
    public int getPbid() {
        return pbid;
    }
    public void setPbid(int pbid) {
        this.pbid = pbid;
    }
    public int getPate() {
        return pate;
    }
    public void setPate(int pate) {
        this.pate = pate;
    }
    public String getPpic() {
        return ppic;
    }
    public void setPpic(String ppic) {
        this.ppic = ppic;
    }
    public String getPcontent() {
        return pcontent;
    }
    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }
    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice
                + ", pbid=" + pbid + ", pate=" + pate + ", ppic=" + ppic
                + ", pcontent=" + pcontent + "]";
    }

}
