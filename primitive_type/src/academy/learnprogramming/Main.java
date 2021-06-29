package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("nilai minimal" + myMinIntValue);
        System.out.println("nilai maximal" + myMaxIntValue);
        System.out.println("BUSTED MAX Value = "+ (myMaxIntValue + 1));
        System.out.println("BUSTED MIN Value = "+ (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long cobainSeberapapanjang = 897_987_546_321_231_132L;
        System.out.println(cobainSeberapapanjang);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);


    }
}
