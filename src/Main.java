import command.CommandMain;
import decorate.DecorateMain;
import factory.FactoryMain;
import observer.ObserverMain;

public class Main {

    public static void main(String[] args) {
        // 옵저버
//        ObserverMain.test();

        // 데코레이터
//        DecorateMain.test();
//        DecorateMain.test2();

        // 팩토리 패턴
//        FactoryMain.test();

        // 커멘드 패턴
        CommandMain.test();
    }
}


