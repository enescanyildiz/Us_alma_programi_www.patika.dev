
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int us,taban,sonuc=1;
        System.out.print("Taban Değerini Giriniz: ");
        taban=input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        us=input.nextInt();
        if(us==0)
        {
            System.out.println("Her sayının 0.kuvveti 1'dir. ");
        }else
        {
            for (int i = 1; i <= us; i++)
            {
                sonuc= sonuc*taban;
            }
        }
        System.out.println(taban+" sayısının "+us+".kuvveti= "+sonuc);
    }
}
