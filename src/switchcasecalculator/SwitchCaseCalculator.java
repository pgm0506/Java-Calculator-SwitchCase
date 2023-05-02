package switchcasecalculator;
import java.util.Scanner;









public class SwitchCaseCalculator {
public static void main(String[] args) {
	KeyPad f = new KeyPad();


Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. 더하기\n"
                          +"2. 빼기\n"
                          +"3. 곱하기\n"
                          +"4. 나누기";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("연산할 방식 선택:");
        String islem = scanner.nextLine();
        int a;
        int b;
        
        switch(islem){
            case "1":
                System.out.print("첫번째 수: ");
                a = scanner.nextInt();
                System.out.print("두번째 수: ");
                b = scanner.nextInt();
                System.out.println("계산 결과 : " + (a+b));
                break;
            case "2":
                System.out.print("첫번째 수: ");
                a = scanner.nextInt();
                System.out.print("두번째 수: ");
                b = scanner.nextInt();
                System.out.println("계산 결과 : " + (a-b));
                break;
            case "3":
                System.out.print("첫번째 수: ");
                a = scanner.nextInt();
                System.out.print("두번째 수: ");
                b = scanner.nextInt();
                System.out.println("계산 결과 : " + (a * b));
                break;
            case "4":
                System.out.print("첫번째 수: ");
                a = scanner.nextInt();
                System.out.print("두번째 수: ");
                b = scanner.nextInt();
                System.out.println("계산 결과 : " + ((double)a / b));
                break;
            default:
                System.out.println("잘못 선택하셨습니다 프로그램을 종료합니다");
            }
        
        
        
        }
    
}