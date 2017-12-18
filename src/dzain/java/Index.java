import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport{

    private String oi;

    public Index() {
        oi = "atuamae";
    }

    public String execute() throws Exception {

        return "rafa";
    }

    public String getOi() {
        return oi;
    }

    public void setOi(String oi) {
        this.oi = oi;
    }
}
