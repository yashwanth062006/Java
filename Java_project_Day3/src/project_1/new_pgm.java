package project_1;

public class new_pgm {
		public static void main(String[] args) {
			System.out.println("Hello");

			try {                                    //try
				System.out.println(10 / 2);
				int[] a = { 10, 20, 30 };
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);

			}

			catch (ArrayIndexOutOfBoundsException e) {  //catch(array)
				System.out.println(" Array handle");

			} catch (ArithmeticException e) {           //which_exception_arthimetic
				System.out.println(" arthimatic handle");
			} catch (Exception e) {                    //main_can_solve_anyexceptions
				System.out.println(" exception handle");
			}
			System.out.println("Hello sir");
		}

	}


