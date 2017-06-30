
public class AliquotSum {

	// main method
		public static void main(String[] args) {
			
			
			int aliquotSumOf = 19;
			long aliquotSum = findAliquotSum(aliquotSumOf);
			
			System.out.println("Aliquot Sum of " + aliquotSum + " is " + aliquotSum + ".");
			//Applying if & else condition
			if(aliquotSum == aliquotSumOf){
				System.out.println(aliquotSumOf + " is a perfect number.");
			}else{
				System.out.println(aliquotSumOf + " is not a perfect number.");
			}
			
			//printline
			System.out.println("Perfect Numbers between 1 to 100 are: ");
			//here we are initializing the number between 1 to 100
			for(int i=1; i<=100; i++){
				aliquotSumOf = i;
				if(findAliquotSum(i) == aliquotSumOf){
					System.out.print(aliquotSumOf + " ");
				}
			}
		}
	//Method for finding the  aliquot sum
		public static long findAliquotSum(int n) {
			long result = 0;

			for (byte i = 1; i <= (n / 2); i++) {
				if (n % i == 0) {
					result += i;
				}
			}
			return result;
		}

	

	}


