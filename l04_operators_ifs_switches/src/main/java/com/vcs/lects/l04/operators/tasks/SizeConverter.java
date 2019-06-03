package com.vcs.lects.l04.operators.tasks;

public class SizeConverter {

    /**
     * 0 bytes ...; 1kb ... ; 1Mb... 1Gb ... ; 1Tb and more;
     * <p>
     * Example: 1,3Gb // <- Acceptable 893Kb // <- Acceptable 1Gb and 312Mb and
     * ...// <- Not acceptable
     * </p>
     * http://byteconvert.org/
     */


    private static final long _1024= 1024;
    private static final long B = 1;
    private static final long KB = B * _1024;
    private static final long MB = KB * _1024;
    private static final long GB = MB * _1024;
    private static final long TB = GB * _1024;


    public String convertToHumanReadable(long sizeInBytes) {

        if (sizeInBytes < KB) {
            return sizeInBytes + " b";
        }
        if (sizeInBytes < MB) {
            return sizeInBytes / KB + " Kb";
        }
        if (sizeInBytes < GB) {
            return cutReminder( 1.0 * sizeInBytes / MB ) + " Mb";
        }
        if (sizeInBytes < TB) {
            return cutReminder(1.0 * sizeInBytes / GB) + " Gb";
        }
        return cutReminder(1.0 * sizeInBytes / TB) + " Tb";
    }

    private String cutReminder(double sizeWithReminder) {

        sizeWithReminder *= 10;
        long sLng = (long) sizeWithReminder;
        if (sLng % 10 == 0) {
            return "" + sLng / 10;
        }
        return "" + sLng / 10.0;
    }
}
