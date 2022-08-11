package bai14;

public class dem_so_lan_xuat_hien_ky_tu {
    public static void main(String[] args) {
        String str = "Xin Chao Tat Ca Cac Ban";
        String str1 = "a";
        int count = 0;
        for (int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(0)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự " + str1 + " trong chuỗi là: " + count);
    }
}
