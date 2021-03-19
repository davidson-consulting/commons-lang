/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.powerapi.jjoules.junit5.EnergyTest;
public class ArraySorterTest {

    @EnergyTest
    public void aaawarmup0() {
        System.out.println("aaawarmup");
    }
    
    @EnergyTest
    public void aaawarmup1() {
        System.out.println("aaawarmup");
    }
    
    @EnergyTest
    public void aaawarmup2() {
        System.out.println("aaawarmup");
    }
    
    @EnergyTest
    public void aaawarmup3() {
        System.out.println("aaawarmup");
    }

    @EnergyTest
    public void aaawarmup4() {
        System.out.println("aaawarmup");
    }

    @EnergyTest
    public void aaawarmup5() {
        System.out.println("aaawarmup");
    }

    @EnergyTest
    public void aaawarmup6() {
        System.out.println("aaawarmup");
    }

    @EnergyTest
    public void aaawarmup7() {
    }

    @EnergyTest
    public void aaawarmup8() {
        System.out.println("aaawarmup");
    }

    @EnergyTest
    public void aaawarmup9() {
        System.out.println("aaawarmup");
    }

    @EnergyTest
    public void testSortByteArray() {
        final byte[] array1 = {2, 1};
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortCharArray() {
        final char[] array1 = {2, 1};
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortComparable() {
        final String[] array1 = ArrayUtils.toArray("foo", "bar");
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2, String::compareTo));
    }

    @EnergyTest
    public void testSortDoubleArray() {
        final double[] array1 = {2, 1};
        final double[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortFloatArray() {
        final float[] array1 = {2, 1};
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortIntArray() {
        final int[] array1 = {2, 1};
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortLongArray() {
        final long[] array1 = {2, 1};
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortObjects() {
        final String[] array1 = ArrayUtils.toArray("foo", "bar");
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

    @EnergyTest
    public void testSortShortArray() {
        final short[] array1 = {2, 1};
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        assertArrayEquals(array1, ArraySorter.sort(array2));
    }

}
