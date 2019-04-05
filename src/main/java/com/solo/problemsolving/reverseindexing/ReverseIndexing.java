package com.solo.problemsolving.reverseindexing;

import java.util.List;

public class ReverseIndexing<T> {
    /*

     */
    public static <T>  T getpositionalIndex(List<T> list, int indexPosition) {
        if(list== null || list.isEmpty ())
            return null;
        int position =list.size () - indexPosition;
        if(position<0)
            return null;

        return (T)list.get (position);
    }
}
