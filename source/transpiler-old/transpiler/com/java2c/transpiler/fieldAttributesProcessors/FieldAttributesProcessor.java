/*
 * This file is part of java2c. It is subject to the licence terms in the COPYRIGHT file found in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT. No part of compilerUser, including this file, may be copied, modified, propagated, or distributed except according to the terms contained in the COPYRIGHT file.
 * Copyright © 2014-2015 The developers of java2c. See the COPYRIGHT file in the top-level directory of this distribution and at https://raw.githubusercontent.com/raphaelcohn/java2c/master/COPYRIGHT.
 */

package com.java2c.transpiler.fieldAttributesProcessors;

import com.java2c.transpiler.c.gccAttributes.GccAttribute;
import com.java2c.transpiler.c.gccAttributes.variable.GccVariableAttributeName;
import com.java2c.transpiler.elementConverters.ConversionException;
import org.jetbrains.annotations.NotNull;

import javax.lang.model.element.VariableElement;
import java.util.Collection;

public interface FieldAttributesProcessor
{
	void processField(@NotNull final Collection<GccAttribute<GccVariableAttributeName>> gccAttributes, @NotNull final VariableElement field) throws ConversionException;
}
