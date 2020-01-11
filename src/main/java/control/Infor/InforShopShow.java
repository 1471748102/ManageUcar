package control.Infor;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;
import java.util.Map;

public class InforShopShow extends ActionSupport {
    private List<CarInfo> InforShopShow;

    public List<CarInfo> getInforShopShow() {
        return InforShopShow;
    }

    public void setInforShopShow(List<CarInfo> inforShopShow) {
        InforShopShow = inforShopShow;
    }

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        String uid =(String)session.get("uid");
        DataDAO data = new DataDAOImp();
        InforShopShow=data.InforShopShow(uid);
        ActionContext.getContext().put("InforShopShow",InforShopShow);
        return SUCCESS;
    }
}
