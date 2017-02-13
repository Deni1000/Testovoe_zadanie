import java.util.Scanner;
public class Example {
public static void main(String... args) 
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Vvedite chislo stolbcov massiva:");		        
				int N = in.nextInt();
				System.out.println("Vvedite chislo stroc massiva:");		        
				int K = in.nextInt();
				int array[][] = new int[N][K];
				System.out.println("Vvedite niznye znachenie  diapazona min:");
				int mind = in.nextInt();
				System.out.println("Vvedite verhnee znachenie  diapazona max:");
				int maxd = in.nextInt();
				
				
                 for(int i=0; i<N; i++)
				  for (int p=0; p < K; p++)	
				  { 				  
                 array[i][p] = rnd(mind, maxd);
				  System.out.println("array[" + i+"]["+p+"]"+"-"+ array[i][p]);
				  }
				 System.out.println("Vvedite niznye znachenie  diapazona poiska min:");
				int min1 = in.nextInt();
				
				  System.out.println("Vvedite verhnee znachenie  diapazona poiska  max:");
				int max1 = in.nextInt();
				System.out.println("Kolichestvo chisel massiva iz ukazannogo diapazona sostavlyaet   " + massiv(array, min1, max1));
                
        }
//gfhgfhfgh
        
        public static int rnd(int min, int max)
        {
                max -= min;
                return (int) (Math.random() * ++max) + min;
        }
		public static int massiv(int[][] array, int min1, int max1)
		{  int ee=0;
			for(int ii=0; ii<array.length; ii++)
				  for (int pp=0; pp < array[0].length; pp++)
					  if (array[ii][pp] > min1 & array[ii][pp] < max1)
						  ee++;
					  return ee;
		}
		
}