package concurrent;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger= new Exchanger<String>();
        new Thread(new MakeString(exchanger)).start();
        new Thread(new UseString(exchanger)).start();
    }

}

class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> e1) {
        ex = e1;
        str = new String ();
    }

    @Override
    public void run() {
        System.out.println("inside MakeString RUn");
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += ch++;
                try {
                    str = ex.exchange (str);
                    System.out.println("Got"+str);
                } catch (InterruptedException e) {
                    e.printStackTrace ( );
                }
            }
        }
    }
}// end of class
class UseString implements Runnable{
    Exchanger<String> strEx;
    String str;
    UseString(Exchanger<String> k){
        strEx=k;
    }

    @Override
    public void run() {
        System.out.println("use string run");
        for(int i=0;i<3;i++){
            try {
                str=strEx.exchange(new String());
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
        }
    }
}
