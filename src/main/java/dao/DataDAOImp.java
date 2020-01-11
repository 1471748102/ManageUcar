package dao;

import bean.CarInfo;
import bean.Normal;
import bean.User;
import conn.connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataDAOImp implements DataDAO {

    connect db = new connect();
    Connection con = db.getConnection();

    //抽象出方法
    private void showit(List<CarInfo> list, ResultSet rs) throws SQLException {
        while (rs.next()) {
            CarInfo cia = new CarInfo();
            cia.setCarid(rs.getString("carid"));
            cia.setCartype(rs.getString("cartype"));
            cia.setCarfix(rs.getString("carfix"));
            cia.setWorn(rs.getString("worn"));
            cia.setContent(rs.getString("content"));
            cia.setMoney(rs.getString("money"));
            cia.setNumber(rs.getString("number"));
            cia.setEmail(rs.getString("email"));
            cia.setState(rs.getString("state"));
            list.add(cia);

        }
    }

    private boolean isDelete(String carid, boolean isSuc, String sql) throws SQLException {
        try (
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, carid);
            int row = pstmt.executeUpdate();
            if (row > 0) {
                isSuc = true;
            }
        }
        return isSuc;
    }


    public boolean inter(User uk) throws Exception {
        boolean flag = false;
        String sql = "select * from login where uname=? and password =?";
        flag = isFlag(uk, flag, sql);
        return flag;
    }

    public boolean interadmin(User uk) throws Exception {
        boolean flag = false;
        String sql = "select * from admin where aname=? and apassword =?";
        flag = isFlag(uk, flag, sql);
        return flag;
    }

    private boolean isFlag(User uk, boolean flag, String sql) {
        try (
                PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, uk.getName());
            pstmt.setString(2, uk.getPassword());
            ResultSet rs = pstmt.executeQuery();
            flag = rs.next();
        } catch (Exception e) {
        }
        return flag;
    }

    public int add(User ul) throws Exception {

        int flags = 0;


        String sql = "insert into login VALUES(?,?)";
        try {

            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, ul.getName());
            pres.setString(2, ul.getPassword());
            pres.execute();
            flags = pres.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return flags;
    }

    public int addnormal(Normal nadd) throws Exception {

        int flags = 0;


        String sql = "insert into normal VALUES(?,?,?,?,?,?)";
        try {

            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, nadd.getUseid());
            pres.setString(2, nadd.getUsename());
            pres.setString(3, nadd.getUsesex());
            pres.setString(4, nadd.getUsetel());
            pres.setString(5, nadd.getUseaddress());
            pres.setString(6, nadd.getUseindex());
            pres.execute();
            flags = pres.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return flags;
    }

    public int addinfor(CarInfo cared) throws Exception {

        int flags = 0;


        String sql = "insert into infor VALUES(?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, cared.getCarid());
            pres.setString(2, cared.getCartype());
            pres.setString(3, cared.getCarfix());
            pres.setString(4, cared.getWorn());
            pres.setString(5, cared.getContent());
            pres.setString(6, cared.getMoney());
            pres.setString(7, cared.getNumber());
            pres.setString(8, cared.getEmail());
            pres.setString(9, cared.getState());
            pres.execute();
            flags = pres.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return flags;
    }


    public  void updatepassword(String name,String newpassword) throws Exception{
        String sql = "update login set password='" + newpassword + "' where uname = '" + name + "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Normal update(Normal nora) throws Exception {
        String sql = "update normal set usename='" + nora.getUsename() + "', usesex='" + nora.getUsesex() + "',usetel='" + nora.getUsetel() + "',useaddress='" + nora.getUseaddress() + "',useindex='" + nora.getUseindex() + "' where useid = '" + nora.getUseid() + "'";
        //String sql="update normal set usename='1', usesex='1',usetel='1',useaddress='1',useindex='9.9' where useid = '20161601'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
        return nora;
    }

    public List normalshowone(String showone) throws Exception {

        List nso = new ArrayList();
        String sql = "select * from normal where useid='" + showone + "'";
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rs = pref.executeQuery();
        while (rs.next())
        {
            Normal nnso = new Normal();
            nnso.setUseid(rs.getString("useid"));
            nnso.setUsename(rs.getString("usename"));
            nnso.setUsesex(rs.getString("usesex"));
            nnso.setUsetel(rs.getString("usetel"));
            nnso.setUseaddress(rs.getString("useaddress"));
            nnso.setUseindex(rs.getString("useindex"));
            nso.add(nnso);
        }
        return nso;

    }

    public List show() throws Exception {
        List NormalList = new ArrayList();
        String sql = "select * from normal";
        try {
            PreparedStatement pref = con.prepareStatement(sql);
            ResultSet rs = pref.executeQuery();
            while (rs.next()) {
                Normal norc = new Normal();
                norc.setUseid(rs.getString("useid"));
                norc.setUsename(rs.getString("usename"));
                norc.setUsesex(rs.getString("usesex"));
                norc.setUsetel(rs.getString("usetel"));
                norc.setUseaddress(rs.getString("useaddress"));
                norc.setUseindex(rs.getString("useindex"));
                NormalList.add(norc);
            }
            return NormalList;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return NormalList;

    }

    public boolean delete(String zhanghao) throws Exception {
        boolean isSuc = false;
        String sql = "delete from normal where useid = ?";
        isSuc = isDelete(zhanghao, isSuc, sql);
        return isSuc;
    }

    public List<CarInfo> ShowByPage(int pagenow, int pagesize) throws Exception {
        List<CarInfo> list = new ArrayList<CarInfo>();

        String sql = "select * from infor order by carid limit ?,?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (pagenow * pagesize - pagesize));
            ps.setInt(2, pagesize);
            ResultSet rs = ps.executeQuery();
            showit(list, rs);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");

        }

        return list;
    }

    public int count() throws Exception {
        int count = 0;
        String sql = "select count(*) from infor";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            con.close();
        } catch (Exception e) {

        }
        return count;
    }

    public List selectbyid(String carid) throws Exception {

        List st = new ArrayList();
        String sql = "select * from infor where carid='" + carid + "'";
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rs = pref.executeQuery();
        showit(st, rs);
        return st;

    }

    public List selectbytype(String cartype) throws Exception {

        List sr = new ArrayList();
        String sql = "SELECT * FROM infor where cartype like '%"+cartype+"%'";
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rs = pref.executeQuery();
        showit(sr, rs);
        return sr;

    }

    public List selectbyfix(String carfix) throws Exception {

        List ss = new ArrayList();
        String sql = "SELECT * FROM infor where carfix <"+carfix+"";
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rs = pref.executeQuery();
        showit(ss, rs);
        return ss;

    }

    public List selectbyshop() throws Exception {

        List shop = new ArrayList();
        String sql = "SELECT * FROM infor where state like '%已购买%'";
        PreparedStatement pref = con.prepareStatement(sql);
        ResultSet rs = pref.executeQuery();
        showit(shop, rs);
        return shop;

    }



    public List showinfor() throws Exception {
        List InforListX = new ArrayList();
        String sql = "select * from infor";
        try {
            PreparedStatement pref = con.prepareStatement(sql);
            ResultSet rs = pref.executeQuery();
            while (rs.next()) {
                CarInfo carl = new CarInfo();
                carl.setCarid(rs.getString("carid"));
                carl.setCartype(rs.getString("cartype"));
                carl.setCarfix(rs.getString("carfix"));
                carl.setWorn(rs.getString("worn"));
                carl.setContent(rs.getString("content"));
                carl.setMoney(rs.getString("money"));
                carl.setNumber(rs.getString("number"));
                carl.setEmail(rs.getString("email"));
                carl.setState(rs.getString("state"));
                InforListX.add(carl);
            }
            return InforListX;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return InforListX;

    }


    public List admininforshow() throws Exception {
        List InforListXX = new ArrayList();
        String sql = "select * from infor";
        try {
            PreparedStatement pref = con.prepareStatement(sql);
            ResultSet rs = pref.executeQuery();
            while (rs.next()) {
                CarInfo carXX = new CarInfo();
                carXX.setCarid(rs.getString("carid"));
                carXX.setCartype(rs.getString("cartype"));
                carXX.setCarfix(rs.getString("carfix"));
                carXX.setWorn(rs.getString("worn"));
                carXX.setContent(rs.getString("content"));
                carXX.setMoney(rs.getString("money"));
                carXX.setNumber(rs.getString("number"));
                carXX.setEmail(rs.getString("email"));
                carXX.setState(rs.getString("state"));
                InforListXX.add(carXX);
            }
            return InforListXX;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return InforListXX;

    }

    public void inforbuy(String uid, String carid) throws Exception {
        String state = uid+"已购买";
        String sql = "update infor set state='" +state+ "' where carid = '" +carid+ "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void inforshop(String uid,String cis) throws Exception {
        String state = uid+"已预订";
        String sql = "update infor set state='" +state+ "' where carid = '" +cis+ "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void inforshopbuy(String uid) throws Exception {
        String state = uid+"已购买";
        String cig = uid+"已预订";
        String sql = "update infor set state='" +state+ "' where state = '" +cig+ "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void inforshopclear(String uid) throws Exception {
        String state = "空闲";
        String cik = uid+"已预订";
        String sql = "update infor set state='" +state+ "' where state = '" +cik+ "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }

    }


    public List InforShopShow(String uid) throws Exception{

        List InforShopList = new ArrayList();
        String uidtemp = uid+"已预订";
        String sql = "select * from infor where state='"+uidtemp+"'";
        try {
            PreparedStatement pref = con.prepareStatement(sql);
            ResultSet rs = pref.executeQuery();
            while (rs.next()) {
                CarInfo carl = new CarInfo();
                carl.setCarid(rs.getString("carid"));
                carl.setCartype(rs.getString("cartype"));
                carl.setCarfix(rs.getString("carfix"));
                carl.setWorn(rs.getString("worn"));
                carl.setContent(rs.getString("content"));
                carl.setMoney(rs.getString("money"));
                carl.setNumber(rs.getString("number"));
                carl.setEmail(rs.getString("email"));
                carl.setState(rs.getString("state"));
                InforShopList.add(carl);
            }
            return InforShopList;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
        return InforShopList;

    }


    public boolean infordelete(String carid) throws Exception {
        boolean isSuc = false;
        String sql = "delete from infor where carid = ?";
        isSuc = isDelete(carid, isSuc, sql);
        return isSuc;
    }

    public CarInfo inforupdate(CarInfo care) throws Exception {
        String sql = "update infor set cartype='" +care.getCartype() + "', carfix='" + care.getCarfix() + "',worn='" + care.getWorn() + "',content='" + care.getContent() + "',money='" + care.getMoney() + "',number='" + care.getNumber() +" ',email='" + care.getEmail() +"',state='" + care.getState() +"' where carid = '" + care.getCarid() + "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
        return care;
    }


    public void buyshop(String carid) throws Exception {
        String state ="已发货";
        String sql = "update infor set state='" +state+ "' where carid = '" +carid+ "'";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }

    }

}
