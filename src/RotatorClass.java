public class RotatorClass {
    public RotatorClass(){

    }

    /*
    Function declaration: This function takes a two dimensional array of strings as a parameter and prints it
    in the suitable format
     */
    public void printShape(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /*
    Function declaration: This function takes a two dimensional array of strings as a parameter and rotates it to the right.
    The rotation is done by dividing the array into inner and outer number of rings equal to length/2. The functionality
    is taken care by nested for loops each of them responsible for different task. The outer loop counts the number of rings
    an array has while the inner loop swaps the elements in each round of rotation. The first round of rotation starts with the
    four corners of the array and the top left corner element is stored in a variable temporarily. The bottom left element takes
    its's position and so on, until the first element in the variable ends up in the top right corner. The same goes for the next
    elements of each side until the round of rotation (ring) is full swapped. The loop proceeds in the next ring until there are no
    elements to swap left.
     */
    public void rotateRight(String[][] arr){
        for(int i = 0; i < arr.length / 2; i++){
            for(int j = i; j < arr.length - 1 - i; j++){
                String temp = arr[i][j];
                arr[i][j] = arr[arr.length - 1 - j][i];
                arr[arr.length - 1 - j][i] = arr[arr.length - 1 - i][arr.length - 1 - j];
                arr[arr.length - 1 - i][arr.length - 1 - j] = arr[j][arr.length - 1 - i];
                arr[j][arr.length - 1 - i] = temp;
            }
        }
    }


    /*
    Function declaration: This function does exactly the same with rotateRight with the only difference being the order of
    the elements that are swapped each time. The top left element is stored in a variable and replaced by the top right, then the
    top right by the bottom left and bottom left by the first element. The rest of the logic stays the same.
     */
    public void rotateLeft(String[][] arr){
        for(int x = 0; x < arr.length / 2; x++){
            for(int y = x; y < arr.length - 1 - x; y++){
                String temp = arr[x][y];
                arr[x][y] = arr[y][arr.length - 1 - x];
                arr[y][arr.length - 1 - x] = arr[arr.length - 1 - x][arr.length - 1 - y];
                arr[arr.length - 1 - x][arr.length - 1 - y] =  arr[arr.length - 1 - y][x];
                arr[arr.length - 1 - y][x] = temp;
            }
        }
    }

}
