package ch02;

/**
 * 문자열타입
 */
public class 문자열타입 {
    public static void main(String[] args) {
        char var1 = 'A'; //작음따음표로 감싼 한개의 문자는 Char 타입
        char var2 = 65;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        String var3 = "A"; //큰따음표로 감싼 문자들은 문자열 String 타입
        System.out.println("var3 = " + var3); 

        //이스케이프 : 문자열 내부에 역슬래쉬가 붙은 문자
        String str = "나는 \"자바\"를 배웁니다."; //큰따음표나 작은따음표를 문자열안에서 사용할 떄
        System.out.println(str);

        String str2 = "나는 \\자바\\를 배웁니다."; //역슬래쉬를 문자열안에서 사용할 떄
        System.out.println(str2);

        String str3 = "번호\t이름\t직업 "; //출력시 탭만큼 띄움
        System.out.println(str3);

        System.out.println("나는\n자바를\n배웁니다."); //출력시 줄바꿈

        //큰따음표 3개로 감싸면 이스케이프하거나 라인 피드를 할 필요가 없이 그대로 작성된다.
        //java13부터 지원
        //String str4 = """나는 자바를 배웁니다.""";    
    }
}