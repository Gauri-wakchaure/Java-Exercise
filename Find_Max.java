class Find_Max {
    public static void main(String[] args) {
        int array[] = {23, 90, 45, 78, 999, 32};

        int max = array[0];
        for(int i= 0; i<array.length; i++) {
           if(array[i]> max) {
               max = array[i];
           }
        }
        System.out.println(max);
    }                   
 }
