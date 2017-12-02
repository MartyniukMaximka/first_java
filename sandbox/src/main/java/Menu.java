class Menu {
    public static void main(String args[])
    throws java.io.IOException
    {
        char choice;

        do {
            System.out.println("справка по пиву:");
            System.out.println("1. темное");
            System.out.println("2. светлое");
            System.out.println("3. красное\n");
            System.out.println("Сделай свой выбор:");
            choice=(char) System.in.read();

        }
        while (choice>'1' || choice<'5' );

System.out.println("\n");


    }
}
