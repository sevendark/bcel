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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package net.imadz.org.apache.bcel.generic;

/** 
 * FSTORE - Store float into local variable
 * <PRE>Stack: ..., value -&gt; ... </PRE>
 *
 * @version $Id: FSTORE.java 1152072 2011-07-29 01:54:05Z dbrosius $
 * @author  <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 */
public class FSTORE extends StoreInstruction {

    private static final long serialVersionUID = 2587266679484598179L;


    /**
     * Empty constructor needed for the Class.newInstance() statement in
     * Instruction.readInstruction(). Not to be used otherwise.
     */
    FSTORE() {
        super(net.imadz.org.apache.bcel.Constants.FSTORE, net.imadz.org.apache.bcel.Constants.FSTORE_0);
    }


    /** Store float into local variable
     * @param n index of local variable
     */
    public FSTORE(int n) {
        super(net.imadz.org.apache.bcel.Constants.FSTORE, net.imadz.org.apache.bcel.Constants.FSTORE_0, n);
    }


    /**
     * Call corresponding visitor method(s). The order is:
     * Call visitor methods of implemented interfaces first, then
     * call methods according to the class hierarchy in descending order,
     * i.e., the most specific visitXXX() call comes last.
     *
     * @param v Visitor object
     */
    @Override
    public void accept( Visitor v ) {
        super.accept(v);
        v.visitFSTORE(this);
    }
}
