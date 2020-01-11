package control.InforSelect;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class InforSelectBytype extends ActionSupport {
    private List<CarInfo> sr;
    private  String cartype;

    public List<CarInfo> getSr() {
        return sr;
    }

    public String getCartype() {
        return cartype;
    }

    public void setSr(List<CarInfo> sr) {
        this.sr = sr;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        sr=data.selectbytype(cartype);
        ActionContext.getContext().put("sr",sr);
        return SUCCESS;
    }
}
