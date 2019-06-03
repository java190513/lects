package com.vcs.lects.l05.tasks;

public class SortTask {


    //"0 345 657 7 768 435 34 234 0"

    public static void main(String[] args) {

        SortTask s = new SortTask();
        int[] sorted = s.sort("0 345 657 7 768 -435 34 234 0", true);

        for (int v : sorted) {
            System.out.print(v + ", ");
        }

    }

    public int[] sort(String strData, boolean asc) {
        int[] data = parseStrData(strData);
        return sortAsIntegers(data, asc);
    }

    private int[] parseStrData(String strData) {

        String[] strArr = strData.split(" ");
        int[] result = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            result[i] = Integer.parseInt(strArr[i]);
        }
        return result;
    }

    private int[] sortAsIntegers(int[] data, boolean asc) {

        int indexToSwap1 = 0;

        for (int i = 0; i < data.length; i++) {
            indexToSwap1 = i;

            int indexToSwap2 = findExtremum(i, data, asc);
            swap(data, indexToSwap1, indexToSwap2);
        }
        return data;
    }

    private int findExtremum(int fromIndex, int[] data, boolean asc) {

        int extVal = data[fromIndex];
        int extIndex = fromIndex;

        for (int i = fromIndex; i < data.length; i++) {


            if (asc) {
                if (extVal > data[i]) {
                    extVal = data[i];
                    extIndex = i;
                }
            } else {
                if (extVal < data[i]) {
                    extVal = data[i];
                    extIndex = i;
                }
            }

//			if ((asc && extVal > data[i]) || (!asc && extVal < data[i])) {
//				extVal = data[i];
//				extIndex = i;
//			}
        }
        return extIndex;
    }

    private void swap(int[] data, int i1, int i2) {

        if (i1 == i2) {
            return;
        }

        int temp = data[i1];
        data[i1] = data[i2];
        data[i2] = temp;
    }

}
