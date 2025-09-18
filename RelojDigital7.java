public class RelojDigital7 {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 24; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    Thread.sleep(1000);
                    System.out.println(i + ":" + j + ":" + k );
                }
            }
        }
    }
}