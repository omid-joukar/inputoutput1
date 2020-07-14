import java.io.File;
import java.util.List;

/**
 * Created by KPS on 7/14/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\");
        String[] fileList = path.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
