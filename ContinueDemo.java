public class ContinueDemo {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue; //while하고 궁합이 제일 잘 맞는다
            }
            System.out.println(a + " " + "01고다연");
        }
    }
    
}
