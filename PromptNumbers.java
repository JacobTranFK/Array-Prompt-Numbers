public class PromptNumbers {

public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int count = console.nextInt();
        int[] array = new int[count];       
        for (int i = 0; i < count; i++) {
            // your code goes here; store the numbers
            System.out.print("Type a number: ");
                array[i] = console.nextInt();            
        }
        
        System.out.println();
        System.out.println("Your numbers in forward order:");
            // your code goes here; print the numbers in forward order
        forward(array);
        
        System.out.println();
        System.out.println("Your numbers in backward order:");
        backward(array);
    }        
        public static void forward(int[] arr) {
                for(int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
            }
        }
        
        public static void backward(int[] arr) {
                for(int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
            }
        }
}
