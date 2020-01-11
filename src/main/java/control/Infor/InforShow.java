package control.Infor;

import bean.CarInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DataDAO;
import dao.DataDAOImp;

import java.util.List;
import java.util.Map;

public class InforShow extends ActionSupport {
    private int pagenow=1; //初始化为1，默认从第一页开始显示
    private int pagesize=6;//每页显示6条记录

    public int getPagenow() {
        return pagenow;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagenow(int pagenow) {
        this.pagenow = pagenow;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String execute() throws Exception{

        Map session = ActionContext.getContext().getSession();
        String uid =(String)session.get("uid");

        int current_page=getPagenow();
        //System.out.println(getPagenow());
        ActionContext context=ActionContext.getContext();
        DataDAO data = new DataDAOImp();
        List<CarInfo> list=data.ShowByPage(pagenow,pagesize);
        int pages=data.count();
        StringBuffer s=new StringBuffer();
        int temp=(pages/pagesize)+1;
        // System.out.println(temp);
        for(int i=1;i<=temp;i++){
            if(i==current_page){
                s.append("["+i+"]");
                //System.out.println("ERROR");
            }
            else{
                s.append("<a href='showbypage?pagenow="+i+"'>"+i+"</a>");
                // System.out.println("YES");
            }
        }

        context.put("list", list);
        context.put("s",s);
        return "success";
    }
}
