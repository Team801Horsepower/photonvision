/*
 * Copyright (C) Photon Vision.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.photonvision.vision.pipeline;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.photonvision.common.util.numbers.DoubleCouple;
import org.photonvision.vision.processes.PipelineManager;

@JsonTypeName("PythonPipelineSettings")
public class PythonPipelineSettings extends CVPipelineSettings {
    public DoubleCouple offsetPoint = new DoubleCouple();

    public PythonPipelineSettings() {
        super();
        pipelineNickname = "Python Pipe";
        pipelineIndex = PipelineManager.PYTHON_INDEX;
        pipelineType = PipelineType.Python;
        inputShouldShow = true;
    }
}
