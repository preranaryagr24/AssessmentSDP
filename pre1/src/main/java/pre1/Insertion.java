	package pre1;
    import java.util.*;
    public class Insertion{
        public  void mainF1() {
            int[] a;
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            for (int i = 1; i < n; i++) {
                int temp = a[i];
                int j = i-1 ;

                while (j>=0 && a[j]>temp) {
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = temp ;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
            scan.close();
        }

		public  void mainF1() {
		    int[] a;
		    Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		
		    a = new int[n];
		
		    for (int i = 0; i < n; i++) {
		        a[i] = scan.nextInt();
		    }
		
		    for (int i = 1; i < n; i++) {
		        int temp = a[i];
		        int j = i-1 ;
		
		        while (j>=0 && a[j]>temp) {
		            a[j+1] = a[j];
		            j--;
		        }
		        a[j+1] = temp ;
		    }
		
		    for (int i = 0; i < n; i++) {
		        System.out.print(a[i]+" ");
		    }
		    scan.close();
		}
    }

