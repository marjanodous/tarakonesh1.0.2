package com.example.tarakonesh;

/*support telgram id =@javaprogrammer_eh
 * 24/03/1398
 * creted by elmira hossein zadeh*/

public class ConvertingArray {
    public static int SumWithenhanceFor(int[] array) {
        int sum = 0;
        for (int data : array) {
            sum += data;
        }
        //    Log.i("sumsumsumsumsumsummmmm", String.valueOf(sum));
        return sum;
    }

    public static Long SumWithenhanceForLong(Long[] array) {
        Long sum = 0L;
        for (Long data : array) {
            sum += data;
        }
        // Log.i("sumsumsumsumsumsummmmm", String.valueOf(sum));
        return sum;
    }

    //    public static int SumWithFor(int[] array){
//        int sum=0;
//        for (int i = 0; i < array.length; i++) {
//            sum+=array[i];
//        }
//
//        return sum;
//    }
    public static int[] strArrayToIntArray(String[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }

    public static Long[] strArrayToLongArray(String[] a) {
        Long[] b = new Long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Long.parseLong(a[i]);
        }

        return b;
    }

    public static Long subtractionValue(Long daramad, Long hazineh) {
        Long daramadValue, hazinehValue, sumValue;
        daramadValue = daramad;
        hazinehValue = hazineh;
        sumValue = daramadValue - hazinehValue;
        return sumValue;
    }
}
//////////////////////Test
//                String[] arrayListTransaction1 = Database.getDatatransactionDaramad(getContext());
//                Long[] integerArray1 = ConvertingArray.strArrayToLongArray(arrayListTransaction1);
//                Long daramad = ConvertingArray.SumWithenhanceForLong(integerArray1);
//
//                String[] arrayListTransaction2 = Database.getDatatransactionHazineh(getContext());
//                Long[] integerArray2 = ConvertingArray.strArrayToLongArray(arrayListTransaction2);
//                Long hazineh = ConvertingArray.SumWithenhanceForLong(integerArray2);
//
//               Long subtractionMoney= ConvertingArray.subtractionValue(daramad,hazineh);
//               Log.i("subtractionMoneymeeeeee",String.valueOf(subtractionMoney));