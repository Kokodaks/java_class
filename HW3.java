public class HW3 {
        public static void main(String[] args) {
            
            //Question 1: 3-15
            int a = 12;
            int b = 112;
            int c = 1112;

            if ((a>b && b>c) || (b>a && a>c)) {
                System.out.println(c + "가 최소값입니다.");
            } else if ((c>b && b>a) || (b>c && c>a)) {
                System.out.println(a + "가 최소값입니다.");
            } else if ((a>c && c>b) || (c>a && a>b)) {
                System.out.println(b + "가 최소값입니다.");
            }



            //Question 2: 3-21
            int season = 13;

            if (season == 12 || season == 1 || season == 2) {
                System.out.println("몇월입니까?:" + " " + "겨울");
            } else if (season == 3 || season == 4 || season == 5) {
                System.out.println("몇월입니까?:" + " " + "봄");
            } else if (season == 6 || season == 7 || season == 8) {
                System.out.println("몇월입니까?:" + " " + "여름");
            } else if (season == 9 || season == 10 || season == 11) {
                System.out.println("몇월입니까?:" + " " + "가을");
            } else {
                System.out.println("그런 월은 없습니다.");
            }



            //Question 3: 4-2
            int d = 1023;

            if (d>=100 && d<=999) {
                System.out.println("입력한 값은" + " " + d + " " + "입니다.");
            } else {
                System.out.println("다시 입력하십시오");
            }



            //Question 4: 4-14
            int h = 8;
            int even = h*(h/2) + h/2;
            int odd = h*((h+1)/2);
            
            if (h % 2 == 0) {
                    System.out.println("1부터 h까지의 합은" + even + "입니다.");
                } else if (h % 2 != 0) {
                    System.out.println("1부터 h까지의 합은" + odd + "입니다.");
                }


            
        }
        
    }

