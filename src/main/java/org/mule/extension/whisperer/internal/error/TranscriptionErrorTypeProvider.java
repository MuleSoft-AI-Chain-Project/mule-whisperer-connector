package org.mule.extension.whisperer.internal.error;

import org.mule.extension.whisperer.api.error.ConnectorError;
import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.HashSet;
import java.util.Set;

public class TranscriptionErrorTypeProvider implements ErrorTypeProvider {
    @Override
    public Set<ErrorTypeDefinition> getErrorTypes() {
        Set<ErrorTypeDefinition> errorTypes = new HashSet<>();
        errorTypes.add(ConnectorError.TRANSCRIPTION);
        errorTypes.add(ConnectorError.TIMEOUT);
        errorTypes.add(ConnectorError.AUDIO_FORMAT_NOT_SUPPORTED);
        errorTypes.add(ConnectorError.MODEL_SETUP_FAILURE);
        return errorTypes;
    }
}
