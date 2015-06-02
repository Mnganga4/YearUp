
public class Loops {

	public static void main(String[] args) {

		//Creating an object
		Loops loop = new Loops();

		//Creating Age number Array
		int [] age = {10, 15, 30, 12, 85, 12, 52, 10, 105, 72};

		int ageToSearchFor = 12; // number to search for

		loop.search(age, ageToSearchFor); // calling our search method 

		loop.searchValue(age, ageToSearchFor); // calling our second search method that has the counter
	}

	// Method to search for a number given an element
	public void search(int[] elements, int searchValue) {
		//Creating a loop to look over elements
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == searchValue) {
				System.out.println("Index: " + i + " contains the search value: " + searchValue);
				break;
			}
		}

	}

	// Method to search for a number incrementing a counter when that value is found 
	public void searchValue(int[] elements, int searchValue) {
		//Number of time a search value occurs
		int numberOfOccurences = 0;

		//Creating a loop to look over elements
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == searchValue) {
				numberOfOccurences++;			
			}
		}

		//Message
		System.out.println("The value: " + searchValue + " occurs " + numberOfOccurences + " times in the array.");
	}

}
