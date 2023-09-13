import java.util.ArrayList;

public class Threads implements Runnable {
    private ArrayList<Integer> arr;
    static private ArrayList<Integer> oddNum = new ArrayList<>();
    static private ArrayList<Integer> evenNum = new ArrayList<>();
    private int sleepTime;

    public Threads(ArrayList<Integer> arr, int sleepTime) {
        this.arr = arr;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.sleepTime);
            synchronized (arr) {
                for (int i = 0; i < this.arr.size(); i++) {
                    if (i % 2 == 0) {
                        evenNum.add(this.arr.get(i));
                    } else {
                        oddNum.add(this.arr.get(i));
                    }
                }
            }
            if (oddNum.size() > 3751) {
                System.out.println(getEvenNum());
                System.out.println(getOddNum());
            }
        } catch (Exception e) {
            System.out.println("Error Message :" + e.getMessage());
        }

    }

    public ArrayList<Integer> getOddNum() {
        return oddNum;
    }

    public ArrayList<Integer> getEvenNum() {
        return evenNum;
    }
}
