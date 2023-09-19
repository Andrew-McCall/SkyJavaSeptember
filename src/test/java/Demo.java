import junit.framework.*;
import org.junit.Test;

public class Demo {

    @Test
    public void Addition(){
        int a = 5;
        int b = 8;

        Assert.assertEquals(13, (a+b));
    }

    @Test
    public void Subtraction(){
        int a = 5;
        int b = 8;

        Assert.assertEquals(3, (b-a));
    }

    @Test
    public void Multiplication(){
        int a = 5;
        int b = 8;

        Assert.assertEquals(40, (b*a));
    }

    @Test
    public void Divison(){
        int a = 4;
        int b = 8;

        Assert.assertEquals(2, (b/a));
    }

    @Test
    public void Modulos(){
        int a = 5;
        int b = 8;

        Assert.assertEquals(3, (b%a));
    }

}
