import java.util.Objects;

public class Calculator {

    private double lastAnswer = 0;

    public double getLastAnswer(){
        return lastAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return Double.compare(that.lastAnswer, lastAnswer) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastAnswer);
    }

    public double Add(double a, double b){
        lastAnswer = a+b;
        return lastAnswer;
    }

    public double Subtract(double a, double b){
        lastAnswer = a-b;
        return lastAnswer;
    }

    public double Multiply(double a, double b){
        lastAnswer = a*b;
        return lastAnswer;
    }

    public double Divide(double a, double b){
        lastAnswer = a/b;
        return lastAnswer;
    }

}
