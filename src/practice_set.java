public class practice_set {
    public static void main(String[] args) {
       /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
System.out.println("The value of sum is "+sum);

        */
      /*  float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 46.7f;
        boolean isInArray = false;
        for (float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The Value is present in the array");

        }
        else {
            System.out.println("The Value is not present in the array");

        }
        */
      /*  float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is "+sum/marks.length);

*/

        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{5,8,9},{14,55,26}};
        int [][] result = {{0,0,0},{0,0,0}};
        for(int i = 0; i<mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                System.out.format("Setting the value for i=%d and j=%d\n",i ,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

    }
}
