/*
 * This file is part of java2c. It is subject to the licence terms in the COPYRIGHT file found in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT. No part of compilerUser, including this file, may be copied, modified, propagated, or distributed except according to the terms contained in the COPYRIGHT file.
 * Copyright © 2014-2015 The developers of java2c. See the COPYRIGHT file in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT.
 */

package com.java2c.transpiler.typeElementHandlers;

import com.compilerUser.elementHandlers.ElementHandler;
import com.java2c.transpiler.OurAbstractSyntaxTreeInterpreter;
import org.jetbrains.annotations.NotNull;

import javax.lang.model.element.TypeElement;

public final class EnumTypeElementHandler extends AbstractTypeElementHandler
{
	@Override
	public void handle(@NotNull final OurAbstractSyntaxTreeInterpreter abstractSyntaxTreeInterpreter, @NotNull final TypeElement element, @NotNull final ElementHandler<TypeElement, OurAbstractSyntaxTreeInterpreter> dispatchingTypeElementHandler)
	{
		super.handle(abstractSyntaxTreeInterpreter, element, dispatchingTypeElementHandler);

		abstractSyntaxTreeInterpreter.guardClassInheritsFromAbstractCType(element);
	}
}
