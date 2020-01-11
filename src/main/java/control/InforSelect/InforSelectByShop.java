package control.InforSelect;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class InforSelectByShop extends ActionSupport {
    private List<CarInfo> shop;

    public List<CarInfo> getShop() {
        return shop;
    }

    public void setShop(List<CarInfo> shop) {
        this.shop = shop;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        shop=data.selectbyshop();
        ActionContext.getContext().put("shop",shop);
        return SUCCESS;
    }
}
