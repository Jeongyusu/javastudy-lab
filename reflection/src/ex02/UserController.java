package ex02;

//리플렉션 : 실행시에 동적으로 분석
public class UserController {
    @RequestMapping(uri = "/login")
    public void login(){
        System.out.println("login() 호출됨");
    }

    @RequestMapping(uri = "/join")
    public void join(){
        System.out.println("join() 호출됨");
    }

    @RequestMapping(uri = "/check")
    public void check(){
        System.out.println("check() 호출됨");
    }
}
