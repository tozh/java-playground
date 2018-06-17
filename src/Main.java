//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int a = sc.nextInt();
//            for (int i=0;i<a;i++) {
//                int[] x = new int[4];
//                int[] y = new int[4];
//                for (int j=0;j<4;j++) {
//                    x[j] = sc.nextInt();
//
//                }
//                for (int j=0;j<4;j++) {
//                    y[j] = sc.nextInt();
//
//
//                }
//                if(zhengFang(x, y)) {
//                    System.out.println("Yes");
//                }
//                else {
//                    System.out.println("No");
//                }
//            }
//        }
//        return;
//    }
//    public static boolean zhengFang(int[] x, int[] y) {
//        boolean a = chuiZhi(x[2]-x[1], x[0]-x[3], y[2]-y[1], y[0]-y[3]);
//        boolean b = chuiZhi(x[1]-x[0], x[2]-x[0], y[1]-y[0], y[2]-y[0]);
//        boolean c = chuiZhi(x[1]-x[0], x[3]-x[1], y[1]-y[0], y[3]-y[1]);
//        boolean d = chuiZhi(x[2]-x[0], x[1]-x[3], y[2]-y[0], y[1]-y[3]);
//        boolean e = chuiZhi(x[2]-x[3], x[1]-x[0], y[2]-y[3], y[1]-y[0]);
//
//        return (a||d)&&b&&c;
//
//    }
//    public static boolean chuiZhi(int x1, int x2, int y1, int y2) {
//        return y2*y1-x2*x1==0;
//
//
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()) {
//            int n = sc.nextInt();
//            int[] nums = new int[n];
//            int[] res = new int[n];
//            for(int i=0;i<n;i++) {
//                nums[i] = sc.nextInt();
//            }
//            if ((n & 1)==1) {
//                int j = 0;
//                for(int i=n-1; i>=0;i-=2) {
//                    res[j++] = nums[i];
//                }
//                for(int i=1; i<n;i+=2) {
//                    res[j++] = nums[i];
//                }
//            }
//            else {
//                System.out.println(n);
//                int j = 0;
//                for(int i=n-1; i>0;i-=2) {
//                    res[j++] = nums[i];
//                }
//                for(int i=0; i<n;i+=2) {
//                    res[j++] = nums[i];
//                }
//            }
//            for(int i=0;i<n-1;i++) {
//                System.out.print(res[i]);
//                System.out.print(' ');
//            }
//            System.out.println(res[n-1]);
//        }
//    }
//}
//

// 网易：堆石子
//import java.util.Scanner;
//import java.util.Collections;
//import java.lang.Math;
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] x = new int[n];
//        int[] y = new int[n];
//        for(int i=0;i<n;i++) {
//            x[i] = sc.nextInt();
//        }
//        for(int i=0;i<n;i++) {
//            y[i] = sc.nextInt();
//        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(0);
//        for(int k=1;k<n;k++) { // k
//            int min = Integer.MAX_VALUE;
//            for(int i=0;i<n;i++) {
//                for(int j=0;j<n;j++) { // calculate the distance from node 1...n to node[i, j]
//                    int sum = 0;
//                    List<Integer> list = new ArrayList<>();
//                    for (int s=0;s<n;s++) {
//                        list.add(Math.abs(x[s]-x[i])+Math.abs(y[s]-y[j]));
//                    }
//                    Collections.sort(list);
////                    System.out.println(list.toString());
//                    for(int t=0;t<=k;t++) {
//                        sum+= list.get(t);
//                    }
//                    min = min>sum?sum:min;
//                }
//
//            }
////            System.out.print("k: ");
////
////            System.out.println(k);
////            System.out.println(min);
//            sb.append(' ');
//            sb.append(min);
//        }
//        System.out.println(sb.toString());
//    }
//
//}

