package control.Infor;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.Map;

public class InforUpdate extends ActionSupport {

    private CarInfo care,cared;

    public CarInfo getCare() {
        return care;
    }

    public void setCare(CarInfo care) {
        this.care = care;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        cared=data.inforupdate(care);


        return SUCCESS;
    }
}
