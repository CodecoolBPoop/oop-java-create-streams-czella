package main.java.com.codecool;

public class Fibonacci {
    private Integer previous ;
    private Integer current;

    public Fibonacci() {
    }

    public Integer getNext() {
        if (previous == null) {
            this.previous = 0;
            return  0;
        } if (current == null) {
            this.current = 1;
        } else {
            Integer nextCurrent = this.current + this.previous;
            this.previous = this.current;
            this.current = nextCurrent;
        }
        return current;

    }
}
