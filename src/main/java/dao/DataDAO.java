package dao;

import bean.CarInfo;
import bean.Normal;
import bean.User;

import java.util.List;


public interface DataDAO {
    boolean inter(User uk) throws Exception;
    boolean interadmin(User uk) throws Exception;

    int add(User uk) throws Exception;
    int addnormal(Normal nadd) throws Exception;
    int addinfor(CarInfo cared) throws Exception;

    void updatepassword(String name,String newpassword) throws Exception;
    Normal update(Normal nora) throws Exception;
    List normalshowone(String showone) throws Exception;

    List show() throws Exception;
    boolean delete(String zhanghao) throws Exception;

    List<CarInfo> ShowByPage(int pagenow, int pagesize) throws Exception;
    int count() throws Exception;

    List selectbyid(String carid) throws Exception;
    List selectbytype(String cartype) throws Exception;
    List selectbyfix(String carfix) throws Exception;
    List selectbyshop() throws Exception;

    void buyshop(String carid) throws Exception;

    void inforshop(String uid,String cis) throws Exception;
    void inforbuy(String uid,String carid) throws Exception;
    void inforshopbuy(String uid) throws Exception;
    void inforshopclear(String uid) throws Exception;
    List InforShopShow(String uid) throws Exception;

    boolean infordelete(String carid) throws Exception;
    CarInfo inforupdate(CarInfo care) throws Exception;

    List showinfor() throws Exception;
    List admininforshow() throws Exception;
}
