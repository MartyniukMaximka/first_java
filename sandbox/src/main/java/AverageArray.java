public class AverageArray {

    public static void main(String args[])
    {
        double numbers[]={1,2,3,4,5}, result = 0;
        int i;

        for (i=0; i<5; i++)
        {
            result = result + numbers[i];
        }
        System.out.println("среднее арифметическое масива равно "+ result/5);

    }
}
