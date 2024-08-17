package test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.sorter.Sorter;
import main.sorter.MergeSort;
import main.sorter.QuickSorter;

public class AppTest {

    @Test
    public void testMerge() {
        Sorter m = new MergeSort();
        int[] values = { 3, 2, 1 };
        int[] sorted = m.sort(values);
        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(3, sorted[2]);
    }

    @Test
    public void testQuick() {
        Sorter m = new QuickSorter();
        int[] values = { 3, 2, 1 };
        int[] sorted = m.sort(values);
        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(3, sorted[2]);
    }

    @Test
    public void testMergeOp() {
        MergeSort m = new MergeSort();
        int[] values1 = { 1, 3, 5 };
        int[] values2 = { 2, 4, 6 };
        int[] sorted = m.merge(values1, values2);
        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(3, sorted[2]);
        assertEquals(4, sorted[3]);
        assertEquals(5, sorted[4]);
        assertEquals(6, sorted[5]);
    }

    //Pedi ao chatgpt que fizesse esse teste;
    @Test
    public void testParticiona() {
        QuickSorter m = new QuickSorter();
        int[] values = { 3, 4, 5, 1, 2 };
        int p = m.partition(values, 0, values.length-1);
        
        // Verifique o estado do array após a partição
        for (int i = 0; i < p; i++) {
            assertEquals(true, values[i] <= values[p]);
        }
        for (int i = p + 1; i < values.length; i++) {
            assertEquals(true, values[i] >= values[p]);
        }
    }

}
