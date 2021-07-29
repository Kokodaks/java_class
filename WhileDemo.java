public class WhileDemo {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10 //true/false boolean concept) {
            treeHit++; //(treeHit = treeHit +1; treeHit += 1) enables tree to be hit 10 times, not 9
            System.out.println("나무를" + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
    }
    
}
