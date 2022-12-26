package sorting;

public class bubble {
    public static void print(int arr[]) {
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]+"  ");
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] ={10,5,8,3,2,4};

        //bubble sort 
        for(int i=0; i<arr.length-1; i++){  //compare korbo  kon num ta sobchaite boro oita ke index er last e pathabo evabe loop chalabo r long path ber korbo 
            for(int j=0; j<arr.length-i-1; j++){ //last jegula loop kore bar korsi oita count korbo na tai  length theke i - 1 kore disi .
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
    }
    print(arr);

  }
}


//string format 

package sorting;

public class bubble {

public static void main(String[] args) {
    int i,j;
    String s_arr[] = {
        "Richard",
        "John",
        "Williams",
        "Peter",
        "Aron"
    };
    String tmp;
    System.out.println("Sorted Strings:");
    for ( i = 0 ; i < s_arr.length ; i++) {
        for ( j = 0 ; j < s_arr.length-i-1 ; j++) {

            if (s_arr[j+1].compareTo(s_arr[j]) > 0) {
                tmp = s_arr[j];
                s_arr[j] = s_arr[j+1];
                s_arr[j+1] = tmp;
            }
        }
        System.out.println(s_arr[j]);
    }
}
}
// bubble sort e looping hosse tai each part e time complexity hosse O(n^2) tai bubble sort better na best complexity hosse nlogn