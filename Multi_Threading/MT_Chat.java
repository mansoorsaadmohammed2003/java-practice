class chat extends Thread{
    String user;
    String[] messages;

    chat(String user,String[] messeges){
        this.user=user;
        this.messages=messeges;
    }
    public void run(){
        try {
            for(String msg : messages){
            System.out.println(user +":"+msg);
            }
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class MT_Chat {
    public static void main(String[] args) {
        String[] user1messg={"hi","how r u doing ","do u know about the"};
        String[] user2messg={"Hello","im fine ","yes let u me update u on it"};

        Thread t1=new chat("Saad", user1messg);
        Thread t2=new chat("Aftab", user2messg);
        t1.start();
        t2.start();
    }
}
