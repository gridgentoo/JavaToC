package com.java2c.samples4.builtin;

import com.java2c.samples4.AbstractScalar;
import com.java2c.samples4.CCodeTemplate;
import com.java2c.samples4.Scalar;
import com.java2c.samples4.scalars.BooleanAlgebra;
import com.java2c.samples4.scalars.Comparison;
import com.java2c.samples4.scalars.Equality;
import com.java2c.samples4.scalars.Mathematics;
import org.jetbrains.annotations.NotNull;

// uint8_t on LP64
@SuppressWarnings("ClassNamingConvention")
@Scalar(value = "unsigned char", signed = false)
public final class c_unsigned_char extends AbstractScalar<c_unsigned_char> implements Equality<c_unsigned_char>, Comparison<c_unsigned_char>, Mathematics<c_unsigned_char>, BooleanAlgebra<c_unsigned_char>
{
	@CCodeTemplate(CCodeTemplate.Scalar)
	public c_unsigned_char(final long value)
	{
		super(value);
	}

	@NotNull
	@Override
	protected c_unsigned_char constructT(@SuppressWarnings("ParameterHidesMemberVariable") final long value)
	{
		return new c_unsigned_char(value);
	}

	@SuppressWarnings("CovariantEquals")
	@Override
	public boolean equals(@NotNull final c_unsigned_char right)
	{
		return super.equals(right);
	}

	@Override
	public boolean notEquals(@NotNull final c_unsigned_char right)
	{
		return super.notEquals(right);
	}

	@Override
	public boolean greaterThan(@NotNull final c_unsigned_char right)
	{
		return super.greaterThan(right);
	}

	@Override
	public boolean lessThan(@NotNull final c_unsigned_char right)
	{
		return super.lessThan(right);
	}

	@Override
	public boolean greaterThanOrEqualTo(@NotNull final c_unsigned_char right)
	{
		return super.greaterThanOrEqualTo(right);
	}

	@Override
	public boolean lessThanOrEqualTo(@NotNull final c_unsigned_char right)
	{
		return super.lessThanOrEqualTo(right);
	}

	@NotNull
	@Override
	public c_unsigned_char add(@NotNull final c_unsigned_char right)
	{
		return super.add(right);
	}

	@NotNull
	@Override
	public c_unsigned_char subtract(@NotNull final c_unsigned_char right)
	{
		return super.subtract(right);
	}

	@NotNull
	@Override
	public c_unsigned_char multiply(@NotNull final c_unsigned_char right)
	{
		return super.multiply(right);
	}

	@NotNull
	@Override
	public c_unsigned_char divide(@NotNull final c_unsigned_char right)
	{
		return super.divide(right);
	}

	@NotNull
	@Override
	public c_unsigned_char modulus(@NotNull final c_unsigned_char right)
	{
		return super.modulus(right);
	}

	@Override
	public c_unsigned_char and(@NotNull final c_unsigned_char right)
	{
		return super.and(right);
	}

	@Override
	public c_unsigned_char or(@NotNull final c_unsigned_char right)
	{
		return super.or(right);
	}
}
