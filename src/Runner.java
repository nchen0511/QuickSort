public class Runner {
    public static void main(String[] args){
        int[] array = new int[1000];
        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*10001);
        }





        String temp = "";
        for(int i=0;i<array.length;i++){
            temp+=array[i] + ", ";
        }
        System.out.println(temp);

        quickSort.quickSort(array,0,array.length-1);

        temp = "";
        for(int i=0;i<array.length;i++){
            temp+=array[i] + ", ";
        }
        System.out.println(temp);
    }
}
