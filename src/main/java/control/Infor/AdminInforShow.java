package control.Infor;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;

public class AdminInforShow extends ActionSupport {
        private List<CarInfo> InforListXX;

        public List<CarInfo> getInforListXX() {
            return InforListXX;
        }

        public void setInforListXX(List<CarInfo> inforListXX) {
            InforListXX = inforListXX;
        }

        public String execute() throws Exception {
            DataDAO data = new DataDAOImp();
            InforListXX=data.admininforshow( );
            ActionContext.getContext().put("show2",InforListXX);
            return SUCCESS;
        }

}
