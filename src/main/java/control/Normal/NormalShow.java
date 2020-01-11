package control.Normal;

import bean.Normal;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class NormalShow extends ActionSupport {
    private List<Normal> NormalList;

    public List<Normal> getNormalList() {
        return NormalList;
    }

    public void setNormalList(List<Normal> normalList) {
        NormalList = normalList;
    }
    public String execute() throws Exception {
        DataDAO data = new DataDAOImp();
        NormalList=data.show( );
        ActionContext.getContext().put("NormalList",NormalList);
        return SUCCESS;
    }

}
