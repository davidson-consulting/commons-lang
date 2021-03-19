package org.apache.commons.lang3;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.powerapi.jjoules.junit5.EnergyTest;
public class AmplEnergyArraySorterTest {

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
    public void testSortByteArray() throws Exception {
        final byte[] array1 = new byte[]{ 2, 1 };
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{1,2}, o_testSortByteArray__5);
        Assertions.assertArrayEquals(new byte[]{1,2}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber28() throws Exception {
        final byte[] array1 = new byte[]{ 1, 1 };
        Assertions.assertArrayEquals(new byte[]{1,1}, array1);
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber28__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{1,1}, o_testSortByteArray_literalMutationNumber28__6);
        Assertions.assertArrayEquals(new byte[]{1,1}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber29() throws Exception {
        final byte[] array1 = new byte[]{ 4, 1 };
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber29__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{1,4}, o_testSortByteArray_literalMutationNumber29__6);
        Assertions.assertArrayEquals(new byte[]{1,4}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber30() throws Exception {
        final byte[] array1 = new byte[]{ 0, 1 };
        Assertions.assertArrayEquals(new byte[]{0,1}, array1);
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber30__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{0,1}, o_testSortByteArray_literalMutationNumber30__6);
        Assertions.assertArrayEquals(new byte[]{0,1}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber31() throws Exception {
        final byte[] array1 = new byte[]{ 0, 1 };
        Assertions.assertArrayEquals(new byte[]{0,1}, array1);
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber31__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{0,1}, o_testSortByteArray_literalMutationNumber31__6);
        Assertions.assertArrayEquals(new byte[]{0,1}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber32() throws Exception {
        final byte[] array1 = new byte[]{ 3, 1 };
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber32__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{1,3}, o_testSortByteArray_literalMutationNumber32__6);
        Assertions.assertArrayEquals(new byte[]{1,3}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber33() throws Exception {
        final byte[] array1 = new byte[]{ 2, 2 };
        Assertions.assertArrayEquals(new byte[]{2,2}, array1);
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber33__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{2,2}, o_testSortByteArray_literalMutationNumber33__6);
        Assertions.assertArrayEquals(new byte[]{2,2}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber34() throws Exception {
        final byte[] array1 = new byte[]{ 2, 0 };
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber34__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{0,2}, o_testSortByteArray_literalMutationNumber34__6);
        Assertions.assertArrayEquals(new byte[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber35() throws Exception {
        final byte[] array1 = new byte[]{ 2, 0 };
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber35__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{0,2}, o_testSortByteArray_literalMutationNumber35__6);
        Assertions.assertArrayEquals(new byte[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortByteArray_literalMutationNumber36() throws Exception {
        final byte[] array1 = new byte[]{ 2, 0 };
        final byte[] array2 = array1.clone();
        Arrays.sort(array1);
        byte[] o_testSortByteArray_literalMutationNumber36__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new byte[]{0,2}, o_testSortByteArray_literalMutationNumber36__6);
        Assertions.assertArrayEquals(new byte[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortCharArray() throws Exception {
        final char[] array1 = new char[]{ 2, 1 };
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{'',''}, o_testSortCharArray__5);
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber64() throws Exception {
        final char[] array1 = new char[]{ 1, 1 };
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber64__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{'',''}, o_testSortCharArray_literalMutationNumber64__6);
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber65() throws Exception {
        final char[] array1 = new char[]{ 4, 1 };
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber65__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{'',''}, o_testSortCharArray_literalMutationNumber65__6);
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber66() throws Exception {
        final char[] array1 = new char[]{ 0, 1 };
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber66__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{' ',''}, o_testSortCharArray_literalMutationNumber66__6);
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber67() throws Exception {
        final char[] array1 = new char[]{ 0, 1 };
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber67__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{' ',''}, o_testSortCharArray_literalMutationNumber67__6);
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber68() throws Exception {
        final char[] array1 = new char[]{ 3, 1 };
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber68__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{'',''}, o_testSortCharArray_literalMutationNumber68__6);
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber69() throws Exception {
        final char[] array1 = new char[]{ 2, 2 };
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber69__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{'',''}, o_testSortCharArray_literalMutationNumber69__6);
        Assertions.assertArrayEquals(new char[]{'',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber70() throws Exception {
        final char[] array1 = new char[]{ 2, 0 };
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber70__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{' ',''}, o_testSortCharArray_literalMutationNumber70__6);
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber71() throws Exception {
        final char[] array1 = new char[]{ 2, 0 };
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber71__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{' ',''}, o_testSortCharArray_literalMutationNumber71__6);
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
    }

    @EnergyTest
    public void testSortCharArray_literalMutationNumber72() throws Exception {
        final char[] array1 = new char[]{ 2, 0 };
        final char[] array2 = array1.clone();
        Arrays.sort(array1);
        char[] o_testSortCharArray_literalMutationNumber72__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new char[]{' ',''}, o_testSortCharArray_literalMutationNumber72__6);
        Assertions.assertArrayEquals(new char[]{' ',''}, array1);
    }

    @EnergyTest
    public void testSortComparable() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "bar");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable__6 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable__6)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable__6)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable__6)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable__6)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable__6)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable__6)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable__6)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable__6)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable__6)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable__6)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString100() throws Exception {
        final String[] array1 = ArrayUtils.toArray("", "bar");
        Assertions.assertEquals("", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString100__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("", ((java.lang.String[])o_testSortComparable_literalMutationString100__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortComparable_literalMutationString100__7)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])o_testSortComparable_literalMutationString100__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])o_testSortComparable_literalMutationString100__7)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])o_testSortComparable_literalMutationString100__7)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable_literalMutationString100__7)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable_literalMutationString100__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString100__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString100__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString100__7)[1].isBlank());
        Assertions.assertEquals("", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString101() throws Exception {
        final String[] array1 = ArrayUtils.toArray("\u0000", "bar");
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString101__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("\u0000", ((java.lang.String[])o_testSortComparable_literalMutationString101__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortComparable_literalMutationString101__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString101__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])o_testSortComparable_literalMutationString101__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString101__7)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable_literalMutationString101__7)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable_literalMutationString101__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString101__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString101__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString101__7)[1].isBlank());
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString102() throws Exception {
        final String[] array1 = ArrayUtils.toArray("f}oo", "bar");
        Assertions.assertEquals("f}oo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3162359, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,125,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString102__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable_literalMutationString102__7)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable_literalMutationString102__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString102__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString102__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString102__7)[0].isBlank());
        Assertions.assertEquals("f}oo", ((java.lang.String[])o_testSortComparable_literalMutationString102__7)[1].toString());
        Assertions.assertEquals(3162359, ((java.lang.String[])o_testSortComparable_literalMutationString102__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString102__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,125,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString102__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString102__7)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("f}oo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3162359, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,125,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString103() throws Exception {
        final String[] array1 = ArrayUtils.toArray("fo", "bar");
        Assertions.assertEquals("fo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3273, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString103__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable_literalMutationString103__7)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable_literalMutationString103__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString103__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString103__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString103__7)[0].isBlank());
        Assertions.assertEquals("fo", ((java.lang.String[])o_testSortComparable_literalMutationString103__7)[1].toString());
        Assertions.assertEquals(3273, ((java.lang.String[])o_testSortComparable_literalMutationString103__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString103__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111}, ((java.lang.String[])o_testSortComparable_literalMutationString103__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString103__7)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("fo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3273, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString104() throws Exception {
        final String[] array1 = ArrayUtils.toArray("*oo", "bar");
        Assertions.assertEquals("*oo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(43914, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{42,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString104__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("*oo", ((java.lang.String[])o_testSortComparable_literalMutationString104__7)[0].toString());
        Assertions.assertEquals(43914, ((java.lang.String[])o_testSortComparable_literalMutationString104__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString104__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{42,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString104__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString104__7)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable_literalMutationString104__7)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable_literalMutationString104__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString104__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString104__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString104__7)[1].isBlank());
        Assertions.assertEquals("*oo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(43914, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{42,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString105() throws Exception {
        final String[] array1 = ArrayUtils.toArray("Gdh", "bar");
        Assertions.assertEquals("Gdh", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(71435, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{71,100,104}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString105__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("Gdh", ((java.lang.String[])o_testSortComparable_literalMutationString105__7)[0].toString());
        Assertions.assertEquals(71435, ((java.lang.String[])o_testSortComparable_literalMutationString105__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString105__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{71,100,104}, ((java.lang.String[])o_testSortComparable_literalMutationString105__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString105__7)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortComparable_literalMutationString105__7)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortComparable_literalMutationString105__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString105__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString105__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString105__7)[1].isBlank());
        Assertions.assertEquals("Gdh", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(71435, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{71,100,104}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString106() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "br");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("br", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3152, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString106__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("br", ((java.lang.String[])o_testSortComparable_literalMutationString106__7)[0].toString());
        Assertions.assertEquals(3152, ((java.lang.String[])o_testSortComparable_literalMutationString106__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString106__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,114}, ((java.lang.String[])o_testSortComparable_literalMutationString106__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString106__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable_literalMutationString106__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable_literalMutationString106__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString106__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString106__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString106__7)[1].isBlank());
        Assertions.assertEquals("br", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3152, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString107() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString107__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("", ((java.lang.String[])o_testSortComparable_literalMutationString107__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortComparable_literalMutationString107__7)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])o_testSortComparable_literalMutationString107__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])o_testSortComparable_literalMutationString107__7)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])o_testSortComparable_literalMutationString107__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable_literalMutationString107__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable_literalMutationString107__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString107__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString107__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString107__7)[1].isBlank());
        Assertions.assertEquals("", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString108() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "\u0000");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString108__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("\u0000", ((java.lang.String[])o_testSortComparable_literalMutationString108__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortComparable_literalMutationString108__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString108__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])o_testSortComparable_literalMutationString108__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString108__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable_literalMutationString108__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable_literalMutationString108__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString108__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString108__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString108__7)[1].isBlank());
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString109() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "car");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("car", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(98260, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{99,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString109__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("car", ((java.lang.String[])o_testSortComparable_literalMutationString109__7)[0].toString());
        Assertions.assertEquals(98260, ((java.lang.String[])o_testSortComparable_literalMutationString109__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString109__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{99,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString109__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString109__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable_literalMutationString109__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable_literalMutationString109__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString109__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString109__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString109__7)[1].isBlank());
        Assertions.assertEquals("car", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(98260, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{99,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString110() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "@!x");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("@!x", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(62647, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{64,33,120}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString110__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("@!x", ((java.lang.String[])o_testSortComparable_literalMutationString110__7)[0].toString());
        Assertions.assertEquals(62647, ((java.lang.String[])o_testSortComparable_literalMutationString110__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString110__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{64,33,120}, ((java.lang.String[])o_testSortComparable_literalMutationString110__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString110__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable_literalMutationString110__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable_literalMutationString110__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString110__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString110__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString110__7)[1].isBlank());
        Assertions.assertEquals("@!x", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(62647, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{64,33,120}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortComparable_literalMutationString111() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "bCar");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bCar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(2987026, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,67,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortComparable_literalMutationString111__7 = ArraySorter.sort(array2, String::compareTo);
        Assertions.assertEquals("bCar", ((java.lang.String[])o_testSortComparable_literalMutationString111__7)[0].toString());
        Assertions.assertEquals(2987026, ((java.lang.String[])o_testSortComparable_literalMutationString111__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString111__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,67,97,114}, ((java.lang.String[])o_testSortComparable_literalMutationString111__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString111__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortComparable_literalMutationString111__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortComparable_literalMutationString111__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString111__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortComparable_literalMutationString111__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortComparable_literalMutationString111__7)[1].isBlank());
        Assertions.assertEquals("bCar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(2987026, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,67,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortDoubleArray() throws Exception {
        final double[] array1 = new double[]{ 2, 1 };
        final double[] array2 = array1.clone();
        Arrays.sort(array1);
        double[] o_testSortDoubleArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new double[]{1.0,2.0}, o_testSortDoubleArray__5, 0.1);
        Assertions.assertArrayEquals(new double[]{1.0,2.0}, array1, 0.1);
    }

    @EnergyTest
    public void testSortFloatArray() throws Exception {
        final float[] array1 = new float[]{ 2, 1 };
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{1.0F,2.0F}, o_testSortFloatArray__5, 0.1F);
        Assertions.assertArrayEquals(new float[]{1.0F,2.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber184() throws Exception {
        final float[] array1 = new float[]{ 1, 1 };
        Assertions.assertArrayEquals(new float[]{1.0F,1.0F}, array1, 0.1F);
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber184__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{1.0F,1.0F}, o_testSortFloatArray_literalMutationNumber184__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{1.0F,1.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber185() throws Exception {
        final float[] array1 = new float[]{ 4, 1 };
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber185__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{1.0F,4.0F}, o_testSortFloatArray_literalMutationNumber185__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{1.0F,4.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber186() throws Exception {
        final float[] array1 = new float[]{ 0, 1 };
        Assertions.assertArrayEquals(new float[]{0.0F,1.0F}, array1, 0.1F);
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber186__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{0.0F,1.0F}, o_testSortFloatArray_literalMutationNumber186__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{0.0F,1.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber187() throws Exception {
        final float[] array1 = new float[]{ 0, 1 };
        Assertions.assertArrayEquals(new float[]{0.0F,1.0F}, array1, 0.1F);
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber187__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{0.0F,1.0F}, o_testSortFloatArray_literalMutationNumber187__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{0.0F,1.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber188() throws Exception {
        final float[] array1 = new float[]{ 3, 1 };
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber188__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{1.0F,3.0F}, o_testSortFloatArray_literalMutationNumber188__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{1.0F,3.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber189() throws Exception {
        final float[] array1 = new float[]{ 2, 2 };
        Assertions.assertArrayEquals(new float[]{2.0F,2.0F}, array1, 0.1F);
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber189__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{2.0F,2.0F}, o_testSortFloatArray_literalMutationNumber189__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{2.0F,2.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber190() throws Exception {
        final float[] array1 = new float[]{ 2, 0 };
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber190__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{0.0F,2.0F}, o_testSortFloatArray_literalMutationNumber190__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{0.0F,2.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber191() throws Exception {
        final float[] array1 = new float[]{ 2, 0 };
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber191__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{0.0F,2.0F}, o_testSortFloatArray_literalMutationNumber191__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{0.0F,2.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortFloatArray_literalMutationNumber192() throws Exception {
        final float[] array1 = new float[]{ 2, 0 };
        final float[] array2 = array1.clone();
        Arrays.sort(array1);
        float[] o_testSortFloatArray_literalMutationNumber192__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new float[]{0.0F,2.0F}, o_testSortFloatArray_literalMutationNumber192__6, 0.1F);
        Assertions.assertArrayEquals(new float[]{0.0F,2.0F}, array1, 0.1F);
    }

    @EnergyTest
    public void testSortIntArray() throws Exception {
        final int[] array1 = new int[]{ 2, 1 };
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{1,2}, o_testSortIntArray__5);
        Assertions.assertArrayEquals(new int[]{1,2}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber220() throws Exception {
        final int[] array1 = new int[]{ 1, 1 };
        Assertions.assertArrayEquals(new int[]{1,1}, array1);
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber220__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{1,1}, o_testSortIntArray_literalMutationNumber220__6);
        Assertions.assertArrayEquals(new int[]{1,1}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber221() throws Exception {
        final int[] array1 = new int[]{ 4, 1 };
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber221__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{1,4}, o_testSortIntArray_literalMutationNumber221__6);
        Assertions.assertArrayEquals(new int[]{1,4}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber222() throws Exception {
        final int[] array1 = new int[]{ 0, 1 };
        Assertions.assertArrayEquals(new int[]{0,1}, array1);
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber222__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{0,1}, o_testSortIntArray_literalMutationNumber222__6);
        Assertions.assertArrayEquals(new int[]{0,1}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber223() throws Exception {
        final int[] array1 = new int[]{ 0, 1 };
        Assertions.assertArrayEquals(new int[]{0,1}, array1);
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber223__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{0,1}, o_testSortIntArray_literalMutationNumber223__6);
        Assertions.assertArrayEquals(new int[]{0,1}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber224() throws Exception {
        final int[] array1 = new int[]{ 3, 1 };
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber224__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{1,3}, o_testSortIntArray_literalMutationNumber224__6);
        Assertions.assertArrayEquals(new int[]{1,3}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber225() throws Exception {
        final int[] array1 = new int[]{ 2, 2 };
        Assertions.assertArrayEquals(new int[]{2,2}, array1);
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber225__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{2,2}, o_testSortIntArray_literalMutationNumber225__6);
        Assertions.assertArrayEquals(new int[]{2,2}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber226() throws Exception {
        final int[] array1 = new int[]{ 2, 0 };
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber226__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{0,2}, o_testSortIntArray_literalMutationNumber226__6);
        Assertions.assertArrayEquals(new int[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber227() throws Exception {
        final int[] array1 = new int[]{ 2, 0 };
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber227__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{0,2}, o_testSortIntArray_literalMutationNumber227__6);
        Assertions.assertArrayEquals(new int[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortIntArray_literalMutationNumber228() throws Exception {
        final int[] array1 = new int[]{ 2, 0 };
        final int[] array2 = array1.clone();
        Arrays.sort(array1);
        int[] o_testSortIntArray_literalMutationNumber228__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new int[]{0,2}, o_testSortIntArray_literalMutationNumber228__6);
        Assertions.assertArrayEquals(new int[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortLongArray() throws Exception {
        final long[] array1 = new long[]{ 2, 1 };
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{1L,2L}, o_testSortLongArray__5);
        Assertions.assertArrayEquals(new long[]{1L,2L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber256() throws Exception {
        final long[] array1 = new long[]{ 1, 1 };
        Assertions.assertArrayEquals(new long[]{1L,1L}, array1);
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber256__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{1L,1L}, o_testSortLongArray_literalMutationNumber256__6);
        Assertions.assertArrayEquals(new long[]{1L,1L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber257() throws Exception {
        final long[] array1 = new long[]{ 4, 1 };
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber257__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{1L,4L}, o_testSortLongArray_literalMutationNumber257__6);
        Assertions.assertArrayEquals(new long[]{1L,4L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber258() throws Exception {
        final long[] array1 = new long[]{ 0, 1 };
        Assertions.assertArrayEquals(new long[]{0L,1L}, array1);
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber258__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{0L,1L}, o_testSortLongArray_literalMutationNumber258__6);
        Assertions.assertArrayEquals(new long[]{0L,1L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber259() throws Exception {
        final long[] array1 = new long[]{ 0, 1 };
        Assertions.assertArrayEquals(new long[]{0L,1L}, array1);
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber259__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{0L,1L}, o_testSortLongArray_literalMutationNumber259__6);
        Assertions.assertArrayEquals(new long[]{0L,1L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber260() throws Exception {
        final long[] array1 = new long[]{ 3, 1 };
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber260__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{1L,3L}, o_testSortLongArray_literalMutationNumber260__6);
        Assertions.assertArrayEquals(new long[]{1L,3L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber261() throws Exception {
        final long[] array1 = new long[]{ 2, 2 };
        Assertions.assertArrayEquals(new long[]{2L,2L}, array1);
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber261__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{2L,2L}, o_testSortLongArray_literalMutationNumber261__6);
        Assertions.assertArrayEquals(new long[]{2L,2L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber262() throws Exception {
        final long[] array1 = new long[]{ 2, 0 };
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber262__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{0L,2L}, o_testSortLongArray_literalMutationNumber262__6);
        Assertions.assertArrayEquals(new long[]{0L,2L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber263() throws Exception {
        final long[] array1 = new long[]{ 2, 0 };
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber263__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{0L,2L}, o_testSortLongArray_literalMutationNumber263__6);
        Assertions.assertArrayEquals(new long[]{0L,2L}, array1);
    }

    @EnergyTest
    public void testSortLongArray_literalMutationNumber264() throws Exception {
        final long[] array1 = new long[]{ 2, 0 };
        final long[] array2 = array1.clone();
        Arrays.sort(array1);
        long[] o_testSortLongArray_literalMutationNumber264__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new long[]{0L,2L}, o_testSortLongArray_literalMutationNumber264__6);
        Assertions.assertArrayEquals(new long[]{0L,2L}, array1);
    }

    @EnergyTest
    public void testSortObjects() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "bar");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects__6 = ArraySorter.sort(array2);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects__6)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects__6)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects__6)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects__6)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects__6)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects__6)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects__6)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects__6)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects__6)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects__6)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString292() throws Exception {
        final String[] array1 = ArrayUtils.toArray("", "bar");
        Assertions.assertEquals("", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString292__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("", ((java.lang.String[])o_testSortObjects_literalMutationString292__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortObjects_literalMutationString292__7)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])o_testSortObjects_literalMutationString292__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])o_testSortObjects_literalMutationString292__7)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])o_testSortObjects_literalMutationString292__7)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects_literalMutationString292__7)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects_literalMutationString292__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString292__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString292__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString292__7)[1].isBlank());
        Assertions.assertEquals("", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString293() throws Exception {
        final String[] array1 = ArrayUtils.toArray("\u0000", "bar");
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString293__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("\u0000", ((java.lang.String[])o_testSortObjects_literalMutationString293__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortObjects_literalMutationString293__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString293__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])o_testSortObjects_literalMutationString293__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString293__7)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects_literalMutationString293__7)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects_literalMutationString293__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString293__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString293__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString293__7)[1].isBlank());
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString294() throws Exception {
        final String[] array1 = ArrayUtils.toArray("y(q", "bar");
        Assertions.assertEquals("y(q", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(117634, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{121,40,113}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString294__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects_literalMutationString294__7)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects_literalMutationString294__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString294__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString294__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString294__7)[0].isBlank());
        Assertions.assertEquals("y(q", ((java.lang.String[])o_testSortObjects_literalMutationString294__7)[1].toString());
        Assertions.assertEquals(117634, ((java.lang.String[])o_testSortObjects_literalMutationString294__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString294__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{121,40,113}, ((java.lang.String[])o_testSortObjects_literalMutationString294__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString294__7)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("y(q", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(117634, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{121,40,113}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString295() throws Exception {
        final String[] array1 = ArrayUtils.toArray("f_oo", "bar");
        Assertions.assertEquals("f_oo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3133529, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,95,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString295__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects_literalMutationString295__7)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects_literalMutationString295__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString295__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString295__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString295__7)[0].isBlank());
        Assertions.assertEquals("f_oo", ((java.lang.String[])o_testSortObjects_literalMutationString295__7)[1].toString());
        Assertions.assertEquals(3133529, ((java.lang.String[])o_testSortObjects_literalMutationString295__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString295__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,95,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString295__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString295__7)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("f_oo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3133529, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,95,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString296() throws Exception {
        final String[] array1 = ArrayUtils.toArray("fo", "bar");
        Assertions.assertEquals("fo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3273, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString296__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects_literalMutationString296__7)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects_literalMutationString296__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString296__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString296__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString296__7)[0].isBlank());
        Assertions.assertEquals("fo", ((java.lang.String[])o_testSortObjects_literalMutationString296__7)[1].toString());
        Assertions.assertEquals(3273, ((java.lang.String[])o_testSortObjects_literalMutationString296__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString296__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111}, ((java.lang.String[])o_testSortObjects_literalMutationString296__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString296__7)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("fo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3273, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString297() throws Exception {
        final String[] array1 = ArrayUtils.toArray("zoo", "bar");
        Assertions.assertEquals("zoo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(120794, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{122,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString297__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("bar", ((java.lang.String[])o_testSortObjects_literalMutationString297__7)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])o_testSortObjects_literalMutationString297__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString297__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString297__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString297__7)[0].isBlank());
        Assertions.assertEquals("zoo", ((java.lang.String[])o_testSortObjects_literalMutationString297__7)[1].toString());
        Assertions.assertEquals(120794, ((java.lang.String[])o_testSortObjects_literalMutationString297__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString297__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{122,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString297__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString297__7)[1].isBlank());
        Assertions.assertEquals("bar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(97299, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("zoo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(120794, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{122,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString298() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "br");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("br", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3152, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString298__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("br", ((java.lang.String[])o_testSortObjects_literalMutationString298__7)[0].toString());
        Assertions.assertEquals(3152, ((java.lang.String[])o_testSortObjects_literalMutationString298__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString298__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,114}, ((java.lang.String[])o_testSortObjects_literalMutationString298__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString298__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects_literalMutationString298__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects_literalMutationString298__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString298__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString298__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString298__7)[1].isBlank());
        Assertions.assertEquals("br", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3152, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString299() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString299__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("", ((java.lang.String[])o_testSortObjects_literalMutationString299__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortObjects_literalMutationString299__7)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])o_testSortObjects_literalMutationString299__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])o_testSortObjects_literalMutationString299__7)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])o_testSortObjects_literalMutationString299__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects_literalMutationString299__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects_literalMutationString299__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString299__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString299__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString299__7)[1].isBlank());
        Assertions.assertEquals("", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertTrue(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString300() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "\u0000");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString300__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("\u0000", ((java.lang.String[])o_testSortObjects_literalMutationString300__7)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])o_testSortObjects_literalMutationString300__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString300__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])o_testSortObjects_literalMutationString300__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString300__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects_literalMutationString300__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects_literalMutationString300__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString300__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString300__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString300__7)[1].isBlank());
        Assertions.assertEquals("\u0000", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(0, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{0}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString301() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", " ar");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals(" ar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(33873, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{32,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString301__7 = ArraySorter.sort(array2);
        Assertions.assertEquals(" ar", ((java.lang.String[])o_testSortObjects_literalMutationString301__7)[0].toString());
        Assertions.assertEquals(33873, ((java.lang.String[])o_testSortObjects_literalMutationString301__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString301__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{32,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString301__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString301__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects_literalMutationString301__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects_literalMutationString301__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString301__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString301__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString301__7)[1].isBlank());
        Assertions.assertEquals(" ar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(33873, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{32,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString302() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "b[ar");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("b[ar", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(3010090, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,91,97,114}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString302__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("b[ar", ((java.lang.String[])o_testSortObjects_literalMutationString302__7)[0].toString());
        Assertions.assertEquals(3010090, ((java.lang.String[])o_testSortObjects_literalMutationString302__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString302__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,91,97,114}, ((java.lang.String[])o_testSortObjects_literalMutationString302__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString302__7)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects_literalMutationString302__7)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects_literalMutationString302__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString302__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString302__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString302__7)[1].isBlank());
        Assertions.assertEquals("b[ar", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(3010090, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{98,91,97,114}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortObjects_literalMutationString303() throws Exception {
        final String[] array1 = ArrayUtils.toArray("foo", "pbL");
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("pbL", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(110746, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{112,98,76}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
        final String[] array2 = array1.clone();
        Arrays.sort(array1);
        String[] o_testSortObjects_literalMutationString303__7 = ArraySorter.sort(array2);
        Assertions.assertEquals("foo", ((java.lang.String[])o_testSortObjects_literalMutationString303__7)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])o_testSortObjects_literalMutationString303__7)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString303__7)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])o_testSortObjects_literalMutationString303__7)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString303__7)[0].isBlank());
        Assertions.assertEquals("pbL", ((java.lang.String[])o_testSortObjects_literalMutationString303__7)[1].toString());
        Assertions.assertEquals(110746, ((java.lang.String[])o_testSortObjects_literalMutationString303__7)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString303__7)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{112,98,76}, ((java.lang.String[])o_testSortObjects_literalMutationString303__7)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])o_testSortObjects_literalMutationString303__7)[1].isBlank());
        Assertions.assertEquals("foo", ((java.lang.String[])array1)[0].toString());
        Assertions.assertEquals(101574, ((java.lang.String[])array1)[0].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isEmpty());
        Assertions.assertArrayEquals(new byte[]{102,111,111}, ((java.lang.String[])array1)[0].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[0].isBlank());
        Assertions.assertEquals("pbL", ((java.lang.String[])array1)[1].toString());
        Assertions.assertEquals(110746, ((java.lang.String[])array1)[1].hashCode());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isEmpty());
        Assertions.assertArrayEquals(new byte[]{112,98,76}, ((java.lang.String[])array1)[1].getBytes());
        Assertions.assertFalse(((java.lang.String[])array1)[1].isBlank());
    }

    @EnergyTest
    public void testSortShortArray() throws Exception {
        final short[] array1 = new short[]{ 2, 1 };
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray__5 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{1,2}, o_testSortShortArray__5);
        Assertions.assertArrayEquals(new short[]{1,2}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber340() throws Exception {
        final short[] array1 = new short[]{ 1, 1 };
        Assertions.assertArrayEquals(new short[]{1,1}, array1);
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber340__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{1,1}, o_testSortShortArray_literalMutationNumber340__6);
        Assertions.assertArrayEquals(new short[]{1,1}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber341() throws Exception {
        final short[] array1 = new short[]{ 4, 1 };
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber341__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{1,4}, o_testSortShortArray_literalMutationNumber341__6);
        Assertions.assertArrayEquals(new short[]{1,4}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber342() throws Exception {
        final short[] array1 = new short[]{ 0, 1 };
        Assertions.assertArrayEquals(new short[]{0,1}, array1);
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber342__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{0,1}, o_testSortShortArray_literalMutationNumber342__6);
        Assertions.assertArrayEquals(new short[]{0,1}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber343() throws Exception {
        final short[] array1 = new short[]{ 0, 1 };
        Assertions.assertArrayEquals(new short[]{0,1}, array1);
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber343__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{0,1}, o_testSortShortArray_literalMutationNumber343__6);
        Assertions.assertArrayEquals(new short[]{0,1}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber344() throws Exception {
        final short[] array1 = new short[]{ 3, 1 };
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber344__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{1,3}, o_testSortShortArray_literalMutationNumber344__6);
        Assertions.assertArrayEquals(new short[]{1,3}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber345() throws Exception {
        final short[] array1 = new short[]{ 2, 2 };
        Assertions.assertArrayEquals(new short[]{2,2}, array1);
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber345__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{2,2}, o_testSortShortArray_literalMutationNumber345__6);
        Assertions.assertArrayEquals(new short[]{2,2}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber346() throws Exception {
        final short[] array1 = new short[]{ 2, 0 };
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber346__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{0,2}, o_testSortShortArray_literalMutationNumber346__6);
        Assertions.assertArrayEquals(new short[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber347() throws Exception {
        final short[] array1 = new short[]{ 2, 0 };
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber347__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{0,2}, o_testSortShortArray_literalMutationNumber347__6);
        Assertions.assertArrayEquals(new short[]{0,2}, array1);
    }

    @EnergyTest
    public void testSortShortArray_literalMutationNumber348() throws Exception {
        final short[] array1 = new short[]{ 2, 0 };
        final short[] array2 = array1.clone();
        Arrays.sort(array1);
        short[] o_testSortShortArray_literalMutationNumber348__6 = ArraySorter.sort(array2);
        Assertions.assertArrayEquals(new short[]{0,2}, o_testSortShortArray_literalMutationNumber348__6);
        Assertions.assertArrayEquals(new short[]{0,2}, array1);
    }
}