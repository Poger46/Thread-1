import java.util.Arrays;

import static java.lang.Thread.sleep;

public class Main {
    static public void main(String[] args) {
        UsualMatrix a = new UsualMatrix(4,4);
        UsualMatrix b = new UsualMatrix(4,4);
        UsualMatrix c = new UsualMatrix(4,4);
        for(int i = 0; i < 4; i++){
            for(int j = 0;  j < 4; j++) {
                a.setElement(i, j, 3);
                b.setElement(j, i, 1);
                c.setElement(j, i, 4);
            }
        }

        Comparable []a1 = {2,3,5,4,7,1,4, 100,8};
        Sort m = new Sort(2, a1);
        m.MergeSort(0,8, 0);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < a1.length; i++)
            System.out.println(a1[i]);
    }
}
