package control.Infor;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class InforShowAll extends ActionSupport {
    private List<CarInfo> InforListX;

    public List<CarInfo> getInforListX() {
        return InforListX;
    }

    public void setInforListX(List<CarInfo> inforListX) {
        InforListX = inforListX;
    }

    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        InforListX=data.showinfor( );
        ActionContext.getContext().put("InforListX",InforListX);
        return SUCCESS;
    }
}
