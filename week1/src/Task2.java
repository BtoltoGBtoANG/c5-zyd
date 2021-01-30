public class Task2 {
    public static void main(String args[]){
        int a,b,c,num = 0;
        for(int i = 100 ; i <= 1000 ; i++)
        {
            a = i / 100;b = (i-a * 100) / 10;c = i-a * 100 - b * 10 ;
            if(i == a * a * a + b * b * b + c * c * c)
                num++;

        }
        System.out.println(num);

    }

}