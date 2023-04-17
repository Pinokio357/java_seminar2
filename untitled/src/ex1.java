import java.io.IOException;
import java.util.logging.*;

public class ex1 {
        public static void main(String[] args) throws IOException {
            Logger LOG_1 = Logger.getLogger(ex1.class.getName());
            FileHandler fh = new FileHandler("Log.txt");
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);

            LOG_1.addHandler(fh);
            LOG_1.setLevel(Level.INFO);
            //for (int i = 0; i < 5; i++) {
                
            int[] array = {5, 3, 8, 4, 9, 1};
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length  - 1 - i; j++) {
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        String message = String.format("swap %d and %d", array[i], array[i+1]);
                        LOG_1.info(message);

                }

            }

            }

        }
        }

