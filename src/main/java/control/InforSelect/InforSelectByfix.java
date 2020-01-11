package control.InforSelect;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class InforSelectByfix extends ActionSupport {
    private List<CarInfo> ss;
    private  String carfix;

    public List<CarInfo> getSs() {
        return ss;
    }

    public String getCarfix() {
        return carfix;
    }

    public void setSs(List<CarInfo> ss) {
        this.ss = ss;
    }

    public void setCarfix(String carfix) {
        this.carfix = carfix;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        ss=data.selectbyfix(carfix);
        ActionContext.getContext().put("ss",ss);
        return SUCCESS;
    }
}
