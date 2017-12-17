/**
 * Created by Ting on 2017/1/19.
 */
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorldAction extends ActionSupport{
    private static final long serialVersionUID = 1L;

    private MessageStore messageStore;
    private String hello;

    public String execute() throws Exception {

        messageStore = new MessageStore() ;
        hello = "bom dia crl";
        return "rafas";
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
