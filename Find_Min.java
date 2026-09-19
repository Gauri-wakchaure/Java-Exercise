class Find_Min {
    public static void main(String[] args) {
        int array[] = {23, 90, 45,11, 78, 999, 32};

        int min = array[0];
        for(int i= 0; i<array.length; i++) {
           if(array[i]< min) {
               min = array[i];
           }
        }
        System.out.println("Smallest Element of Array is: "+min);
    }                   
 }