/*******************************************************************************
 * Copyright 2014 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/



import java.io.InputStream;

import java.io.Reader;
import java.util.List;

public class Test {
	
	String A[];
	String B[][];
	
	public String bar() {
		return null;
	}
	
	public void foo() {
		String tmpA = B[0] + B[0][0];
		String tmpB = B[0] + A[0];
		String tmpC = B[0] + this.A[0];
		String tmpH = "" + B[0];
		String tmpD = bar() + B[0];
		String tmpE = super.toString() + B[0];
		String tmpF = (tmpA = bar()) + B[0];
	}
}