// 网易： 疯狂队列
//import java.util.*;
//import java.lang.Math;
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n==1) {
//            System.out.println(0);
//        }
//        else {
//            int[] nums = new int[n];
//
//
//            for(int i=0;i<n;i++) {
//                nums[i] = sc.nextInt();
//            }
//            Arrays.sort(nums);
//            boolean[] smallTwoCases = {true, false};
//            int max = Integer.MIN_VALUE;
//            for (boolean s:smallTwoCases) {
//                int i = 0;
//                int j = n-1;
//                int x = n/2;
//                int y = n/2;
//                int sum = 0;
//                int[] res = new int[n];
//                if(s) {
//                    res[x] = nums[j--];// put the max in the center
//                }
//                else {
//                    res[x] = nums[i++]; // put the min in the center
//                }
//                x--;
//                y++;
//                boolean small = s;
//                while(i<=j) {
//                    if(small) {
//                        if (x>=0) {
//                            res[x--] = nums[i++];
//                        }
//                        if (y<n) {
//                            res[y++] = nums[i++];
//                        }
////                    if (x<0 && y>=n) {
////                        break;
////                    }
//
//                    }
//                    else {
//                        if (x>=0) {
//                            res[x--] = nums[j--];
//                        }
//                        if (y<n) {
//                            res[y++] = nums[j--];
//                        }
////                    if (x<0 && y>=n) {
////                        break;
////                    }
//                    }
//                    small = !small;
//                }
//
//
////                for(int v:res) {
////                    System.out.print(v);
////                    System.out.print(' ');
////                }
////                System.out.println();
//                for (int k=1;k<n;k++) {
//                    sum += Math.abs(res[k]-res[k-1]);
//                }
//                max = max<sum?sum:max;
//            }
//
//            System.out.println(max);
//        }
//    }
//}


// 网易： 小易喜欢的数列


import java.util.*;
import java.lang.Math;


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[][] dp = new int[n][k];
//        for(int j=1;j<=k;j++) {
//            dp[0][j-1] = 1;
//        }
//
//        for(int i=1;i<n;i++) {
//            for(int j=1;j<=k;j++) {
//                for(int x = 2;x*j<=k;x++) {
//                    dp[i][j-1] += dp[i-1][x*j-1];
//                }
//            }
//        }
//        for(int i=0;i<n;i++) {
//            for(int j=1;j<=k;j++) {
//                System.out.println(dp[i][j-1]);
//            }
//        }
//
//        double total = Math.pow(k, n);
//        for(int j=1;j<=k;j++) {
//            total-=dp[n-1][j-1];
//        }
//        System.out.println((int)(total)%1000000007);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String s = in.next();
//
//        if(n==0) {
//            System.out.println('N');
//        }
//        else {
//            int l = 0;
//            for(int i=0;i<s.length();i++) {
//                if(s.charAt(i)=='L') {
//                    l++;
//                }
//            }
//            int r = n - l;
//
//
//            char[] left = {'N', 'W', 'S', 'E'};
//            char[] right = {'N', 'E', 'S', 'W'};
//            if(r>=l) {
//                System.out.println(right[(r-l)%4]);
//            }
//            else {
//                System.out.println(left[(l-r)%4]);
//            }
//        }
//    }
//}


//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int l = in.nextInt();
//        int r = in.nextInt();
//        int last = ((l+1)*l)>>1;
//        int count = (last%3==0)?1:0;
//        for(int i=l+1;i<=r;i++) {
//            last += i;
//            count += (last%3==0)?1:0;
//        }
//        System.out.println(count);
//    }
//}


import java.util.Scanner;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);

        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.print(s.pop());

        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int mod = 0;

        for(int i=1;i<l;i++) {
            mod = (mod + i)%3;
        }
        int count = (mod==0)?1:0;
        for(int i=l+1;i<=r;i++) {
            mod = (mod + i)%3;
            count += (mod==0)?1:0;
        }
        System.out.println(count);
    }
}