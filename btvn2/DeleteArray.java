import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhập vị trí cần xóa phần tử");
        int delIndex = sc.nextInt();

        int[] newArr = deleteElement(arr, delIndex);

        if (newArr != null) {
            System.out.println("Mảng sau khi xóa:");
            for (int g = 0; g < newArr.length; g++) {
                System.out.println(newArr[g]);
            }
        } else {
            System.out.println("Xóa không thành công. Chỉ số không hợp lệ.");
        }
    }

    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return null;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
