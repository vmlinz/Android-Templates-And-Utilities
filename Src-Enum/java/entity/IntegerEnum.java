package com.example.entity;


public enum IntegerEnum
{
	UNDEFINED(0), GRAY_SCALE(1), RGB(2), CMYK(3);

	private final int mValue;


	public static IntegerEnum valueToIntegerEnum(int value)
	{
		IntegerEnum[] values = IntegerEnum.values();
		return values[value];
	}


	private IntegerEnum(int value)
	{
		mValue = value;
	}


	public int getValue()
	{
		return mValue;
	}
}
