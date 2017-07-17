/* 
* Copyright 2015 Caplogic AB. 
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
*/
package io.mappedbus;

/**
 * Class with constants.
 *
 */
class MappedBusConstants {

	static class Structure {
		
		public static final int LIMIT = 0;
		
		public static final int DATA = Length.LIMIT;
		
	}

	static class Length {
		
		public static final int LIMIT = 8;
		
		public static final int COMMIT = 1;
		
		public static final int ROLLBACK = 1;
		
		public static final int METADATA = 4;
		
		public static final int STATUS_FLAGS = COMMIT + ROLLBACK;

		public static final int RECORD_HEADER = COMMIT + ROLLBACK + METADATA;

	}

	static class Commit {
		
		public static final byte NOT_SET = 0;
		
		public static final byte SET = 1;
		
	}
	
	static class Rollback {

		@SuppressWarnings("unused")
		public static final byte NOT_SET = 0;
		
		public static final byte SET = 1;
		
	}
}