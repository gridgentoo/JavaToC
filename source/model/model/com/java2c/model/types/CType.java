/*
 * This file is part of java2c. It is subject to the licence terms in the COPYRIGHT file found in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT. No part of compilerUser, including this file, may be copied, modified, propagated, or distributed except according to the terms contained in the COPYRIGHT file.
 * Copyright © 2014-2015 The developers of java2c. See the COPYRIGHT file in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT.
 */

package com.java2c.model.types;

import org.jetbrains.annotations.Nullable;

@SuppressWarnings("InterfaceWithOnlyOneDirectInheritor")
@Uncastable
public interface CType
{
	@Banished
	@Override
	boolean equals(@Nullable final Object obj) throws BanishedException;

	@Banished
	@Override
	int hashCode() throws BanishedException;

	@Banished
	@Override
	String toString() throws BanishedException;
}
