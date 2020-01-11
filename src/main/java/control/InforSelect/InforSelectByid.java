package control.InforSelect;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class InforSelectByid extends ActionSupport {
    private List<CarInfo> st;
    private  String carid;

    public List<CarInfo> getSt() {
        return st;
    }

    public void setSt(List<CarInfo> st) {
        this.st = st;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        st=data.selectbyid(carid);
        ActionContext.getContext().put("st",st);
        return SUCCESS;
    }
}
