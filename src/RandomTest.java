import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RandomTest {
    public static void main(String[] args){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("D:\\Kuzma\\Test.txt",true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            for(int i =1;i<=100;i++){
                int num =(int)(Math.random()*100);
                bw.write(" "+num+" ");
                if(i%10==0){
                    bw.newLine();
                }
            }
            bw.flush();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
