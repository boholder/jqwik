package net.jqwik.providers;

import net.jqwik.api.*;
import net.jqwik.api.arbitraries.*;
import net.jqwik.api.constraints.*;
import net.jqwik.api.providers.*;

import java.util.*;
import java.util.function.*;

public class IntegerArbitraryProvider extends NullableArbitraryProvider {
	@Override
	public boolean canProvideFor(GenericType targetType) {
		return targetType.isCompatibleWith(Integer.class);
	}

	@Override
	public Arbitrary<?> provideFor(GenericType targetType, Function<GenericType, Optional<Arbitrary<?>>> subtypeProvider) {
		return Arbitraries.integers();
	}

	public IntegerArbitrary configure(IntegerArbitrary arbitrary, IntRange range) {
		return arbitrary.withMin(range.min()).withMax(range.max());
	}

}
