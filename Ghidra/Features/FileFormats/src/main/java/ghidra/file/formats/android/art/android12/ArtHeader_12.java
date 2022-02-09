/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.file.formats.android.art.android12;

import java.io.IOException;

import ghidra.app.util.bin.BinaryReader;
import ghidra.file.formats.android.art.android11.ArtHeader_11;
import ghidra.program.model.data.DataType;
import ghidra.program.model.data.Structure;
import ghidra.util.InvalidNameException;
import ghidra.util.exception.DuplicateNameException;

/**
 * https://android.googlesource.com/platform/art/+/refs/heads/android-s-beta-4/runtime/image.h#418
 * https://android.googlesource.com/platform/art/+/refs/heads/android-s-beta-4/runtime/image.cc#33
 * 
 * https://android.googlesource.com/platform/art/+/refs/heads/android-s-beta-5/runtime/image.h#418
 * https://android.googlesource.com/platform/art/+/refs/heads/android-s-beta-5/runtime/image.cc#33
 * 
 * https://android.googlesource.com/platform/art/+/refs/heads/android12-release/runtime/image.h#418
 * https://android.googlesource.com/platform/art/+/refs/heads/android12-release/runtime/image.cc#33
 */
public class ArtHeader_12 extends ArtHeader_11 {

	public ArtHeader_12(BinaryReader reader) throws IOException {
		super(reader);
	}

	@Override
	public DataType toDataType() throws DuplicateNameException, IOException {
		Structure structure = (Structure) super.toDataType();
		try {
			structure.setName(ArtHeader_12.class.getSimpleName());
		}
		catch (InvalidNameException e) {
			// ignore
		}
		return structure;
	}
}
