package oops1;

public class Counter {

    private int count;

    public Counter(){
        this.count = 0;
    }

    public Counter(int value){

        this.count = value;
    }
    
    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        
        Counter c1 = new Counter();
        c1.increment();
        System.out.println("Counter 1 count : " + c1.getCount());

        Counter c2 = new Counter(10);
        c2.increment();
        System.out.println("Counter 2 count : " + c2.getCount());
    }
}
