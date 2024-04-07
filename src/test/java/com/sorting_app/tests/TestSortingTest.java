package com.sorting_app.tests;

import com.sorting_app.Sorting;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSortingTest {
    @Test
    public void testOrganizar() {
        // Create an array with unsorted integers
        int[] unsortedArray = {5, 3, 8, 1, 6, 2, 7, 4, 10, 9};

        // Create an instance of com.sorting_app.Sorting with unsortedArray
        Sorting sorting = new Sorting(unsortedArray);

        // Call the Organizar method
        sorting.Organizar();

        // Get the sorted array
        int[] sortedArray = sorting.getArreglo();

        // Verify that the sorted array is correctly sorted
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expectedArray, sortedArray);
    }
}
