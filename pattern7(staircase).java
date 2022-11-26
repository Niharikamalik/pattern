public static void staircase(int n) {
    // Write your code here
    int k = n-1;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(j<k)System.out.print(" ");
            else System.out.print("#");
        }
        System.out.println();
        k = k-1;
    }
 }

}
// https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
