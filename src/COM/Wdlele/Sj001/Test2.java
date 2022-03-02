package COM.Wdlele.Sj001;

import com.sun.javaws.jnl.MatcherReturnCode;
import jdk.nashorn.internal.runtime.regexp.joni.constants.internal.TargetInfo;

/**
 * @author Wdlele
 * @create 2022-02-27 1:38
 */
public class Test2 {
    public static void main(String[] args) {
        Persion p1 = new Persion();
        p1.receive(new Email());
        p1.receive(new WeiXin());
        //p1.receive2(new MessageShow(),new WeiXin());
        MessageGetAndSend ms1 = new MessageGetAndSend();
        ms1.getMessage(new WeiXin());
        ms1.getMessage(new Email());


    }
}
interface IReceive {
     String getInfo();

}
interface IMessage {
    public void getMessage(IReceive i);
    public void sendMessage(IReceive i);
}

class Email implements IReceive{
    //dependecy
//    static  public String getInfo(){
//        return "电子邮件信息";
//    }

   //@Override
    public String getInfo() {
        return "电子邮件信息";
    }
}
class WeiXin implements IReceive{

    @Override
    public String getInfo() {
        return "微信信息";
    }
}
class MessageGetAndSend implements IMessage{
   // private IReceive rec;



    public void getMessage(IReceive i) {
        System.out.println("收到来自:"+i.getInfo());

    }


    public void sendMessage(IReceive i) {
        System.out.println("发送来自:"+i.getInfo());
    }
}



class Persion{
    public  void receive(IReceive i){
        System.out.println(i.getInfo());
    }
//    public  void receive2(IReceive r){
//        System.out.println(r);
//    }
}
