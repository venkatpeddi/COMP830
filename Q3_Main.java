import java.util.Random;
public class Q3_Main {
	public static void main(String args[]) 
    { 
		int sum = 0;
        Random rand = new Random(); 
        for(int i = 0;i<10;i++) 
        {
        int rand_int1 = rand.nextInt(1000);
        System.out.println(rand_int1);
        sum = sum + rand_int1;
        } 
        System.out.println("Sum: "+sum); 
    }
}
