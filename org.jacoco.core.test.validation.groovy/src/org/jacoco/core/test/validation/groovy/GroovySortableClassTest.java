/*******************************************************************************
 * Copyright (c) 2009, 2019 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stephan Classen
 *    Vadim Bauer
 *
 *******************************************************************************/
package org.jacoco.core.test.validation.groovy;

import org.jacoco.core.test.validation.ValidationTestBase;
import org.jacoco.core.test.validation.groovy.targets.GroovySortableClassTarget;
import org.junit.Test;

/**
 * Test of {@link groovy.transform.Sortable} annotation.
 */
public class GroovySortableClassTest extends ValidationTestBase {
    public GroovySortableClassTest() {
        super(GroovySortableClassTarget.class);
    }

    @Test
    public void test_method_count() {
        // the method count is 2 because the sortable annotation
        // generates a static block.
        assertMethodCount(2);
    }
}
