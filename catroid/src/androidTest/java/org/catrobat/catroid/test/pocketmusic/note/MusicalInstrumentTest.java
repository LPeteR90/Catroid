/*
 * Catroid: An on-device visual programming system for Android devices
 * Copyright (C) 2010-2018 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * An additional term exception under section 7 of the GNU Affero
 * General Public License, version 3, is available at
 * http://developer.catrobat.org/license_additional_term
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.test.pocketmusic.note;

import android.support.test.runner.AndroidJUnit4;

import org.catrobat.catroid.pocketmusic.note.MusicalInstrument;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class MusicalInstrumentTest {

	@Test
	public void testGetInstrumentFromProgram1() {
		MusicalInstrument expectedInstrument = MusicalInstrument.GUNSHOT;

		assertGetInstrumentFromProgram(expectedInstrument.getProgram(), expectedInstrument);
	}

	@Test
	public void testGetInstrumentFromProgram2() {
		int invalidProgram = 0;

		assertGetInstrumentFromProgram(invalidProgram, MusicalInstrument.ACOUSTIC_GRAND_PIANO);
	}

	private void assertGetInstrumentFromProgram(int program, MusicalInstrument expectedInstrument) {
		MusicalInstrument actualInstrument = MusicalInstrument.getInstrumentFromProgram(program);
		assertEquals(expectedInstrument, actualInstrument);
	}
}
