import com.lancq.spi.DataBaseDriver;

import java.util.ServiceLoader;

/**
 * @Author lancq
 * @Description
 * @Date 2018/6/30
 **/
public class App {
    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader = ServiceLoader.load(DataBaseDriver.class);

        for(DataBaseDriver driver : serviceLoader){
            System.out.println(driver.connect("localhost"));
        }
    }
}
