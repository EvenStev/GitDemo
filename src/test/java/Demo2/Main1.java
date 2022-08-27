package Demo2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Hello from new report
          //Added method
        Main1 obj = new Main1();
        int sum = obj.add(5,27);
        System.out.println(sum);
    }
    
    public int add(int a, int b){
        int c = a+b;
        return c;
}
}
