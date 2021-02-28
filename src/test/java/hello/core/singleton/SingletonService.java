package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance
            =new SingletonService();
    public static SingletonService getInstance(){
        return instance;
    }
    // 외부에서 새로 객체생성 불가능하도록
    // 즉, 싱글톤
    private SingletonService(){}

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
