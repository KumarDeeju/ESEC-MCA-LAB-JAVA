public class checkTime {
    public static void main(String[] args) {
        long firstTime = System.currentTimeMillis();
        System.out.println("firstTime : "+ firstTime);

        for(int i=1;i<=1000;i++){
            System.out.print(i+"@ ");
        }
        System.out.println("Complete with @");

        for(int i=1;i<=1000;i++){
            System.out.print(i+"* ");
        }
        System.out.println("Complete with the *");

        for(int i=1;i<=1000;i++){
            System.out.print(i+"& ");
        }
        System.out.println();

        // for(int i=1;i<=1000;i++){
        //     System.out.print(i+"😂 ");
        // }
        // System.out.println("Complete with the 😂");

        long lastTime = System.currentTimeMillis();
        System.out.println("LastTime :"+lastTime);

        System.out.println("Total time : "+ (lastTime - firstTime));
    }
}
