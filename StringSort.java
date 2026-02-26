import java.util.*;

public class StringSort {
    
    static void userSort(String[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];

        for (int i = 0; i < n; i++)
            s[i] = sc.nextLine();

        System.out.println("1. Built-in Sorting");
        System.out.println("2. User-defined Sorting");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1)
            Arrays.sort(s);
        else if (ch == 2)
            userSort(s);
        else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Sorted strings:");
        for (String str : s)
            System.out.println(str);
    }
}

