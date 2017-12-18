import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Ting on 2017/1/19.
 */
public class MessageStore extends ActionSupport{
    private String message;

    public MessageStore() {
        message = "vai te fuder";
    }

    public String execute() throws Exception {

        return "sucesso";
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
