import java.sql.Array;

public class sole {
    public static void main(String[] args) {
        int sole = 0;
        int[] array =  {22,5,7,2,8,5,7,3,23,6,8,9,3,6,5,234,6,78,46,23,423,4315,6,9,8,3,7,45,4,3,4,3,5,5,5,5,7,7,7,7,7,5,5,7,7};
        for (int i = 0 ; i < array.length ; i+=2) {
            if (array[i] % 2 ==0) {
                sole = array[i];
            }
        }
        System.out.printf("Số lẻ cuối cùng nằm ở vị trí chẵn là %d\n", sole);
        int count = 0;
        int[] dem = new int[array.length];
        for (int i = 0; i <array.length; i++) {
            for(int j = 0 ; j< array.length;j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            dem[i] = count;
            count = 0;
        }
        int max = 0;
        int index = 0;
        for (int k = 0; k < dem.length; k++ ) {
              if(max < dem[k]) {
                  max = dem[k];
                  index = k;
              }
        }
        int number = array[index];
        System.out.printf("Số xuất hiện nhiều nhất là %d\n", number);
    }
}
