public class Sample {

        /*İki öğe komşu olmayacak şekilde maksimum toplamı döndüren fonksiyon */
        int FindMaxSum(int arr[], int n)
        {
            int incl = arr[0];
            int excl = 0;
            int excl_new;
            int i;

            for (i = 1; i < n; i++)
            {

                excl_new = (incl > excl) ? incl : excl;

                incl = excl + arr[i];
                excl = excl_new;
            }


            return ((incl > excl) ? incl : excl);
        }


        public static void main(String[] args)
        {
            Sample sum = new Sample();
            int arr[] = new int[]{-2, 1, 3, -4,  5};
            System.out.println(sum.FindMaxSum(arr, arr.length));
            System.out.println();


        }
}
