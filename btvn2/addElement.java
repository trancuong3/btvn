import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập vị trí cần chèn");
        int delIndex = sc.nextInt();
        System.out.println("nhập phần tử chèn vào");
        int add = sc.nextInt();
        int[] newArr = add(arr, delIndex,add);
        if (newArr != null) {
            System.out.println("Mảng sau khi xóa:");
            for (int g = 0; g < newArr.length; g++) {
                System.out.println(newArr[g]);
            }

        } else {
            System.out.println("Xóa không thành công. Chỉ số không hợp lệ.");
        }
    }

    public static int[] add(int[]a,int del,int add)
    {
        if (del < 0 || del >= a.length) {
            return null;
        }
        int[] newArr = new int[a.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i == del) {
                newArr[i] = add;
            } else if (i < del) {
                newArr[i] = a[i];
            } else {
                newArr[i] = a[i - 1];
            }
        }
        return newArr;
    }
    }

